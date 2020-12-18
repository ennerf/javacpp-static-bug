# JavaCpp Issue

We are running into an issue where it throws an error because it expects a `.dll` even though it's using a static library.

Requirements

* Visual Studio 2019
* Maven 3
* JDK 8 or higher

Commandline build

* vcvars.bat (once)
* mvn clean compile package

(We need to run two compile targets because the parsing step generates the JNI wrappers too late to be included in the compilation)
