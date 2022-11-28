
abstract class A {
    abstract void m1();

    abstract void m2();

    abstract void m3();
}

abstract class B extends A {
    @Override
    void m1() {
        // TODO Auto-generated method stub

    }
}

class C extends B {

    @Override
    void m2() {
        // TODO Auto-generated method stub

    }

    @Override
    void m3() {
        // TODO Auto-generated method stub

    }

}

public class Runner {

    public static void main(String[] args) {

        A a = new C();
        a.m1();
        a.m2();
        a.m3();

    }

}
