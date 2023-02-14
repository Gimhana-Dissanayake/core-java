import java.io.FileInputStream;

public class Runner {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("dummy.txt");
        int size = fis.available();
        byte[] b = new byte[size];
        fis.read(b);
        String data = new String(b);
        String[] tokens = data.split(" ");
        System.out.println("Number of Words: " + tokens.length);
        int count = 0;
        for (String token : tokens) {
            if (token.equals("the")) {
                count = count + 1;
            }
        }

        System.out.println("'the' word is repeated " + count + " times");

        fis.close();
    }

}

// Q. Write a java program to read data from a particular file and count the
// number of words which are existed in the file and count the number of times
// the word 'the' is repreated

// Ans:
