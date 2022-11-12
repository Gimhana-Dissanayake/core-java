
class A {
    void m1() {
        System.out.println("m1-A");
    }

}

class B extends A {
    void m2() {
        System.out.println("m2-B");
        m1();
    }

    void m1() {
        System.out.println("m1-B");
    }
}

class C extends A {
    void m3() {
        System.out.println("m3-C");
        m1();
    }
}

class D extends A {
    void m4() {
        System.out.println("m4-D");
        super.m1();
    }

    void m1() {
        System.out.println("m1-D");
    }
}

class F extends A {
    void m5() {
        System.out.println("m5-F");
        m1();
        this.m1();
        super.m1();
    }

    void m1() {
        System.out.println("m1-F");
    }

}

public class Runner {

    // In java applications, when we provide same methods at both super calss and
    // sub class where to access super class method over sub class method we have to
    // use "super" keyword.

    public static void main(String[] args) {
        B b = new B();
        b.m2();

        C c = new C();
        c.m3();

        D d = new D();
        d.m4();
    }

}
