import java.io.FileInputStream;
import java.io.FileOutputStream;

// All the resources which we provided must implement java.lang.AutoCloseable
// marker interface either directly or indirectly.

// All the resources reference variables are converted as final variables.

public class Runner {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source/sourceFile.txt");
                FileOutputStream fos = new FileOutputStream("target/targetFile.txt")) {

            int size = fis.available();
            byte[] b = new byte[size];
            fis.read(b);

            fos.write(b);
            System.out.println("Data transfered..");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// watch the lecture