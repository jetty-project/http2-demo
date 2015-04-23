== HTTP/2 Push Demo

=== Instructions

[source,bash]
----
$ mvn clean install
$ mvn jetty:run-forked
----

=== JDK Dependency

You need JDK 8 or greater to run this demo.

This demo uses ALPN to run HTTP/2.

The JDK version used to run this demo and the ALPN version 
specified in +pom.xml+ must be compatible as specified in the
https://www.eclipse.org/jetty/documentation/current/alpn-chapter.html#alpn-versions[JDK/ALPN Table].
