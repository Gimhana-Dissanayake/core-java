
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Before try block");
        try {
            System.out.println("Inside try block, Before exception");
            int i = 100;
            int j = 0;
            float f = i / j;
            System.out.println("Inside try block, After exception");
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("After finally block");

    }
}
// Q. Is it possible to write try block without catch block?
// Ans:
// Yes, It is possible to write try block without catch block, but, we must
// provide finally block.

// In the above case, if we have any exception in try block then default
// exception handler will take that exception and it wil lterminate the program
// after executing try and finally block.

// watch the lecture
