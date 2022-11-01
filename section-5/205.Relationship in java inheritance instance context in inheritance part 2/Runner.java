class A {
    A() {
        System.out.println("A-Con");
    }

    int i = m1();

    int m1() {
        System.out.println("m1-A");
        return 10;
    }

    {
        System.out.println("IB-A");
    }
}

class B extends A {
    {
        System.out.println("IB-B");
    }
    int j = m2();

    int m2() {
        System.out.println("m2-B");
        return 20;
    }

    B() {
        System.out.println("B-Con");
    }
}

class C extends B {
    int k = m3();

    int m3() {
        System.out.println("m3-C");
        return 30;
    }

    C() {
        System.out.println("C-Con");
    }

    {
        System.out.println("IB-C");
    }
}

public class Runner {
    public static void main(String[] args) {
        C c = new C();
    }

    // If we compile this java file we will get 4 .class files

    // When we execute Runner class JVM will first load Runner class's superclass
    // byte code to memory which in this case is the Object class

    // After that JVM will load the Runner class Byte code to memory

    // Then main method excution will start as a result A class's superclass byte
    // code will be loaded to memory which in this case is the Object class.
    // but here it won't happen because object class byte code is already loaded

    // Then A class byte code is loaded to memory and A class static context is
    // regonzied and executed

    // Then B class byte code is loaded to memory and A class static context is
    // regonzied and executed

    // Then C class byte code is loaded to memory and A class static context is
    // regonzied and executed

    // When all the byte codes are loaded JVM will excute constructor of the C class

    // Then A class's superclass(object class) zero argument constructor will be
    // excuted

    // Then A class instance context is executed from top to bottom

    // Then the A class contructor is executed

    // Then B class instance context is executed from top to bottom

    // Then the B class contructor is executed

    // Then C class instance context is executed from top to bottom

    // Then the C class contructor is executed
}