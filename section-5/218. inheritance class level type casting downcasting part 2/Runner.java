
class A {

}

class B extends A {

}

class C extends B {

}

class D extends C {

}

public class Runner {

    public static void main(String args[]) {

        A a = new A();
        // B b = a; Status - Compilation error. Direct assignment is not allowed from
        // super class to subclass

        A a1 = new A();
        B b1 = (B) a1;
        // Status - No compilation error but ClassCastException

        A a2 = new B();
        B b2 = (B) a2;
        // Status - No compilation error, No exceptions

        A a3 = new D();
        B b3 = (C) a3;
        // Status - no compilation error, no exception

        A a4 = new C();
        D d4 = (D) a4;
        // Status - No compilation error, ClassCastException

        A a5 = new D();
        C c5 = (D) a5;
        // Status - No compilation error, No Exception

        A a6 = new D();
        D d6 = (D) (C) (B) a6;
        // Status - No compilation error

        A a7 = new C();
        C c7 = (D) (C) (B) a7;
        // Status - No compilation error, ClassCastException

    }

}
