
// 2. Deep Cloning 
// Deep cloning is not default cloning mechanism in Java, it is explicit cloning mechanism, where developers must defined cloning logic explicitly.

// In java applications, in deep cloning if we perform cloning over container object then JVM will perform cloning over container object and contained object.

// In java application, Employee has an Account is One-To-One Association, where Employee container and Account is Contained, in Deep Cloning, if we clone Employee Object then JVM will perform  cloning over Employee object and Account object, that is , original Employee object will refer Original Account Object and Duplicate Employee Object will refer Duplicate Account Object.

public class Runner {

}
