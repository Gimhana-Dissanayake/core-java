public class Runner {
    public static void main(String[] args) {
        System.out.println("Before outer try");
        try {
            System.out.println("Inside outer try, before nested try");
            try {
                System.out.println("Inside nested try, before exception");
                float f = 100 / 0;
                System.out.println("inside nested try, after exception");
            } catch (Exception e) {
                System.out.println("Inside nested catch");
            } finally {
                System.out.println("Inside nested finally");
            }

            System.out.println("Inside outer try, after nested finally");
        } catch (Exception e) {
            System.out.println("Inside outer catch");
        } finally {
            System.out.println("Inside outer finally");
        }
        System.out.println("After outer finally");
    }
}
