// JAR Files in Java:
// ----------------------------
// JAR -----> Java Archieve

// JAR Files are able to represent or store a set of .class either directly or in the form of packages.

// In Java applications, we are able to utilize JAR files in the following situations.

// 1. To share bulk of .class files from one computer to another computer through network

// 2. To upload and to download software which contains bulk of .class files

// To create JAR files, we have to use the fallowing command.

// jar -cvf fileName.jar *

// cvf -> create verbose file

// To extract JAR file content to the memory we will use the following command.

// jar -xvf

// xvf -> extract verbose file

// After creating JAR file, if we want to access the content from jar file then we have to set 'classpath' env variable.

// set classpath=jarFileLocation/fileName.jar

public class Runner {

}
