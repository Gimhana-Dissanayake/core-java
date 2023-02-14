
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Q) Is it possible to exclude or block any instance variable in Object serialization and deserialization?

// Ans:
// Yes, it is possible to exclude or block any instance varialbe in Serialization and Deserialization by using 'transient' keyword.

// In general, if we perform Object Serialization over an object with data like password, pin numbers,... then Serialization will brin that data to some file where we stroed Serialized data, here security is not available for the protected data like password, in this context, if we want to secure our data then we have to bock a vriable in Serilization and Deserialization, to exclude a variable data in Serialization and Deserilazation we have to declare that varialbe as 'transient' variable.

class User implements Serializable {
    int uid = 111;
    String uname = "gim";
    transient String upwd = "abc";
}

public class Runner {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("dummy.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        User user = new User();
        oos.writeObject(user);
        System.out.println("Serialization success");
    }
}
