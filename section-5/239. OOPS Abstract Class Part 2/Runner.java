
abstract class A {
    void m1() {
        System.out.println("m1-A");
    }

    void m2() {
        System.out.println("m2-A");
    }

    void m3() {
        System.out.println("m3-A");
    }
}

class B extends A {

}

public class Runner {

    // In java applications, it is possible to declare an abstract class with out
    // abstract methods and with full of concrete methods, there is no condition to
    // have atleast one abstract method in an abstract class.

    // Even though all the methods are concrete we still can't create objects from
    // an abstract class, so we have to extend the abstract class if we want to
    // access the methods

    public static void main(String[] args) {
        A a = new B();
        a.m1();
        a.m2();
        a.m3();
    }

}
