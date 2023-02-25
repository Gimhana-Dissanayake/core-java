
// Q. Is it possible to write try-catch-finally inside catch block?
// Ans: Yes, it is possible to write try-catch-finally inside catch block

public class Runner {
    public static void main(String[] args) {
        System.out.println("Before outer block");
        try {
            System.out.println("Inside outer try");

        } catch (Exception e) {
            System.out.println("Inside outer catch, before nested try");

            try {
                System.out.println("Inside nested try");
            } catch (Exception ex) {
                System.out.println("Inside nested catch");
            } finally {
                System.out.println("Inside nested finally");
            }

            System.out.println("Inside outer catch, after nested finally");

        } finally {
            System.out.println("Inside outer finally");
        }

        System.out.println("After outer finally ");
    }
}