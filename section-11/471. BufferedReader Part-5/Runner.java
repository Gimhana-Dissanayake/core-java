import java.io.BufferedReader;
import java.io.InputStreamReader;

// Drawback with BufferedReader:
// If we want ot read primitive data as dynmic input then we have to follow the fallowing two steps.
// 1. Read primitive data as String by using readLine()
// 2. Convert data from String type to the respective primitive type by using Wrapper classes

// EX:
// 
public class Runner {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("First Value: ");
        String fVal = br.readLine();
        System.out.println("Second Value: ");
        String sVal = br.readLine();
        System.out.println("Concatenation : " + (fVal + sVal));
        int val1 = Integer.parseInt(fVal);
        int val2 = Integer.parseInt(sVal);

        System.out.println("Arithmatic Addition :" + (val1 + val2));

    }
}
