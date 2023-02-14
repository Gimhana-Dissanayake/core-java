// watch the lecture

public class Runner {
    public static void main(String[] args) {

    }
}

// Steps to perform Deserialization

// 1. Create FileInputStream from a file which contains Serialized data.
// FileInputStream fis = new FileInputStream("emp.txt");

// 2. Create ObjectInputStream with FileInputStream:
// ObjectInputStream ois = new ObjectInputStream(fis);

// When we create ObjectInputStream, ObjectInputStream will take deserialized
// data from FileInputStream, it will perform the required Deserializationa nd
// it will generate the deserialized Object.

// 3. Read Deserialized Object from ObjectInputStream.
// Employee emp2 = (Employee) ois.readObject(0);