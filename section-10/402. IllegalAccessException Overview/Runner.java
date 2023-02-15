
// IllegalAccessException:
// In java applications, after loading a particular class bytecode to the memory
// by using Class.forName() method, if we want to create an object for the
// laoded class we have to use the following method from java.lang.Class.

// public Object newInstance() throws InstantiationException,
// IllegalAccessException

// Class c = Class.forName("Employee")
// Object obj = c.newInstance();

// when JVM execute newInstance() method, JVM will perform the following
// actions.

// 1. JVM will search for non private constructor in the loaded class.
// 2. If we have non private constructor in the loaded class then JVM wil
// execute that constructor and JVM will generage an Object for the loaded class
// in the form of java.lang.Object Type.
// 3. if the constructor is private constructor then JVM will raise an Exception
// like java.lang.illegalAccessException.

class Employee {
    static {
        System.out.println("Employee calss loading...");
    }

    private Employee() {// java.lang.IllegalAccessException, because the ctor is private
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

// 1. Exception Name: java.lang.IllegalAccessException
// 2. Exception Description: class test cannot access a member of class employee
// with modfifiers "private"
// 3. Exception Location: line number