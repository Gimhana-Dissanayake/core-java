
public class Runner {

    // In java applications, java has provided a seperate keyword to represent
    // inheritance, that is, "extends" keyword

    // If we declare variables and methods in superclass then we are able to access
    // tht variables and methods in the respective subclasses without using super
    // class reference variables and without creating superclass object.

    // By using superclass reference variables we are able to acess only superclass
    // memebers, we are unable to access sub class memebers. By using sub class
    // reference variables we are able to access both super class members and sub
    // class members

    // Note: In java, in case of Inheritance, all superclass members are coming to
    // sub class members but sub class own members are not available to super class

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.i);
        a.m1();
        // a.m2(); --> ERROR

        B b = new B();
        System.out.println(b.j);
        b.m2();
        System.out.println(b.i);
        b.m1();

    }

}

class A {
    int i = 10;

    void m1() {
        System.out.println("m1-A");
        // System.out.println(j); --> ERROR
    }
}

class B extends A {
    int j = 20;

    void m2() {
        System.out.println("m2-B");
        System.out.println(i);
        m1();
    }
}
