import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Runner {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("MultiCurrencyMoney.pdf");
        int size = fis.available();
        byte[] b = new byte[size];
        fis.read(b);

        FileOutputStream fos = new FileOutputStream("moved/MultiCurrencyMoneyMoved.pdf");
        fos.write(b);

        System.out.println("Character data transfered");

        fis.close();
        fos.close();
    }

}

// Q. Write a java progrma to copy characters data from one docx file to another
// docx file?

// Ans:
// To copy characters data from one docx file to another docx file we will use
// both BYte orientd streams and character oriented streams.

// Byte Orient Streams:
// ------------------------
// FileInputStreams;
// FileOutputStreams

// Character Oriented Streams:
// ------------------------
// FileReader
// FileWriter