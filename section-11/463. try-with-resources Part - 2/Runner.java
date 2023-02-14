import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Runner {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {

            fis = new FileInputStream("one/data.txt");
            int size = fis.available();
            byte[] b = new byte[size];
            fis.read(b);

            fos = new FileOutputStream("two/writtenData.txt");
            fos.write(b);

            System.out.println("Data transfered.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fis.close();
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
