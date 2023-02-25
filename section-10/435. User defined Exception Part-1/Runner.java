
// These Exceptions are defined by the developers as per their application
// requirments.

// To prepare and to use user defined exceptions in java applications we will
// use the following steps

// 1. Prepare User defined Exception class name.
// a). Declare an user defined class
// b). Extend user defined class from java.lang.Exception class inorder to get
// all exception behaviour.
// c). Declare String parameterized constructor in order to get user defined
// Exception description
// d). In the above constructor, access super class constructor by passing user
// defined Exception description and by using "super(--)".

// 2. Raise and Handle user defined exception in java applcations.
// To raise user defined exception we will use 'throw' keyword.
// To handle user defined exception we will use 'try-catch-finally'

class MyException extends Exception {

    MyException(String exceptionDescription) {
        super(exceptionDescription);
        // The main intention of passing exception desciption to super class that is
        // java.lang.Exception class is to set user defined exception description to the
        // predefined methods like pringtStackTrace(), toString() and getMessage()
        // method inorder to display user defined exception description through catch
        // block
    }

}

public class Runner {
    public static void main(String[] args) {
        try {
            throw new MyException("My Exception Description");
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println();
            System.out.println(e.getMessage());
        }
    }
}