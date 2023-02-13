
class A {
    String str1 = new String("Gim");
    StringBuffer sb1 = new StringBuffer("Kamal");

    void modify() {
        String str2 = str1.concat("dissa");
        StringBuffer sb2 = sb1.append("hewage");
        System.out.println("str2 : " + Thread.currentThread().getName() + " : " + str2);
        System.out.println("sb : " + Thread.currentThread().getName() + " : " + sb2);
    }

}

class Thread1 extends Thread {
    A a;

    Thread1(A a) {
        this.a = a;
    }

    public void run() {
        a.modify();
    }
}

class Thread2 extends Thread {
    A a;

    Thread2(A a) {
        this.a = a;
    }

    public void run() {
        a.modify();
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
