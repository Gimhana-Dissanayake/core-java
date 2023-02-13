
// ClassNotFoundException: 
// In Java applications, to load a particular class bytecode to the memory without creating object we have to use the following method from java.lang.Class class

// public static Class forName(String className) throws ClassNotFoundException.

// When we execute the above code, JVM will perform the following actions.
// 1. JVM will search for the respective class .class file at current location, at Java predefined libary and at the location refered by 'classpath' env variable.

// 2. If the required .class is existed at either or the above locations the JVM will load the respective class bytecode to the memory.

// 3. If the requried .class file is not identified at all the above specified locations then JVM will rase a exception live java.lang.ClassNotFoundException.

class Employee {
    static {
        System.out.println("Employee class loading...");
    }
}

public class Runner {

    public static void main(String[] args) throws Exception {
        Class.forName("Employee");// No Exception
        // Class.forName("EmployeeABC");// java.lang.ClassNotFoundException is raised
    }

}

// Parts of an Exception provided by JVM

// 1. Exception Name: java.lang.ClassNotFoundException
// 2. Exception Description: package details here
// 3. Exception Location: line number