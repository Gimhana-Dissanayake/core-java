import static java.lang.Thread.*;
import static java.lang.System.out;

public class Runner {
    //The main intention of static import is to make available static members of a perticular class inorder to access without using class name and without using reference variable.

    //1.Import static package_Name.class or Interface_Name.*;

    //It able to import all static members of the specified class or interface inorder to access them without using class name or reference variable.

    //Import static package_Name.class_name or Interface_Name.Member_Name;
    //It is able to import only one specified static member to the present java file inorder to access it without using class name or reference variable

    
    public static void main(String[] args){

     //Using static imports

        out.println(MIN_PRIORITY);
        out.println(NORM_PRIORITY);
        out.println(MAX_PRIORITY);

        
    }

}
