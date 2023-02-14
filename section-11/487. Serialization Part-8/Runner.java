import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Q) Are static variable are allowed in Object Serialization?

// Ans:
// No, static variables are not allowed in Object Serialization and Deserialization, because, static variables data will not be store inside the object, where satic varialbes data will be stored inside method Area, Serializationa ndDeserialization is possilbe for the variables which are availabe insdie the objects.

class User implements Serializable {
    String uname = "abc";
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 30;
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
