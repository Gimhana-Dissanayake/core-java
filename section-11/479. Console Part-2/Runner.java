import java.io.Console;

public class Runner {

    public static void main(String[] args) {
        Console c = System.console();
        String uname = c.readLine("User Name : ");
        char[] pwd = c.readPassword("Password : ");

        String upwd = new String(pwd);

        if (uname.equals("gim") && upwd.equals("hello")) {
            System.out.println("Login successfull");
        } else {
            System.out.println("Incorrect credentials");
        }
    }

}

// 1. Get Console object
// Console c = System.console()

// 2. Read Dynamic Input through Console:
// To display message and to read dynamic input in the from of String, we have t
// use
// public String readLine(String message)

// To display message and to read password data in the form of char[]:
// public char[] readPassword(String message):

// Note: Console is not supported by Eclipse IDE
