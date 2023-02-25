
// finally block

// It will include a set of instruction to execute irrespective of getting
// exception in try block and irrespective of executing catch block.

// In general, in java applications we will use some resource like database
// connection, input and output streams,.... as per the requirment, in general,
// resources may raise some exception when we perfomr operations with resources,
// to handle these exceptions if we use try-catch-finally then we have to open
// resources inside try block and we must close the resources inside finally
// block, because, finally block is giving gurantee for excecution, that is, in
// any situations, resources will be closed if we keep resources closing
// operations in finally block.

public class Runner {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
        } catch (Exception e) {
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }
    }
}