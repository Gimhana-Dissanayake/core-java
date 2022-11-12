
class A {
    int i = 10;
    int j = 20;
}

class B extends A {
    int i = 30;
    int j = 40;

    B(int i, int j) {
        System.out.println(i + "      " + j);
        System.out.println(this.i + "      " + this.j);
        System.out.println(super.i + "      " + super.j);
    }

}

public class Runner {

    // this keyword is representing current class object
    // 'super' is a java keyword, it will represent super class object from sub
    // classes

    // Uses of Super Keyword
    // 1. To refer super class variables
    // 2. To refer super class methods.
    // 3. to refer super class constructors

    // 1. To refer super class variables
    // When we have same set of variables at local, at current class level and at
    // super class level there to refer super class variable seperately over the
    // local variables and current class level variables we have to use "super"
    // keyword

    public static void main(String[] args) {
        B b = new B(50, 60);

    }

}
