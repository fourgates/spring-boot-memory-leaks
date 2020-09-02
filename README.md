# Memory Leak Examples

This is an application to demonstrate how to produce, monitor, and fix memory leaks.

See my [blog posts](https://blog.phillipninan.com/2020/08/19/diagnose-memory-leaks-in-spring-boot-with-visual-vm/)

if you have docker install simply run:

```
docker-compose up profile
```

or run the following command to be able to profile the application using Visual VM

```
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9010 -Dcom.sun.management.jmxremote.rmi.port=9010 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=localhost"
```