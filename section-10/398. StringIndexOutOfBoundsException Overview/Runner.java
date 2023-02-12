public class Runner {

    public static void main(String[] args) {
        String data = new String("Gimhana");
        System.out.println(data.charAt(2));
        System.out.println(data.charAt(10));
    }

}

// StringIndexOutOfBoundsException:
// In java applications, when we perform manipulations on a string on the basis
// of an index value which is in out side range of the String indexes there JVM
// will raise StringIndexOutOfBoundsException

// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.StringIndexOutOfBoundsException
// 2. Exception Description: String index out of range: 10
// 3. Exception Location: Test.java: 9(line number)