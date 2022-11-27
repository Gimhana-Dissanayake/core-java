
class A {
    void m1() {
        // Old functionality
    }
}

class B extends A {
    void m1() {
        // New functionality
    }
}

public class Runner {

    // Steps to perform method overrding
    // 1. Declare a super class with a method which we want to override
    // 2. Declare a sub class with the same super class method with the difference
    // implementation
    // 3. In main class, in main() method, access super class method but execute sub
    // class method

    public static void main(String args[]) {
        // CASE -1
        A a = new A();
        a.m1();
        // Status: Invalid, where Method overriding was not happend, because, Method
        // overriding requrires sub class object, not super class object

        // CASE -2
        B b = new B();
        b.m1();
        // To prove method overriding we have access superclass method but we have to
        // execute sub class method

        // Status: Method Overriding happens here, but, to prove method overriding we
        // must acess superclass method and we have to get output from sub class method,
        // to achieve this we need super class reference variable, not sub class
        // reference variable.

        A a1 = new B();
        a1.m1();
        // Here object is created for sub class and reference variable is created for
        // Super class

        // Status: Method overriding happens here and we can prove method overriding

    }

}
