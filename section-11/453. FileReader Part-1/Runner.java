public class Runner {

}
// It is same as FileInputStream, but, FIleRead is character Oriented Stream and
// FileInputStream is Byte Oriented Stream.

// It can be used to read data from a particular source file to java
// application.

// Steps:
// 1. Create FileReader from source file to java application.

// FileReader fr = new FileReader("abc.txt");

// When we execute the above instruction, JVM will perform the following
// actions.

// a) JVM will take the provided name and location of the source file and JVM
// will search for the source file at the specified location.

// b) If the provided source file is not existed at the specified location then
// JVM will raise an exception like "java.io.FileNotFoundException".

// c) If the specified source file is existed at the specified location then JVM
// will creat Filereader from source file to java application and the data which
// is existed in source file will be send to FileReader.

// watch the lecture