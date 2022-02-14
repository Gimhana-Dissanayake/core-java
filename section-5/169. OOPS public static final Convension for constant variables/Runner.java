

class User{
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 25;

}

class UserStatus{
    public static final String AVAILABLE = "User Available";
    public static final String BUSY = "User Busy";
    public static final String IDLE = "User Idle";

}

public class Runner {
    //java has provided a convension for constants that is public static final

    public static final int i = 10;
    

    //public scope means these variables are availabe thoughout the java application

    //there is no need to create an object to access a constant, hence the keyword static is used

    //final is used to fix its value, to prevent reassigments


    public static void main(String[] args){

        System.out.println(UserStatus.AVAILABLE);
        System.out.println(UserStatus.BUSY);
        System.out.println(UserStatus.IDLE);

    }



}
