
class A {
    A() {
        super();
        System.out.println("A-Con");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B-Con");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("C-Con");
    }
}

public class Runner {

    // rule one - If no constructor is provided the compile will insert a zero
    // argument
    // constructor. If a constructor is declared in the class the no arg constructor
    // is not inserted

    // rule two - compile will go to each class's constructor and check whether
    // super statment is present or not, if no super statement is present
    // the compile will provide a super statment in order to access super class zero
    // arg constructor. If we have provided a super statement compiler will not
    // provide a super statement

    // rule three - As for the super constructors of subclass constructors super
    // classes are having right constructors or not

    Runner() {
        super();
    }

    public static void main(String[] args) {
        C c = new C();
    }
}