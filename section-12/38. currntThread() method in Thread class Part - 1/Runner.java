
// public static Thread currentThread()
// It can be used to get a Thread object which is executing the present instruction in java applications.

class A {
    void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Thread1 extends Thread {
    A a;

    Thread1(A a) {
        this.a = a;
    }

    public void run() {
        a.m1();
    }
}

class Thread2 extends Thread {
    A a;

    Thread2(A a) {
        this.a = a;
    }

    public void run() {
        a.m1();
    }
}

class Thread3 extends Thread {
    A a;

    Thread3(A a) {
        this.a = a;
    }

    public void run() {
        a.m1();
    }
}

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread1(a);
        Thread t2 = new Thread2(a);
        Thread t3 = new Thread3(a);

        // t1.setName("T1");
        // t2.setName("T2");
        // t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();
    }

}
// Watch the lecture