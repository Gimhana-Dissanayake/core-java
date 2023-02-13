
class A {
    int i = 10;

    void increment() {
        i = i + 10;
        System.out.println(Thread.currentThread() + " : " + i);
    }
}

class Thread1 extends Thread {
    A a;

    Thread1(A a) {
        this.a = a;
    }

    public void run() {
        a.increment();
    }
}

class Thread2 extends Thread {
    A a;

    Thread2(A a) {
        this.a = a;
    }

    public void run() {
        a.increment();
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);
        t1.start();
        t2.start();
    }

    // Here both thread are expecting the output to be 20 but getting 30 instead.
}

// watch the lecture