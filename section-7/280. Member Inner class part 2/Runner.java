// In java applictions, by using outer class refernece variables we are able to access only outer class members, by using inner class reference varialbes we are able to access only inner class members

// By using inner class refernce varialbe we are unable to acces outer class members and by usin gouter class refernce variables we are unable to accees inner class members

// In java applications, all outer class memebers are available to inner classes, in inner classes we are able to acccess outer class members, but , inner class members are not avaialbe to outer class, we are unable to access inner class memmber from outer class.

// In java applications, member inner classes are not allowing static declarations directly but static keyword is allowed along with final keyword.

class A {
    int i = 10;

    void m1() {
        System.out.println("m1-A");
        // System.out.println(j); Not possible
        // m2() ---> Error
    }

    class B {
        int j = 20;
        // static int k = 30; not possible but the fallowing is possible
        final static int k = 30;

        void m2() {
            System.out.println("m2-B");
            System.out.println(i);
            m1();
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
        a.m1();
        // System.out.println(a.j);this is not possible
        // a.m2(); This is not possible as well

        A.B ab = new A().new B();
        System.out.println(ab.j);
        ab.m2();
        // System.out.println(ab.i); Error
        // ab.m1(); Error
    }
}
