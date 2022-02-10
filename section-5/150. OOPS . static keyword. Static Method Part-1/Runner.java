public class Runner {
    //Static method is a normal java method, it will be recognized and executed the moment when we access that method, if we access static method at load time then it will be executed at load time only, if we access static method at runtime then it will be executed at runtime only.

    //In java applications, we are able to access static methods by creating object for the respective class and by using the generated reference variable and by using respective class name directly

    //NOTE: In java applications, always, it is suggestible to access static methods by using class name

    //NOTE: If we access instance method by using a reference variable contains null value then JVM will raise an exception like java.lang.NullPointerException. If we access any staic method by using a reference varialbe contains null value then JVM will not raise any Exception.

    //In Java applications, static methods are able to allow only static varialbes, static methods are not allowing non static members, if we are trying to access instance members from static method then compiler will raise an error.

    //NOTE: If we want to access non static members of the current class inside static method then we have to create object for the respective class and we have to use the generated reference variable.

    // Static Methods are not allowing 'this' keyword in their body, but, to access current class static methods from some other methods then we can use 'this' keyword
}
