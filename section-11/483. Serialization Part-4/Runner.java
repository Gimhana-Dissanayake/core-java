// Watch the lecture

public class Runner {

}
// Steps to perform Serialization in Standalone Applications:
// 1. Create Serialization Object:
// The object whose classes must implement java.io.Serialization interface.

// class Employee implements Serializable{}

// Employee emp1 = new Employee(111, "AAA", 5000);

// 2. Create FileOutputStream with the target file to send Serialized Data.
// FileOutputStream fos = new FileOutputStream("emp.txt");

// 3. Create ObjectOutputStream with FileOutputtream:
// ObjectOutputSteam oss = new ObjectOutputSteam(fos)

// 4. Write Serializable Object to ObjectOutputStream.
// oss.writeObject(emp1);

// 5. When we submit Serialization Object to ObjectOutputStream,
// ObjectOutputStream will perform the required Serialization and it will submit
// the Serialized data to FileOutputStream, where FileOutputStream will submit
// data to the target file.