public class Runner {

    public static void main(String[] args) {
        int i = 100;
        int j = 0;
        float f = i / j;
        System.out.println(f);
    }

}
// Overview of predefined exceptions:
// 1. ArithmaticException:
// In java applications, when we divide a number by zero[0] there JVM will raise
// ArithmaticException

// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.ArithmeticException
// 2. Exception Description: / by zero
// 3. Exception Location: Test.java: 7(line number)