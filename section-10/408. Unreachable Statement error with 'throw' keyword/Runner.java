
// In java applications, if we provided any statement immedialty after 'throw' statement then that statement is called as "Unreachable Statement", where compiler will raise an error
public class Runner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();

        a.m2();
    }

}

class A {
    void m1() {
        System.out.println("Before Exception");
        throw new RuntimeException("My Own Exception");
        // System.out.println("After Exception");"Exception here"
    }

    void m2() {
        System.out.println("Before Exception");

        int i = 100;
        int j = 0;

        float f = i / j;

        System.out.println("After Exception");

    }

}
