abstract class A {
    void m1() {
        System.out.println("m1-A");
    }

    abstract void m2();

    abstract void m3();
}

class Outer {
    A a = new A() {
        void m2() {
            System.out.println("m2-AIC");
        }

        void m3() {
            System.out.println("m3-AIC");
        }
    };
}

public class Runner {

    public static void main(String[] args) {

        A a = new A() {
            void m2() {
                System.out.println("m2-AIC");
            }

            void m3() {
                System.out.println("m3-AIC");
            }
        };

        Outer outer = new Outer();
        outer.a.m1();
        outer.a.m2();
        outer.a.m3();

        a.m1();
        a.m2();
        a.m3();

    }

}

// Nameless inner classes are called as Anonymous inner classes.

// The main intention of Anonymous Inner classes is to provide implemention for
// abstract classes and interfaces

// Syntax:
// class / abstract class / interface Name {

// }

// Name refVar = new Name(){
// --------implementation for members-----
// }

// class Outer{

// Name refVar = new Name(){
// ----------implentation for Members
// }

// }

// Outer outer = new Outer();
// outer.refVar.memberName