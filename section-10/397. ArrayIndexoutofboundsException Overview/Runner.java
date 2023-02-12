public class Runner {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };
        System.out.println(a[2]);
        System.out.println(a[4]);
        System.out.println(a[10]);// exception when getting elements

        int[] a1 = new int[4];
        a1[0] = 10;
        a1[1] = 20;
        a1[2] = 30;
        a1[3] = 40;
        al[4] = 50; // exception when inserting elements
    }
}

// In java application, when we are trying to access an element from an array on
// the basis of index value which is in out side range of array indexes there
// JVM will raise ArrayIndexOutOfBoundsException

// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.ArrayIndexOutOfBoundsException
// 2. Exception Description: Index 10 out of bounds for length 6
// 3. Exception Location: Test.java: line number

// Note: In java applications, when we are trying to insert an element in an
// array on the basis of index value, where the provided index value is in out
// side of the array indexes there JVM will raise
// ArrayIndexOutOfBoundsException.
