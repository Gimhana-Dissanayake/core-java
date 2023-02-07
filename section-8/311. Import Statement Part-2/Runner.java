
// Note: In a java file, we are able to provide atmost one package declaration statement, but, we are able to provide any no of import statements.

// Q. Is it possible to use classes and interfaces of a paticular package without importing the respective package?
// A. Yes, It is possible to use classes and interfaces of a particular package without implementing the repective package, but , we must use "Fully Qualified Names" of the classes and interfaces.

// Note: Providing classes names and interfaces names along with their respective package names is called as Fully Qualified Name

// Ex: java.io.BufferedReader
//     java.util.ArrayList
//     java.sql.ResultSet

// A java program with import statement;

import java.io.*;
public class Runner {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}

// A java program with out import statement;

class A{
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
}


// Note: In java applications, always, import statements are suggestable