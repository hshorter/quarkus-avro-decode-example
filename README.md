# quarkus-avro-decode-example

Class org.apache.avro.specific.SpecificDatumReader is added to build time initialization by Quarkus, but it is also flagged for run time 
initialization due to thread usage.

Build native image:

```console
 docker build -t examples/avro-decode-example:latest .
 ```
 Error will be:
 
 ```console
 Error: Classes that should be initialized at run time got initialized during image building:
 org.apache.avro.specific.SpecificDatumReader the class was requested to be initialized at build time (from the command line).  To see why org.apache.avro.specific.SpecificDatumReader got initialized use -H:+TraceClassInitialization
 ```
 
 Remove run time initialization from application.properties:
 --initialize-at-run-time=org.apache.avro.specific.SpecificDatumReader
 
 And re-run for new error:
 ```console
 Error: Detected a started Thread in the image heap. Threads running in the image generator are no longer running at image run time.  To see how this object got instantiated use -H:+TraceClassInitialization. The object was probably created by a class initializer and is reachable from a static field. You can request class initialization at image run time by using the option --initialize-at-build-time=<class-name>. Or you can write your own initialization methods and call them explicitly from your main entry point.
Detailed message:
Trace: 	object org.apache.avro.specific.SpecificDatumReader
 ```
 
 
 
 
