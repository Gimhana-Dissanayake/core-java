
// InstantiationException:

// in java applications, if we load a class bytecode to the memory by using
// Class.forName() and if we want to create an object for the loaded class
// explicity then we have to use the following method from java.lang.Class

// public Object newInstance() throws InstantiationException,
// IllegalAccessException

// Ex: Class c = Class.forName("Employee")
// Object obj = c.newInstance();

// When we execute the above code[newInstance()], JVM will perform the following
// actions.
// 1. JVM will got the loaded class and JVM will search for 0-arg constructor in
// the loaded class.

// 2. If the zero arg constructor is there, then JVM will create object for the laoded class and JVM will return that object in the form of java.lang.Object type.

// 3. If 0-arg constructor is not existed then JVM will raise an exception like java.lang.InstantiationException

class Employee {
    static {
        System.out.println("Employee calss loading...");
    }

    public Employee(int i) {
        System.out.println("Employee Object is creating...");
    }
}

public class Runner {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Employee");
        Object obj = c.newInstance();
    }
}

// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.InstantiationException
// 2. Exception Description: package details here
// 3. Exception Location: line number