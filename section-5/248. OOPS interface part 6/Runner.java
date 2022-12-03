
interface I1 {
    void m1();

    void m2();
}

interface I2 {
    void m3();
}

class A {
    void m4() {
        System.out.println("m4-A");
    }
}

class B extends A implements I1, I2 {

    @Override
    public void m3() {
        // TODO Auto-generated method stub

    }

    @Override
    public void m1() {
        // TODO Auto-generated method stub

    }

    @Override
    public void m2() {
        // TODO Auto-generated method stub

    }

}

public class Runner {
    // In java applications, It is possible to extend a super class implment an
    // interface in the same class, but, first, we have to extend super class then
    // we have to implement interface.

    public static void main(String[] args) {
        I1 i = new B();
        i.m1();
        i.m2();

        A a = new B();
        a.m4();

        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();
    }

}
