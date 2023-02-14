import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int eno;
    String ename;
    float esal;
    String eaddr;

    public Employee(int eno, String ename, float esal, String eaddr) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("---------------------");
        System.out.println("Employee number    : " + eno);
        System.out.println("Employee name      : " + ename);
        System.out.println("Employee Salary    : " + esal);
        System.out.println("Employee Address   : " + eaddr);
    }

}

public class Runner {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Employee emp1 = new Employee(0001, "Gimhana", 50000, "Mumbai");
        System.out.println("Employee Details Before Serialization ");
        emp1.getEmployeeDetails();
        oos.writeObject(emp1);
        System.out.println();

        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp2 = (Employee) ois.readObject();
        System.out.println("Employee Details After Deserialization ");
        emp2.getEmployeeDetails();

    }
}
