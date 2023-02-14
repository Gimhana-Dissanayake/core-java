
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Q) Is it possible to implement Serialization over Associations?

// Ans: 
// Yes, it is possible to implment Serialization in Associations. 

// In Associations, when we are performing Serialization over container object if we have any contained object then JVM is trying to Serialization contained object also if it implements java.io.Serializable interface, in this case, if container object is not implementing java.io.Serializable interface then JVM will raise an exception like "java.io.NotSerializableException"

class Bank implements Serializable {
    String bid = "b-017";
    String branch = "Sampath";
}

class Account implements Serializable {
    String accno = "a-091";
    Bank bank = new Bank();
}

class Employee implements Serializable {
    int eno = 24;
    Account acc = new Account();
}

public class Runner {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("dummy.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Employee emp = new Employee();
        oos.writeObject(emp);
        System.out.println("Serialization success");
        oos.close();
    }
}