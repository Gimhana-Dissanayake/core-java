
class A {
    A() {
        System.out.println("A-Con");
    }

    A(int i) {
        System.out.println("A-int-param-con");
    }

    A(double i) {
        System.out.println("A-float-param-con");
    }
}

class B extends A {
    B() {
        // without executing the zero arg constructor if you want to execute a different
        // constructor use super keyword

        // super keyword should be used as the first statement only

        // call to super keyword should be in constructor only
        super(10);
        // super(22.22); //this will raise an error
        System.out.println("B-Con");

    }
}

public class Runner {

    // Q. Is it possible to refer more than one super class constructors from single
    // sub class constructor by using "super" keyword?

    // Ans
    // No, it is not possible to refer more than one super class construcotr from
    // single sub class constructor by using super keyword, because, super statment
    // mus be first statement in sub class constructor.

    public static void main(String[] args) {
        B b = new B();

    }
}
