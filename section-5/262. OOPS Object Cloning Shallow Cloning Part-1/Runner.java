
// There are two types of Clonings in Java:
// 1. Shallow Cloning.
// 2. Deep Cloning.

// 1. Shallow Cloning
// --> Shallow Cloning in default cloning mechanism in Java, where developers are not required ot defined cloining logic
// --> In Object class clone() method java has provides cloning loginc as per shallow cloning only.
// --> In java application, in Shallow cloning, when we are trying to perform cloning over container object then JVM will perform cloning over container object only,JVM will not perform cloning over contained object.

// Ex -> In java applications, "Employee has an Account" is one-to-one Association, where employee is container and Account is contained, where if we perform cloning over EMployee object then JVM will perform cloning over Employee object only, JVM will not perform Cloning over Account Object, that is, Original Employee object and Duplicate Employee Object referering the same Account Object.

public class Runner {

}
