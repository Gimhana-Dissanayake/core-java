
// In java applications, we are able to achieve synchronization in the fallowing
// two ways.

// 1. Synchronized methods
// 2. Synchronized blocks

// 1. Synchronized methods
// -----------------------
// Synchronized method is a normal java method with 'synchronized' keyword, it
// allows only one thread at a time to execute method body, it will not allow
// more than one thread at a time to execute method body, after completing the
// execution of the present thread only other threads are allowed.

// synchronized void m1(){}

class A {
    synchronized void display() {
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
        a.display();
    }
}

class Thread2 extends Thread {
    A a;

    Thread2(A a) {
        this.a = a;
    }

    public void run() {
        a.display();
    }
}

class Thread3 extends Thread {
    A a;

    Thread3(A a) {
        this.a = a;
    }

    public void run() {
        a.display();
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);
        Thread3 t3 = new Thread3(a);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
