public class Runner {
    public static void main(String[] args) {
        I.A ia = new I.A();
        ia.m1();
        ia.m2();
        ia.m3();
    }
}
// Q is it possible to declare a class inside an interface?

// Ans: Yes, it is possible to declare a class inside an interface, if we
// declare a class inside an interface then the provided class is converted as
// static inner class internally

// NOTE: By default, all variables inside interfaces are "public static final"

// NOTE: By default, all methods inside interfaces are "public and abstract"

// NOTE: By default, all classes inside interface are "static inner classes"

interface I {
    class A {// static class A
        void m1() {
            System.out.println("m1-A");
        }

        void m2() {
            System.out.println("m2-A");
        }

        void m3() {
            System.out.println("m3-A");
        }
    }
}