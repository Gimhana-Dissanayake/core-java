
interface I1 {
    void m1();
}

interface I2 {
    void m2();
}

interface I3 {
    void m3();

}

class A implements I1, I2, I3 {

    @Override
    public void m3() {
        System.out.println("m3-A");

    }

    @Override
    public void m2() {
        System.out.println("m2-A");

    }

    @Override
    public void m1() {
        System.out.println("m1-A");
    }

}

public class Runner {
    // In Java applications, it is possible to implement more than one interface in
    // single implementation class

    public static void main(String[] args) {
        I1 i1 = new A();
        i1.m1();// only m1 method is declared in I1 interface so cannot access any other methods

        I2 i2 = new A();
        i2.m2();

        A a = new A();
        a.m1();
        a.m2();
        a.m3();

    }

}
