
// In java applications, all sub class types re compatible with super class types, but , super clss types are not compatible with sub class types.Due to this reason, we can assign sub class reference variable to super class reference variable, but, we are unable to assign super class reference variable to sub class rerence variable

public class Runner {

    public static void main(String[] args) {
        B b = new B();
        A a = b;// upcasting
        a.m1();

        A a1 = new A();
        // B b1 = a1(); this will give an error

        A a2 = new B();
        // upcasting is manditory for method overriding
        a2.mOver(); // because of method overriding we are getting the output from class B

    }

}

class A {
    void m1() {
        System.out.println("m1-A");
    }

    void mOver() {
        System.out.println("mOver method - A");
    }
}

class B extends A {
    void m2() {
        System.out.println("m2-B");
    }

    void mOver() {
        System.out.println("mOver method - B");
    }
}