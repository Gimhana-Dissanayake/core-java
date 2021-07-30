public class Runner {
    public static void main(String[] args) {
        B b1 = new B();
        b1.add();

        B b2 = new B(10);
        b2.add();

        B b3 = new B(10, 20);
        b3.add();

        B b4 = new B(10, 20, 30);
        b4.add();
    }
}

class A {

    // in java applications, if we declare more than one method with the same name
    // and with different parameter list then it is called method overloading.

    void add(int i, int j) {
        // ...
    }

    void add(float f1, float f2) {
        // ...
    }

    void add(String str1, String str2) {
        // ...
    }
}

class B {

    // If we declare more than one constructor with the same name and with different
    // parameter list then it is called as contructor overloading.

    int i, j, k;

    B() {

    }

    B(int x) {
        i = x;
    }

    B(int x, int y) {
        i = x;
        j = y;
    }

    B(int x, int y, int z) {
        i = x;
        j = y;
        k = z;
    }

    public void add() {
        System.out.println("Addition : " + (i + j + k));
    }

}