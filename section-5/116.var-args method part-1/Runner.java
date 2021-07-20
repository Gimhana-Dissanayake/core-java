public class Runner {

    // In java applications, if we declare any method with "n" no of parameters then
    // it is mandatory to access that method by passing the n no of parameters
    // values, it is not possible to access that method by passing n+1 no of
    // parameters values or n-1 no of parameter values.

    // As per the appl requirment, we want to access a method by passing variable no
    // of parameter values.

    // If we want to access any methods by passing variable no of parameters then we
    // must use "Variable-Arugument method", in short, "Var-Arg method".

    // Var-Arg method is a java method, it will have variable-argument parameter.

    // Variable argument method syntax
    // [Access Modifiers] return_type methodName(Data_type ... var)[throws
    // Exception_list]{
    // ........
    // }

    // variable argument parameter => data_Type ... var_name

    public static void main(String args[]) {
        A a = new A();
        a.m1();
        a.m1(10);
        a.m1(10, 20);
        a.m1(10, 20, 30);
    }

}

class A {
    void m1(int... a) { // internally a will act as an array => int[] a = {10,20,30}
        // logic
    }
}
