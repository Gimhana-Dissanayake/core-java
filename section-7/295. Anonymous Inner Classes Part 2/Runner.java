public class Runner {
    public static void main(String[] args) {
        A i = new A();
        i.m1();
        i.m2();
        i.m3();

        Outer outer = new Outer();
        outer.i.m1();
        outer.i.m2();
        outer.i.m3();
    }
}

interface I {
    void m1();

    void m2();

    void m3();
}

class A implements I {
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

class Outer {
    I i = new I() {
        public void m1() {
            System.out.println("m1-AIC");
        }

        public void m2() {
            System.out.println("m2-AIC");
        }

        public void m3() {
            System.out.println("m3-AIC");
        }
    };
}