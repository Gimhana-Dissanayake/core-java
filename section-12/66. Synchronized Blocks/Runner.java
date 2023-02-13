
// Synchronized Block:
// It is a set of instructions, which are able to allow only one thread at a
// time, it will not allow more than one thread at a time, after completion of
// the present thread execution only other threads are allowed.

// Syntax:
// synchronized(ObjectToLock){}

class A {
    void display() {

        System.out.println("Before Synchronized Block " + Thread.currentThread().getName());

        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Inside Synchronized Block " + Thread.currentThread().getName());
            }
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

class Runner {
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