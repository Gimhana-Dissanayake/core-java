// 1. Member Inner class
// Declaring a non static class inside a class is called as Member Inner class

// EX

class Outer {
    class Inner {

    }
}

// To create object fro the member inner class we have to use the follwoing
// syntax

// Outer.Inner refVar = new Outer().new Inner();

class A {
    int i = 10;

    void m1() {
        System.out.println("m1-A");
    }

    class B {
        int j = 20;

        void m2() {
            System.out.println("m2-B");
        }
    }
}

class Runner{
    public static void main(String args[]) {

    A a = new A();
    System.out.println(a.i);
    a.m1();
    System.out.println();

    A.B ab = new A().new B();
    System.out.println(ab.j);
    ab.m2();
    System.out.println();


    A.B ab1 = a.new B();
    System.out.println(ab1.j);
    ab1.m2();

    }
}