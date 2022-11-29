
abstract class A {
    // constructors are possible in abstract classes
    A() {
        System.out.println("A-Con");
    }
}

class B extends A {
    B() {
        System.out.println("B-Con");
    }
}

public class Runner {
    // Please refer to the vedio for notes

    public static void main(String[] args) {
        B b = new B();
    }

}
