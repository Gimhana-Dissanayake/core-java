import java.io.IOException;

// 2. If any catch has pure checked exception then the respective try block must raise the same pure checked exception otherwise compiler will raise an error

public class Runner {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Arithmatic Exception happend");
        } catch (ArithmeticException e) {
        } catch (IOException e) {// pure checked exception
        } catch (NullPointerException e) {
        }
        // Status: Invalid

        try {
            throw new IOException("Arithmatic Exception happend");
        } catch (ArithmeticException e) {
        } catch (IOException e) {// pure checked exception
        } catch (NullPointerException e) {
        }
        // Status: Valid
    }
}
// watch the lecture