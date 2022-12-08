// 'instanceof Operator in Java'

// 'instanceof' operator is a boolean operator, it will return either true or false value.

// 'instanceof' operator can be used to check whether a reference variable is representing a class or an abstract or an interface instances.

// Syntax : reference variable(refVar) instanceof class/AbstractClass/Interface

// 1. If refVar class Name and the specified class name are same then instanceof operator will return true.

// 2. If refVar class name is sub class to the specified class then instanceof operator will return true value.

// 3. If the refVar class nam eis super class to the specified class then instanceof operator will return false value.

// 4. If refVar class name is not related to the specified class then compiler will raise an error

// 5. If refVar is super class to the specified class name and it contains sub class object reference value then instanceof operator will return true value.

class A {

}

class B extends A {

}

class C {

}

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a instanceof A);
        B b = new B();
        System.out.println(b instanceof B);
        System.out.println(b instanceof A);
        System.out.println(a instanceof B);

        C c = new C();
        System.out.println(c instanceof C);
        // System.out.println(c instanceof A);
        // System.out.println(c instanceof B);

        A a1 = new B();
        System.out.println(a1 instanceof B);// This give true because a1 contains a object of type B
    }

}
