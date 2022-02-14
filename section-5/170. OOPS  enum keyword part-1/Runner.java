
class UserStatus{
    public static final String AVAILABLE = "User Available";
    public static final String BUSY = "User Busy";
    public static final String IDLE = "User Idle";
    
}

public class Runner {
    
    public static void main(String[] args){
        System.out.println(UserStatus.AVAILABLE);
        System.out.println(UserStatus.BUSY);
        System.out.println(UserStatus.IDLE);
    }

    //"enum" keyword:

    // Drawbacks with "public static final" approaches,
    //1. For each and every constant we must provide "public static final expicitly"
    //2.In this approach, to represent a particular thing we are able to allow different data type, it will reduce Typedness in java applications,it will perform type unsafe operations.
    //3. In this approach, if we access any constant variable then its message which we provided will be displayed, where the provided message may or may not reflect the actual meaning of the respective constant


    //To overcome all the above problems we have to use "enum".

    //in case of enum,
    //1. All constant variables are "public static final" by default.
    //2. All content variables are of the same enum type.
    //3. All constant variables are name constant variables, they will display their names instead of their values.

}
