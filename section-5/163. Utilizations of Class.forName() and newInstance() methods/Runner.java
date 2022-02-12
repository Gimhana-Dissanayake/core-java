
//In JDBC Applications

//1.Load and Register Driver
//2. Establish Connection between Java application and Database.
//3. Create either Statement or PreparedStatement or CallableStatement.
//4.Write and Execute SQL queries.
//5. Close and Resources like Connection, Statement...

//Class c = Class.forName("oracle.jdbc.OracleDriver") --> Oracle

//Class c = Class.forName("com.mysql.cj.jdbc.Driver") --> MySQL

//In server side components like Servlets, JSPs, EJBS,..

//---servlet lifecycle---

//1.servlet loading ---> Class c = Class.forName("MyServlet");
//2.servlet instantiation ---> MyServlet ms = (MS)c.newInstance();
//3.servlet Initialization
//4.Request processing
//5.Servlet Deinstantiation


//JSP Lifecycle:

//1.JSP loading;
//2. JSP Parsing
//3. Jsp Transalation to Servlet
//4. Servlet Compilation
//5. Servelt Loading --> Class c =  Class.forName(--)
//6.Servlet Instantiation --> Object obj = c.newInstance();


public class Runner {
    
}
