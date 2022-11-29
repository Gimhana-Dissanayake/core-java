
class A {
    void m1() {
        System.out.println("m1-A");
    }
}

abstract class B extends A {
    abstract void m2();
}

class C extends B {
    void m2() {
        System.out.println("m2-C");
    }
}

public class Runner {
    // In java applications, it is possible to extend an abstract class to concrete
    // class and it is possible to extend a concreate class to abstract class

    public static void main(String[] args) {
        A a = new C();
        a.m1();

        B b = new C();
        b.m1();
        b.m2();

        C c = new C();
        c.m1();
        c.m2();
    }
}
