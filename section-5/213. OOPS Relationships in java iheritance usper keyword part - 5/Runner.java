class A {
    A() {
        System.out.println("A-Con");
    }
}

class B extends A {
    B(int i) {
        System.out.println("B-Con");
    }
}

class C extends B {
    C() {
        super(20);// has to explcilitly call for a super class constructor because there is no
                  // zero arg constructor in B class
        System.out.println("C-Con");
    }
}

public class Runner {

}
