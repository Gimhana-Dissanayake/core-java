
public class Runner {

    // Class level type casting

    // 1. primitive data types type casting
    // 1. Implicit type casting
    // 2. Explicit type casting

    // 2. User defined data types type casting

    // It is the process of convering data from one user defined daa type to another
    // user defined data type

    // NOTE: To perform user defined data types type casting we need either
    // "extends" or "implements" relationship between two user defined data types

    // There are two types of user defined data types type castings.
    // 1. Upcasting
    // 2. Downcasting

    // 1. Upcasting
    // The process of converting data from sub class type to super class type is
    // called as upcasting

    // To peform upcasting, we hwve to assign sub class reference variable to super
    // class reference variable.

    public static void main(String[] args) {
        B b = new B();
        A a = b;// upcasting
        a.m1();

        A a1 = new B(); // Upcasting
        a.m1();
    }

}

class A {
    void m1() {
        System.out.println("m1-A");
    }
}

class B extends A {
    void m2() {
        System.out.println("m2-B");
    }
}