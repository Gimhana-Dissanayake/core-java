
interface I {
    void m1();

    void m2();

    void m3();
}

abstract class A implements I {
    public void m1() {
        System.out.println("m1-A");
    }
}

class B extends A {

    @Override
    public void m2() {
        System.out.println("m2-B");

    }

    @Override
    public void m3() {
        System.out.println("m3-B");

    }

}

public class Runner {

    // In Java applications, if we decalre an interface with abstract methods then
    // it is mandatory to provide implementation for all methods of that interface
    // in the respective implementation class, in this case, if we provide
    // implementation for some of the abstract methods, not for all the abstract
    // methods in implmentation class then we are able to get compilation error, in
    // this context, to come out from compilation errors, we have to declare the
    // provided implementation class as an abstract class and we must provide
    // impomentation form remaining abstract emthods by taking sub class to the
    // implmentation class

    public static void main(String[] args) {
        I i = new B();
        i.m1();
        i.m2();
        i.m3();
    }

}
