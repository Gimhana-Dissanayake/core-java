import java.io.Serializable;

// Q) If we implement java.io.Serializable inerface in super class then is it
// possible to perform Serialization over sub class objects?

// Ans:
// Yes, if we implement java.io.Serializable interface in super class then the
// respective sub class objects are also eligible for Serialization and
// Deserialization.

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
    int i = 10;
    String str1 = "lion";
}

class B extends A {
    int j = 20;
    String str2 = "lion group";
}

public class Runner {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("dummy.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        B b = new B();
        oos.writeObject(b);
        System.out.println("Serialization success");
        oos.close();
    }
}
