import java.io.FileReader;

public class Runner {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("hellofile.txt");
        String data = "";
        int val = fr.read();

        while (val != -1) {
            data = data + (char) val;
            val = fr.read();
        }

        System.out.println(data);
        fr.close();

    }

}
