import java.io.FileOutputStream;

public class Runner {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("abc.txt", true);
        // if append parameter(2nd argument of FileOutPutStream above) is true content
        // will be appended to the existing content. If false
        // the content will be overwritten

        String data = "Burning the midnight oil here";
        byte[] b = data.getBytes();

        fos.write(b);

        System.out.println("Data transfered form java application to target file abc.txt");

        fos.close();
    }
}
