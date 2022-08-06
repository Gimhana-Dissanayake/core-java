
//3. Multi level inheritance
//It is the combination of single inheritance in more than one level.

//Java does support Multi level inheritance

class A {
    int i = 10;

    void m1() {
        System.out.println("m1-A");
    }
}

class B extends A {
    int j = 20;

    void m2() {
        System.out.println("m2-B");
    }
}

class C extends B {
    void m3() {
        System.out.println(i);
        System.out.println(j);
        m1();
        m2();
    }
}

public class Runner {
    public static void main(String[] args) {
        C c = new C();
        c.m3();
    }
}