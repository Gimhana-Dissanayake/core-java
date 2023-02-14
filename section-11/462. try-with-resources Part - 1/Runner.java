import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.DriverManager;

public class Runner {

}

// try-with-resource in IOStreams:
// In general, in java applications, we will use number of resources like
// database connections, network connections, input and output stream....

// while performin operations with these resources we may get exceptions(like
// when closing connections), to
// handle these exceptions if we use try-catch-finally then java has provided
// the following conventions.

// 1. Declare the resource before try block.
// 2. Create the resources inside try block.
// 3. Close the resource inside finally block.

// EX:

// Connection con = null;
// FileInputStream fis = null;
// BufferedReader br = null;

// try
// {
// con = DriverManager.getConnection("");
// fis = new FileInputStream("----------");
// br = new BufferedReader(new InputStreamReader("-----------"));
// }catch(
// Exception e)
// {

// }finally
// {
// try{

// }catch(Exception e){

// }
// }