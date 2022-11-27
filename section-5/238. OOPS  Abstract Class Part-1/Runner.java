abstract class A {
    void m1() {
        System.out.println("m1-A");
    }

    abstract void m2();

    abstract void m3();
}

class B extends A {

    @Override
    void m2() {
        System.out.println("m2-B");

    }

    @Override
    void m3() {
        System.out.println("m3-B");

    }

    void m4() {
        System.out.println("m4-B");
    }

}

public class Runner {

    public static void main(String[] args) {
        // A a = new A();object creation is not possible for A;
        A a = new B();

        a.m1();
        a.m2();
        a.m3();
        // a.m4();this will give a compilation error

        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();
    }

    // In java applications, if we declare an abstract class with abstract methods
    // then it is convention to take a sub class for abstract class and it is
    // convetion to provide implementation for all methods of abstract class inside
    // the sub class.
}
