
// Static Inner class:
// Declaring a static class inside a class is called as 'Static Inner Class'
// To access memebers of the static inner classes we have to create object for the static inner class
// In case of static inner classes, only static members of the outer classe are available to inner classes
// In general, inner classes are not allowing static declarations directly, but, static inner classes are alllwoing static declarations directly
public class Runner {

    public static void main(String[] args) {

        A.B ab = new A.B();
        System.out.println(ab.i);
        ab.m1();
        ab.m2();
        A.B.m3();

        C.D cd = new C.D();
        cd.m1();

    }

}

class Outer {
    static class Inner {

    }
}

class A {
    static class B {
        int i = 10;

        void m1() {
            System.out.println("ml-B");
        }

        void m2() {
            System.out.println("m2-B");
        }

        static void m3() {
            System.out.println("static m3-B");
        }
    }
}

class C {

    int i = 10;
    static int j = 20;

    static class D {

        void m1() {
            System.out.println("ml-D");
            System.out.println(j);
            // System.out.println(i);
            // In case of static inner classes, only static members of the outer classe are
            // available to inner classes
        }
    }

    class E {
        // static int k = 30;
        // In general, inner classes are not allowing static
        // declarations directly, but,
        // static inner classes are alllwoing static declarations directly
    }

    static class F {
        static int k = 30;// allowed
    }
}