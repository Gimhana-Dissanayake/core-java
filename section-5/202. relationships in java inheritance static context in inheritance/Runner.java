
// Static context in inheritance
// 1.static variables
// 2.static methods
// 3.static blocks

// Static variables and Static blocks are recognized and executed at the time of loading the respective class bytecode to the memory.

// Static methods are recognized and executed the moment when we access that method.

// In inheritance, when we load sub class bytecode to the memory, first, JVM will load super class bytecode after taht only JVM will load subclass bytecode to the memory

class A {
    static {
        System.out.println("SB-A");
    }
}

class B extends A {
    static {
        System.out.println("SB-B");
    }
}

class C extends B {
    static {
        System.out.println("SB-C");
    }
}

public class Runner {
    public static void main(String[] args) {
        C c = new C();
    }
}
