import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Date d = null;
        // System.out.println(d.toString());//gives null pointer

        A a = null;
        System.out.println(a.i);
        a.m1();

    }

}

class A {
    static int i = 10;

    static void m1() {
        System.out.println("m1-A");
    }
}

// In java application, when we access any instance variable or instance method
// over a reference varialbe contains null value there JVM will raise an
// exception like NullPointerException.

// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.NullPointerException
// 2. Exception Description: Cannot invoke
// 3. Exception Location: Test.java: line number

// NOTE: In java NullPointerException is possible for only instance variables
// and instance methods, NullPointerException is not applicable for static
// variables and static methods.