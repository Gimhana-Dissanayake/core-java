
interface I {
    int x = 10;// by default this variable is public static final

    void m1();// public abstract

    void m2();// public abstract

    void m3();// public abstract
}

// If this is a subclass we will have to extends keyword, but as this is a
// implementation class we have to use implements keyword
class A implements I {

    // NOTE: while providing implementation for the methods we must use public
    // keyword, but not the abstract keyword. Abstract keyword can be left aside
    // since we are providing an implementation in the body class

    public void m1() {
        System.out.println("m1-A");
    }

    public void m2() {
        System.out.println("m2-A");
    }

    public void m3() {
        System.out.println("m3-A");
    }

    public void m4() {
        System.out.println("m4-A");
    }

}

public class Runner {

    public static void main(String args[]) {

        I i = new A();
        i.m1();
        i.m2();
        i.m3();
        // i.m4(); doing this give an error because m4 is not defined in the interface

        System.out.println("-------------");

        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        a.m4();// This is possible because m4 is defined in the class

        // There are four ways to access the static varaible defined in the I interface
        System.out.println(I.x);// via Interface name
        System.out.println(i.x);// via interface reference variable
        System.out.println(A.x);// via class name
        System.out.println(a.x);// via class reference name

    }
}
