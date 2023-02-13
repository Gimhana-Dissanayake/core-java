
class A {
    StringBuffer sb = new StringBuffer("Gim");

    void add() {
        sb = sb.append("dissa");
        System.out.println(Thread.currentThread() + " : " + sb);
    }
}

class Thread1 extends Thread {
    A a;

    Thread1(A a) {
        this.a = a;
    }

    public void run() {
        a.add();
    }
}

class Thread2 extends Thread {
    A a;

    Thread2(A a) {
        this.a = a;
    }

    public void run() {
        a.add();
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

}
