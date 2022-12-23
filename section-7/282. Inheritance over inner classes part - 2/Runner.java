
// 2. We can extend a complete outer class to an inner class which is existing in another outer class
class A {

    void m1() {
        System.out.println("m1-B");
    }

}

class B {

    class C extends A {
        void m2() {
            System.out.println("m2-B");
        }
    }

}

// 3. We extend the immediate outer class to the repsective inner class
class D {
    void m1() {
        System.out.println("m1-D");
    }

    class E extends D {
        void m2() {
            System.out.println("m2-E");
        }
    }
}

public class Runner {

    public static void main(String[] args) {

        A a = new A();
        a.m1();

        B.C bc = new B().new C();
        bc.m1();
        bc.m2();

        D d = new D();
        d.m1();

        D.E de = new D().new E();
        de.m1();
        de.m2();
    }

}