enum UserStatus{
    AVAILABLE,BUSY, IDLE
}

public class Runner {

    //1.Each and every enum is internally a final class
    //Every enum is a child class to java.lang.Enum
    //2.The common and default super class for each and every enum is "java.lang.Enum"


    //Q) Is it possible to define inheritance relation between enums?
    //Ans:

    //No, it is not possible to extend one enum to another enum, because, all the enums are by default final classes, in java applications, we are unable to extend a class from a final class.

    public static void main() {
        System.out.println(UserStatus.AVAILABLE);
        System.out.println(UserStatus.BUSY);
        System.out.println(UserStatus.IDLE);
    }
}
