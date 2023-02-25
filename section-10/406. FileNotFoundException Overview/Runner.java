
// 11. FileNotFoundException:
// In java applications, if we want to read data from a particular file then we have to use java.io.FileInputStream. To get data from a particular source by using FileInputStream we have to create FileInputStream class object.

// FileInputStream fis = new FileInputStream('abc.txt')

// When we execute the above code, JVM will perform the following actions.

// 1. JVM will search for the provided source file at current location or at the specified location.

// 2. If the specified source file is existed then JVM will create FileInputStream.

// 3. If the specified source file is not existed then JVM will raise an exception like java.io.FileNotFoundException.

public class Runner {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("abc.txt");
    }

}
