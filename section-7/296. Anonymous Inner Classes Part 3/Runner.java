
// In java applications, whenever we want to pass an interface as parameter to a method there we will use anonymous inner classes inplace of declaring implementation classes and inplace of providing implemntation class object reference value.
public class Runner {
    public static void main(String[] args) {
        Student std = new Student();
        Institute in = new InstituteImpl();
        Institute in1 = new Institute() {
            public void displayAllCoursesNames() {
                System.out.println("Courses Names - Using Anonymous inner class");
                System.out.println("-------------------------------");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. .Net");
                System.out.println("4. Oracle");
            }
        };
        std.getCoursesName(in);
        std.getCoursesName(in1);
        std.getCoursesName(new Institute() {
            public void displayAllCoursesNames() {
                System.out.println("Courses Names - Using Anonymous inner class without reference variable");
                System.out.println("-------------------------------");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. .Net");
                System.out.println("4. Oracle");
            }
        });
    }
}

interface Institute {
    public void displayAllCoursesNames();
}

class InstituteImpl implements Institute {
    public void displayAllCoursesNames() {
        System.out.println("Courses Names");
        System.out.println("-------------------------------");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. .Net");
        System.out.println("4. Oracle");
    }
}

class Student {
    public void getCoursesName(Institute in) {
        in.displayAllCoursesNames();
    }
}
