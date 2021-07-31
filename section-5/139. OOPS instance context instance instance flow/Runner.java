public class Runner {
    public static void main(String[] args) {

        // For a perticular class byte code is loaded only once, but we can create any
        // number of objects

        A a1 = new A();
        A a2 = new A();
    }
}

class A {
    {
        System.out.println("1B-A");
    }

    int m1() {
        System.out.println("m1-A");
        return 10;
    }

    int i = m1();

    A() {
        System.out.println("A-Con");
    }
}