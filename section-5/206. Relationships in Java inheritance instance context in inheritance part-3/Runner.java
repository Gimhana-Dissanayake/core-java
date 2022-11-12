class A {
    A() {
        System.out.println("A-Con");
    }

    int m1() {
        System.out.println("m1-A");
        return 10;
    }

    {
        System.out.println("IB-A");
    }
    int i = m1();
}

class B extends A {
    B() {
        System.out.println("B-Con");
    }

    {
        System.out.println("IB-B");
    }

    int m2() {
        System.out.println("m2-B");
        return 20;
    }

    int j = m2();

}

class C extends B {
    C() {
        System.out.println("C-Con");
    }

    int m3() {
        System.out.println("m3-C");
        return 30;
    }

    int k = m3();
    {
        System.out.println("IB-C");
    }

}

public class Runner {
    public static void main(String[] args) {
        C c1 = new C();
        System.out.println("----------");
        C c2 = new C();
    }
}