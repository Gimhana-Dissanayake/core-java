
class A {
    static {
        System.out.println("SB-A");
    }
    static int i = m1();

    static int m1() {
        System.out.println("m1-A");
        return 10;
    }
}

class B extends A {
    static int J = m2();
    static {
        System.out.println("SB-B");
    }

    static int m2() {
        System.out.println("m2-B");
        return 20;
    }
}

class C extends B {
    static int m3() {
        System.out.println("m3-C");
        return 30;
    }

    static int k = m3();
    static {
        System.out.println("SB-C");
    }
}

public class Runner {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C();
        C c3 = new C();
        C c4 = new C();
        C c5 = new C();
    }
}
