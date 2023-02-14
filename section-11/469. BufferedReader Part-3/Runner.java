import java.io.BufferedReader;
import java.io.InputStreamReader;

// Q) what is the difference between readLine() and read()?

// Ans: readLine() can be used to read aline of data from BufferedReader as String.
// public String readLine()
// read() method is able to read single character from BufferedReader in the form of ASCII value.
// public int read()
public class Runner {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Data: ");
        String data = br.readLine();
        System.out.print("Enter the same Data Again: ");
        int val = br.read();
        System.out.println("readLine() : " + data);
        System.out.println("read() : " + val + "[" + (char) val + "]");
    }
}
