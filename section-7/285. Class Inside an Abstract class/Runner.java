// Is it possible to declare a class inside an abstract class?
// Ans : Yes, it is possible to declare a class inside an abstract class. 
public class Runner {

    // A.B ab = new A().new B() This is not possible since we are not able to create
    // objects for abstract classes, so as a remedy we have to create anoter class
    // and extend the abstract class A(only for the sake of creating an object)
    public static void main(String[] args) {
        A.B ab = new C().new B();
        ab.m1();
        ab.m2();
        ab.m3();

    }

}

abstract class A {
    class B {
        void m1() {
            System.out.println("m1-B");
        }

        void m2() {
            System.out.println("m2-B");
        }

        void m3() {
            System.out.println("m3-B");
        }
    }

}

class C extends A {
    // class B is coming from abstract class A as a member inner class.
}