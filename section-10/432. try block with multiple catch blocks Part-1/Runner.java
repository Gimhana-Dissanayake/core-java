
// Q) Is it possible to provide more than one catch block for single try block?

// Ans. Yes, it is possible to provide more than one catch block for single try
// block, with the fallowing conditions

// 1. If Ihneritance relation is existed between execption classes which are
// providied along with catch block then we have to arrange all the catch block
// as per Exception classes inheritance increasing order.If inheritance realtion
// is not existed between Exception classes which are sprcified along with catch
// blocks then it is possible to arrange catch blocks in any order

public class Runner {
    public static void main(String[] args) {
        try {
        } catch (ArithmeticException e) {
        } catch (NullPointerException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        // status: Valid

        try {
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (NullPointerException e) {
        } catch (ArithmeticException e) {
        }
        // status: Valid

        try {
        } catch (NullPointerException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (ArithmeticException e) {
        }
        // status: Valid

        try {
        } catch (ArithmeticException e) {
        } catch (RuntimeException e) {
        } catch (Exception e) {
        }
        // status: Valid

        try {
        } catch (Exception e) {
        } catch (RuntimeException e) {
        } catch (ArithmeticException e) {
        }
        // status: Invalid

    }
}