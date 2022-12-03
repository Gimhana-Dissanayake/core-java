
interface I1 {
    void m1();
}

interface I2 {
    void m2();
}

interface I3 extends I1, I2 {
    void m3();
}

class A implements I3 {

    @Override
    public void m1() {
        System.out.println("m1-A");

    }

    @Override
    public void m2() {
        System.out.println("m2-A");

    }

    @Override
    public void m3() {
        System.out.println("m3-A");

    }

}

public class Runner {

    // In java applications, it is not possible to extends more than one class to a
    // single class, but, it is possible to extend more than one interface into
    // single interface

    public static void main(String[] args) {
        I1 i1 = new A();
        i1.m1();

        I2 i2 = new A();
        i2.m2();

        I3 i3 = new A();
        i3.m1();
        i3.m2();
        i3.m3();

    }

}
