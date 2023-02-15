import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Student implements Externalizable {

    String sid;
    String sname;
    String semail;
    String smobile;

    public Student(String sid, String sname, String semail, String smobile) {
        this.sid = sid;
        this.sname = sname;
        this.semail = semail;
        this.smobile = smobile;
    }

    public Student() {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("From Read External method");
        sid = "GIM-" + in.readInt();
        sname = in.readUTF();
        semail = in.readUTF() + "@gmail.com";
        smobile = "077-" + in.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        try {
            System.out.println("From writeExternal method");
            String[] str1 = sid.split("-");
            int rollNo = Integer.parseInt(str1[1]);

            String[] str2 = semail.split("@");
            String email = str2[0];

            String[] str3 = smobile.split("-");
            long mobile = Long.parseLong(str3[1]);

            out.writeInt(rollNo);
            out.writeUTF(sname);
            out.writeUTF(email);
            out.writeLong(mobile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getStudentDetails() {
        System.out.println("Student Detalis");
        System.out.println("----------------");
        System.out.println("Student Id       : " + sid);
        System.out.println("Student Name     : " + sname);
        System.out.println("Student Email    : " + semail);
        System.out.println("Student Mobile   : " + sid);

    }

}

public class Runner {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student std1 = new Student("GIM-168", "Sampath", "sampath@gmail.com", "077-4567891");
        System.out.println("Student details before serialization");
        std1.getStudentDetails();
        System.out.println("==========Before Serialization=======");
        oos.writeObject(std1);
        System.out.println("==========After Serialization=======");
        System.out.println();

        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("========Before Deserialiazation=============");
        Student std2 = (Student) ois.readObject();
        System.out.println("========After Deserialiazation=============");
        System.out.println("Student Details after deseriliazation");
        std2.getStudentDetails();
    }
}
