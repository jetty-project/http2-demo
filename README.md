== HTTP/2 Push Demo

=== Instructions

This demo runs on any OS.

Under Linux, you can execute `simulate-roundtrip.sh` before launching 
the demo to simulate a 250 ms roundtrip delay between client and server.
This is done to try to simulate a real network, otherwise the speed of
the loopback interface (localhost) makes _any_ protocol appear fast. 

[source,bash]
----
$ mvn clean install
$ ./simulate-roundtrip.sh
$ mvn jetty:run-forked
----

=== JDK Dependency

You need JDK 8 or greater to run this demo.

This demo uses ALPN to run HTTP/2.

The JDK version used to run this demo and the ALPN version 
specified in `pom.xml` must be compatible as specified in the
https://www.eclipse.org/jetty/documentation/current/alpn-chapter.html#alpn-versions[JDK/ALPN Table].
