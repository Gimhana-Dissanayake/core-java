
class A{
    static int i = 10;
    int j = 20;
    A(){

    }
}

public class Runner {
    //What are the difference between static variables and instance variables


    //Ans:
    //1. static variables recognized and initialized exactly at the time of loading the respective class bytecode to the memory. Instance variables are recognized and initialized just before executing the respective class contructor.

    //2. static variables is an elements from static context.

    //Instance variable is an elements from Instance Context.

    //3. In java applications, we are able to access static variables in the following two ways.
        //1. By Creating object for the respective class and by using the generated reference variable.
        //2. By using the respective class name.

    //In java applications, we are able to access instance variables by creating object only.

    //4. java.lang.NullPointerException is not applicable for static variables, that is , if we access any static varialbes by using a reference variable contains null value then JVM will not raise any exception.

    //java.lang.NullPointerException is applicable for instance variables, that is, if we access any instance variables by using a referance variable contains null value then JVM will raise an exception like java.lang.NullPointerException.

    //5.In Java applications, single copy of static variable value will be shared to all the objects of the respective class.

    //In java applications, for each and every object of the same class a seperate copy of instance variable is created.

    //6. Static variables are able to provide more sharability.Instance variables are able to provide less sharability.

    //7. In java applications, it is possible to access static varialbes in both static methods and instance methods.
    //In Java application, it is possible to access instance varialbes in only instance methods, it is not possible to access instance varialbes from static methods.


    //8. Static variables data will be stored inside Method Area.

    //Instance varialbe data will be stored in the form of objects inside heap memory

    //9. To declare static varialbes, we must use "static" keyword.

    //To declare instance varialbes, it is not requried to use any special keyword

}
