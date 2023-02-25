
// Q. Is it possible to write try-catch-finally inside finally block?

// Ans:
// Yes, it is possible to write try-catch-finally inside finally block

public class Runner {
    public static void main(String[] args) {
        try {

            System.out.println("Before outer try");

        } catch (Exception e) {

            System.out.println("Inside Outer catch");

        } finally {

            System.out.println("Inside outer finally, before try");
            try {
                System.out.println("Inside nested try, before exception");

                float f = 100 / 0;

                System.out.println("inside nested try, after exception");
            } catch (Exception e) {
                System.out.println("Inside nested catch");
            } finally {
                System.out.println("Inside nested finally");
            }

            System.out.println("Inside outer finally, after nested finally");
        }
        System.out.println("After outer finally");
    }
}