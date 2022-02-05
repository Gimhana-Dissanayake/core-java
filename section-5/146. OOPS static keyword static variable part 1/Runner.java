public class Runner {
    
//static is a java keyword, it can be used to improve sharability.

//In java applications, we are able to utilize static keyword in the fallowing four ways.

//variable can be divided into main types, local variables and class level variables

//class level variables can be futher divided into 2 main types, Static variables and Instance variables(Non static variables)

//1. Static Variables

//--> In java applications, static variables are recognized and initialized at the time of loading the respective class bytecode to the memory

//--> In java applications, static varialbes must be declared as class level  variables only, not as local variables, if we declare any local variables as static variables then compiler will raise an error

//--> In java applications, we are able to access static variables in the fallowing two ways.
    //1. By creating object and by using the generated reference variables.
    //2. by using class name directly.

    //In the above two cases it is always better use class name to access static varialbes.

//NOTE: In java applications, if we access any instance vairlabes by using a reference variable contains null value then JVM will raise an exception like java.lang.NullPointerException, but, if we access any static variables by using a refence variable contains null value then JVM will not raise any exception, where JVM will display the respective static varialbes value.

// In Java applications, static varialbes data will be stored in Method Area, not in Stack memory and not in Heap Memory.


//In java application, single copy of static variable value will be shared to all the objects

//In java applications, last modified value of static varialbe will be shared to all previous object which we have created and to all the future objects which we are going to create.


//In Java applications, we are able to access current class static varialbes by using 'this' keyword.
}
