import java.io.FileReader;

public class Runner {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("dummy.txt");
        String data = "";
        int val = fr.read();
        while (val != -1) {
            data = data + (char) val;
            val = fr.read();
        }
        String[] tokens = data.split(" ");
        System.out.println("Number of Words: " + tokens.length);
        int count = 0;
        for (String token : tokens) {
            if (token.equals("and")) {
                count = count + 1;
            }
        }

        System.out.println("'and' word is repeated " + count + " times");

        fr.close();

    }
}
