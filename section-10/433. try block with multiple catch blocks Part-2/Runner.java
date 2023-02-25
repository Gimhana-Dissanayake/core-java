public class Runner {

    public static void main(String[] args) {
        try {

            // java.util.Date d = null;
            // System.out.println(d.toString());

            // int i = 100;
            // int j = 0;
            // float f = i / j;

            int[] a = { 10, 20, 13, 465, 58, 465 };
            System.out.println(a[51]);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}
