
abstract class A {
    abstract void m1();
}

class B extends A {

    void m1() {
        System.out.println("---New Functionality---");
    }

}

public class Runner {

    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }

}
