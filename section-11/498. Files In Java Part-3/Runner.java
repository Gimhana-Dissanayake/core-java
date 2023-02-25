import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// If we want to send data to a particular file represented int he form of File Class object by using FileOutStream or FileWriter then we have to use the following constructors
// public FileOutputStream(File file)
// public FileWriter(File file)
// If we want to get the data from a particular file which is represented in the form of File class object then we have to use the following constructors of FileInputStream and FileReader.
// public FileInputStream(File file)
// public FileReader(File file)
public class Runner {

  public static void main(String[] args) throws IOException {
    File file = new File("welcome.txt");
    file.createNewFile();

    FileOutputStream fos = new FileOutputStream(file);

    String data = "welcome to cool cabin";

    byte[] b = data.getBytes();
    fos.write(b);

    System.out.println("Data send to welcome.txt");

    System.out.println("Reading data ");

    FileInputStream fis = new FileInputStream(file);
    int size = fis.available();
    byte[] bArray = new byte[size];

    fis.read(bArray);

    String txt = new String(bArray);

    System.out.println(txt);

    fos.close();
  }
}
