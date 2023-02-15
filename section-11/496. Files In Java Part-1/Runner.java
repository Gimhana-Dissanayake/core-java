import java.io.File;

public class Runner {

    public static void main(String[] args) throws Exception {
        File f = new File("data.txt");
        System.out.println("is File is created? " + f.isFile());
        f.createNewFile();
        System.out.println("is File is created now? " + f.isFile());
    }

}
// File Systems in Java:
// File is a storage area, it able to store data permantly.
// There are two types of files in java.
// 1. Sequenctial Files.
// 2. Random Access Files.

// 1. Sequential Files:
// It allows to read data in sequenctial manner.
// To represent sequential files, java has provided a predefined class in the
// form of "java.io.File"

// To create File class object we have to use the following statement.
// File f = new File("location of file and name of the file")
// If we create File class object, only an object will be created for
// java.io.File class, it will not create a file with name emp.txt at system
// hard disk.

// After creating java.io.File class object, if we want to create a file really
// at system hard disk then we have to use the following method.

// public File createNewFile()
// f.createNewFile();

// To check whether the created one is File or not we have to use the following
// method.
// public boolean isFile()
// boolean b = b.isFile();