//Inheritance Over Inner classes:
// It is possible to provide inheritance relation between inner classes with the fallowing conditions.

// 1. We can define inheritance relation between inner classes but both the inner classes must be existed with in the same outer class.

class A {

    class B {
        int i = 10;

        void m1() {

        }
    }

    class C extends B {
        int j = 20;

        void m2() {
            System.out.println("m2-C");
            System.out.println(i);
            m1();
        }
    }

}

public class Runner {

    public static void main(String[] args) {
        A.B ab = new A().new B();
        System.out.println(ab.i);
        ab.m1();
        System.out.println();
        A.C ac = new A().new C();
        System.out.println(ac.i);
        System.out.println(ac.j);
        ac.m1();
        ac.m2();
    }

}
