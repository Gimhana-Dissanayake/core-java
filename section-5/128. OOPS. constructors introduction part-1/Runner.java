public class Runner {
    // Contructor is a java feature, it can be used to construct objects.

    // In object creation process, the job of the constructor is to provide initial
    // values to the objects

    // In java applications, Constructors will be executed exactly at the time of
    // creating objects, not before creating objects and not after creating objects

    // In java applications, we are able to utilize constructors to provide
    // initializations to the class level variables./ instance variables

    // In java applications, contructors names must be same as the respective class
    // names.

    // In java applications, constructors are not allowing return types

    // In java applications, contructors are not allowing the access modifiers like
    // static, final ,abstract....

    // In java applications, contructors are able to have scope level access
    // modifiers like public, protected, <default> and private

    // In java applications, contructors are able to allow "throws" keyword to
    // bypass the generated Exception from present constructor to the caller.

    // Syntax
    // --------
    // [Access Modifier] ClassName([Param_List]) [throws Exception_List] {
    // ---instruction---
    // }

    public static void main(String[] args) {
        A a = new A();
        System.out.println("ADD :" + a.add());
        System.out.println("SUB :" + a.sub());
        System.out.println("MUL :" + a.mul());
    }

}

class A {
    int i;
    int j;

    A() {
        i = 10;
        j = 2;
    }

    public int add() {
        int result = i + j;
        return result;
    }

    public int sub() {
        int result = i - j;
        return result;
    }

    public int mul() {
        int result = i * j;
        return result;
    }

}