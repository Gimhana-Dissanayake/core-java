
class A {
    void m1() {
        System.out.println("m1-A");
    }
}

class B extends A {
    void m2() {
        System.out.println("m2-B");
    }
}

public class Runner {
    public static void main(String[] args) {

        // In java applications, all sub class types re compatible with super class
        // types, but , super clss types are not compatible with sub class types.Due to
        // this reason, we can assign sub class reference variable to super class
        // reference variable, but, we are unable to assign super class reference
        // variable to sub class rerence variable. If we want to assign super class
        // reference varialbe to sub class reference varialble thenwe must use cast
        // operator

        A a = new A();
        // B b = a; compilation error

        A a1 = new A();
        // B b1 = (B) a1; No compilation error but we are getting class cast
        // exception

        // In Java appications, we are able to keep sub class object reference value in
        // super class referenc variables, but, we are unable to keep super class object
        // reference value in sub class reference variable. If we are trying to keep
        // super class object reference value in sub class reference variable then we
        // are able to get "java.lang.ClassCastException"

        // Type casting is done by JVM and type checking is done by compiler
        A a2 = new B();
        B b2 = (B) a2; // Downcasting
        b2.m1();
        b2.m2();

    }
}
