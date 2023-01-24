
// Method local inner class:

// Declaring a class inside a method is called as Method Local Inner class.

// If we declare a classs inside a method then the scoper of that class is upto
// the respective method only, it is not available in outside of the method.

class A {
    void m1() {
        class B {
            // Method Local Inner Class

            int i = 10;

            void m2() {
                System.out.println("m2-B");
            }

            void m3() {
                System.out.println("m3-B");
            }
        }

        B b = new B();
        System.out.println(b.i);
        b.m2();
        b.m3();
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}