import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {

  public static void main(String[] args) throws IOException {
    File file = new File("hello.txt");
    file.createNewFile();
    FileWriter fw = new FileWriter(file);
    String data = "Welcome sunshine";
    char[] ch = data.toCharArray();
    fw.write(ch);
    System.out.println("Data send to hello.txt");
    fw.close();

    FileReader fr = new FileReader(file);
    String dataNew = "";
    int val = fr.read();
    while (val != -1) {
      dataNew = dataNew + (char) val;
      val = fr.read();
    }
    System.out.println(dataNew);
    fr.close();
  }
}
