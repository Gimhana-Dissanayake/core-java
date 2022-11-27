
public class Runner {
    // Method overriding;
    // The process of providing replacement for existing method functionality with
    // some new functionality is called as method overriding

    // To perform Method overriding, we have to use the following steps.
    // 1. Declare a method in super class which we want to override. [Old
    // functionality]
    // 2. Declare the same method with different functionality in sub class [New
    // functionality]

    // If we want to perform method overriding both super class and sub class method
    // should have the same prototype. Method prototype include access modifiers
    // list, return types, method name , parameter list and throw exception list

    // In java apps, method overriding requires "Inheritance"
}

class Student {
    void write(String slate, String chalk) {
        // Old functionality
    }
}

class Teacher extends Student {
    void write(String board, String marker) {
        // New functionality
    }
}

class SoftwareEngineer extends Student {
    void write(String notepad, String keyboard) {
        // New Functionality
    }
}
