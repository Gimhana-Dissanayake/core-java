// Q. It is possible to declare an abstrct class insdie an interface?

// Ans. Yes, it is possible to declare an abstract class inside an interface, but, the respective sub class of the provided abstract class must be provided inside the same interface, in this case, the provided sub class is acting as 'Static inner class'

interface I {
    abstract class A {
        void m1() {
            System.out.println("m1-A");
        }

        abstract void m2();

        abstract void m3();
    }

    class B extends A {// static class B
        void m2() {
            System.out.println("m2-B");
        }

        void m3() {
            System.out.println("m3-B");
        }
    }

}

public class Runner {
    public static void main(String[] args) {
        I.A ia = new I.B();
        ia.m1();
        ia.m2();
        ia.m3();
    }
}
