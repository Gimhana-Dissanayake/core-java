
class ThreadScope extends ThreadLocal<String> {

    @Override
    protected String initialValue() {

        return "Data is not defined in this scope";
    }

}

class A {
    void m1() {
        // Thread1 scope is avaliable here
        System.out.println("m1() :" + Thread.currentThread().getName() + " Scope. Thread scope data - "
                + Thread1.threadScope.get());
        System.out.println("Trying to access threadscope data of thread two. " + Thread2.threadScope.get());

    }

    void m2() {
        // Thread2 scope is avaliable here
        System.out.println("m2() :" + Thread.currentThread().getName() + " Scope. Thread scope data - "
                + Thread2.threadScope.get());
        System.out.println("Trying to access threadscope data of thread one. " + Thread1.threadScope.get());

    }
}

class Thread1 extends Thread {
    static ThreadScope threadScope = new ThreadScope();
    A a;

    Thread1(A a) {
        this.a = a;
    }

    public void run() {
        threadScope.set("AAA");
        a.m1();
    }
}

class Thread2 extends Thread {
    static ThreadScope threadScope = new ThreadScope();
    A a;

    Thread2(A a) {
        this.a = a;
    }

    public void run() {
        threadScope.set("BBB");
        a.m2();
    }
}

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }

}
