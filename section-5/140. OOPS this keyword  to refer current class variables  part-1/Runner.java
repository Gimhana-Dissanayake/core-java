public class Runner {
    // 'this' is a java keyword, it can be used to represent current class object.

    // In java applications, we are able to utilize 'this' keyword in the fallowing
    // four ways.
    // 1. To refer current class variables
    // 2. To refer current class methods.
    // 3. To refer current class contructors.
    // 4. To return current class object.

    public static void main(String[] args) {
        A a = new A(30, 40);
    }
}

class A {
    // 1. To refer to current class variables
    // If we want to refer current class variables by using 'this' keyword then we
    // have to use the following syntax.

    // this.var_Name

    // Note: In java applications, when we have same set of variables at local and
    // at class level, we to refer class level variables over the local variables we
    // have to use 'this' keyword.

    // In java applications, when we access any variable JVM will search for that
    // variable locally, if the variable is not avaialbe it will look for it in
    // class level, If in class level that variable is not available, JVM will look
    // for that variable in the super class of the respective class. If no super
    // class is available JVM look in object class.If it is not in object class as
    // well, JVM will raise an error

    int i = 10;
    int j = 20;

    A(int i, int j) {
        System.out.println("Local vars " + i + "   " + j);
        System.out.println("Instance vars " + this.i + "   " + this.j);
    }

}