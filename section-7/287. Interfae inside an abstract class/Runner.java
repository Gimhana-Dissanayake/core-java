// Q. Is it possible to declare an interface inside an abstract class?

// Yes, it is possible to declare an interface inside an abstract class, but,
// the repective implementation class must be provided within the same outer
// abstrct class

abstract class A {
    interface I {
        void m1();

        void m2();

        void m3();
    }

    class B implements I {
        public void m1() {
            System.out.println("m1-B");
        }

        public void m2() {
            System.out.println("m2-B");
        }

        public void m3() {
            System.out.println("m3-B");
        }
    }
}

class C extends A {
    // interface I and C are coming from abstract class A as inner memebers
}

public class Runner {
    public static void main(String[] args) {
        A.I ai = new C().new B();
        ai.m1();
        ai.m2();
        ai.m3();
    }
}