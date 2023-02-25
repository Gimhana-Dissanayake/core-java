public class Runner {
    public static void main(String[] args) {
        System.out.println("Before try block");
        try {
            System.out.println("Inside try block, Before Exception");
            int i = 100;
            int j = 0;
            float f = i / j;
            System.out.println("Inside try block, After Exception");
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("After try block");
    }
}
