
// Q. Is it possible to declare an abstract class inside a class
public class Runner {
    public static void main(String[] args) {
        A.B ab = new A().new C();
        ab.m1();
        ab.m2();
        ab.m3();
    }
}

class A {
    abstract class B {
        void m1() {
            System.out.println("m1-B");
        }

        abstract void m2();

        abstract void m3();
    }

    class C extends B {
        void m2() {
            System.out.println("m2-C");
        }

        void m3() {
            System.out.println("m3-C");
        }
    }
}