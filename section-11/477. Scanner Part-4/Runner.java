
// Q. What is the difference between nextLine() and next()?

// Ans. In Scanner class, nextLine() method is able to read a line of data as
// dyanmic input in the form of String, here line of data may contains mulitple
// words.
// public String nextLine()

// In Scanner class, next() method is able to read single word as dyanmic input
// in the form of String.
// public String next()

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Data: ");
        String data1 = s.nextLine();
        System.out.println("Enter the same data again: ");
        String data2 = s.next();
        System.out.println("nextLine() : " + data1);
        System.out.println("next() : " + data2);
        s.close();
    }
}
