
// Rules while performing method overriding
// 1 . In method overriding, we must not declare super class method as 'private'. if we declare super class method as private then we are able to get compilation error

class A {
    void m1() {
        System.out.println("Old functionality");
    }
}

class B extends A {
    void m1() {
        System.out.println("New Functionality");
    }
}

// 2. In Method overriding. sub class method must have the same super class
// method return type.

class C {
    // Uncomment to the the error
    // int m1() {
    // System.out.println("Old functionality");
    // return 10;
    // }
}

class E extends C {
    // void m1() {
    // System.out.println("New Functionality");
    // }
}

// 3. Super class should not be declared as final, but the subclass method
// method can be declared as final.

class F {
    void m1() {
        System.out.println("Old functionality");
    }

}

class G extends F {
    void m1() {
        System.out.println("New Functionality");
    }
}

// 4. In Method overriding, either super class method or sub class method or
// both super class and sub class methods must not be declared as static. If we
// declare either super class method or sub class method as static then compiler
// will raise an error. If we declare both super class and sub class method as
// static then compiler will not raise any error, where method overriding will
// not be performed as runtime, where super class method overhides sub class
// method. This feature is called as "Method Overhiding"

class H {
    // Uncomment to see the error
    // static void m1() {
    // System.out.println("m1 - Old functionality");
    // }

    void m2() {
        System.out.println("m2 - Old functionality");
    }

    static void m3() {// performs method overhiding
        System.out.println("m3 - Old functionality");
    }
}

class I extends H {
    void m1() {
        System.out.println("m1 - New Functionality");
    }
    // Uncomment to see the error
    // static void m2() {
    // System.out.println("m2 - New functionality");
    // }

    static void m3() {// performs method overhiding
        System.out.println("m3 - New functionality");
    }
}

// 5. In Method overriding, subclass method should be either same as super class
// method scope or wider than super class method scoper. In other words, sub
// class method access previliges should be either same as super class method
// access previliges or weaker access previliges when compared with super class
// method access privilages

class J {
    public void m1() {
        System.out.println("---Old Functionality---");
    }

    protected void m2() {
        System.out.println("m2---Old Functionality---");
    }
}

class K extends J {
    // Uncomment to see the error
    // protected void m1() {
    // System.out.println("---New Functionality---");
    // }

    public void m2() {
        System.out.println("m2---New Functionality---");
    }
}

// 6. In Method overriding, sub class method throws Exception should be either
// same as super class method throws Exception or sub class to super class
// method throws Exception. If no relationship is existing between the Exception
// classes which are throws by both super class method and sub class method then
// we are able to provide exception classes in any order
class X {
    void m1() throws Exception {
        System.out.println("---m1 Old Functionality---");
    }

    void m2() throws ArithmeticException {
        System.out.println("---m2 Old Functionality---");
    }

    void m3() throws NullPointerException {
        System.out.println("---m3 Old Functionality---");
    }
}

class Y extends X {
    void m1() throws ArithmeticException {
        System.out.println("--- New Functionality ---");
    }

    // Uncomment to see the error
    // void m2() throws Exception {
    // System.out.println("--- New Functionality---");
    // }
    void m3() throws ArithmeticException {
        System.out.println("--- New Functionality---");
    }
}

public class Runner {

    public static void main(String[] args) {
        A a = new B();
        a.m1();

        H h = new H();
        h.m3();
    }

}
