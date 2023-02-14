import java.io.FileReader;
import java.io.FileWriter;

public class Runner {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("MultiCurrencyMoney.pdf");
        String data = "";
        int val = fr.read();
        while (val != -1) {
            data = data + (char) val;
            val = fr.read();
        }

        FileWriter fw = new FileWriter("moved/MultiCurrencyMoneyMoved.pdf");
        char[] ch = data.toCharArray();

        fw.write(ch);

        System.out.println("Data transfered");

        fr.close();
        fw.close();

    }
}
