import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// Q) It it possible to Serialize an Object without implementing
// java.io.Serializable interface, if we are trying to Serialize an Object
// without implementing java.io.Serializable interface then waht will be the
// reult in java applications?

// Ans:
// No, It is not possible to Serialize an Object without implementing
// java.io.Serializable interface, because, in java ll objects are not eligible
// for Serialization and Deserialization bydefault, only the object whose
// classes are implenting java.io.Serializable marker interface are eligible for
// Serialization and Deserialization

// If we are trying to Serialise an Object without implementing
// java.io.Serializable interface then JVM will raise an exception like
// "java.io.NotSerializableException"

class A {
    int i = 100;
    String str = "hello";
    float f = 33.55f;
}

public class Runner {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        A a = new A();
        oos.writeObject(a);

    }
}