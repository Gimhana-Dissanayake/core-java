import java.io.FileInputStream;
import java.io.FileOutputStream;

// Q. write a java program to transfer an image data from one image directory to
// another image directory

// Ans: Image data is existed in the form of bits, it is supported by only Byte
// Oriented Streams.

// To copy image data from one image file to another image file we must perform
// the following two operations.
// 1. Read image data from souce file.
// 2. Write image data to target file.

// To read image data from source file we have to use "FileInputStream". To
// Write image data to target file we have to use "FileOutputStream".

// EX: 
public class Runner {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("imgs1/two.jpg");

        int size = fis.available();
        byte[] b = new byte[size];

        fis.read(b);

        FileOutputStream fos = new FileOutputStream("imgs2/twomoved.jpg");
        fos.write(b);

        System.out.println("File is moved");

        fis.close();
        fos.close();
    }
}
