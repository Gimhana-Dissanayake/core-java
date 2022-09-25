
class A {
    A() {
        System.out.println("A-Con");
    }
}

class B extends A {
    B() {
        System.out.println("B-Con");
    }
}

class C extends B {
    C() {
        System.out.println("C-Con");
    }
}

class X {
    X() {
        System.out.println("X-Con");
    }
}

class Y extends X {
    // A default zero argument constructor will be added by the JVM
}

class Z extends Y {
    Z() {
        System.out.println("Z-Con");
    }
}

public class Runner {
    // Instance context in inheritance
    // There are three elements in instance context
    // 1. Instance variables 2. Instance methods 3. Instance blocks

    // Instance variables and instance blocks are recognized and executed just
    // before executing the respective class constructor

    // Instance methods are recognized and executed the moment when we access the
    // respective method.

    // In Inheritance, when we call sub class constructor then JVM will execute
    // super class 0-args constructor first then only JVM will execute sub class
    // constructor.

    public static void main(String[] args) {
        C c = new C();
        System.out.println("---------------");
        Z z = new Z();
    }

}
