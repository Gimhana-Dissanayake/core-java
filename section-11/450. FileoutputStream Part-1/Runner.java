public class Runner {

}
// 1. FileOutputStream:

// It is a Byte Oriented Stream, it can be used to send data from Java
// application to a particular target file.

// Steps:
// 1. Create FileOutputStream from java applications to the specified target
// file.

// FileOutputStream fos = new FileOutputStream("abc.txt");

// a) JVM will check whether the specified abc.txt is avaiable at the specified
// location or not.

// b) If the specified abc.txt file is existed at the specified location then
// JVM will create FileOutputStream from java application to the provided target
// file.

// c) If the specified target file abc.txt is not existed at the specified
// location there JVM will create new file with the specified name abc.txt then
// JVM will create FileOutputStream.

// NOTE: FileNotFoundException is not possible with FileOutPutStream.