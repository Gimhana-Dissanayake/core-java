
// In Java applications, if we declare an interface with abstract methods then it is convention to provide implementation for all abstract methods by taking an implementation class
interface I {
    int x = 10;// public static final

    void m1();// public abstract

    void m2();// public abstract

    void m3();// public abstract
}

class A implements I {
    // public should be added as an access modifier because if not the default
    // access modifier is added automatically and that is not allowed because the
    // scope of the method should be wider than that of the super class
    public void m1() {
        System.out.println("m1-A");
    }

    @Override
    public void m2() {
        System.out.println("m2-A");
    }

    @Override
    public void m3() {
        System.out.println("m3-A");
    }

    public void m4() {
        System.out.println("m4-A");
    }
}

public class Runner {

    public static void main(String[] args) {
        I i = new A();
        i.m1();
        i.m2();
        i.m3();
        // i.m4() compilation error

        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        a.m4();

        System.out.println(I.x);
        System.out.println(i.x);
        System.out.println(A.x);
        System.out.println(a.x);
    }

}
