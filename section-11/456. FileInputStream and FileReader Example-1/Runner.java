import java.io.*;

public class Runner {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        FileInputStream fis = new FileInputStream(fileName);
        int size = fis.available();
        byte[] b = new byte[size];
        fis.read(b);
        String data = new String(b);
        System.out.println(data);
        fis.close();

        // using the FileReader
        String fileName2 = args[0];
        FileReader fr = new FileReader(fileName2);
        String data1 = "";
        int val1 = fr.read();

        while (val1 != -1) {
            data1 = data1 + (char) val1;
            val1 = fr.read();
        }
        System.out.println(data1);
        fr.close();
    }
}

// Q. Write a java program to display the content of particular file on command
// prompt by taking file name as command Line Argument?

// Ans:
// To Read data from a file and to display that data o command promp we have to
// use either FileInputStream or FileReader.
