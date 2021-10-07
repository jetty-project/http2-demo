package org.eclipse.jetty.spdy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SlowImageServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.addHeader("Cache-control", "no-store, no-cache, must-revalidate");
        response.addDateHeader("Last-Modified", 0);
        response.addDateHeader("Expires", 0);

        String path = request.getRequestURI();
        InputStream input = getServletContext().getResourceAsStream(path);
        OutputStream output = response.getOutputStream();
        byte[] buffer = new byte[4 * 1024];
        int read;
        while ((read = input.read(buffer)) >= 0)
        {
            output.write(buffer, 0, read);
        }
    }
}
