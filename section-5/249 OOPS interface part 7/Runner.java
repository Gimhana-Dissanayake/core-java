
// In general, in java applications, we are able to utilize interfaces to declare services and we will rpvide services implementation responsibilities to some other module developers or some third party org.

// EX: In JDBC, "driver" is an interface provided by Sun Microsystems and its implementation classes are provided by all Database vendors. Example of database vendors are Oracle, MySql, Sybase etc...

interface DBDriver {// SUN Microsystems
    void registerDriver();

    void connect();
}

class OracleDriver implements DBDriver {

    @Override
    public void registerDriver() {
        System.out.println("OracleDriver Registered with JDBC Application");

    }

    @Override
    public void connect() {
        System.out.println("Connection Established between Java application and Oracle database");

    }

}

class MySQLDriver implements DBDriver {

    @Override
    public void registerDriver() {
        System.out.println("MySQLDriver Registered with JDBC Application");

    }

    @Override
    public void connect() {
        System.out.println("Connection Established between Java application and MySQL database");

    }
}

class DB2Driver implements DBDriver {

    @Override
    public void registerDriver() {
        System.out.println("DB2Driver Registered with JDBC Application");

    }

    @Override
    public void connect() {
        System.out.println("Connection Established between Java application and DB2Driver database");

    }
}

public class Runner {

    public static void main(String[] args) {
        DBDriver oracleDriver = new OracleDriver();
        oracleDriver.registerDriver();
        oracleDriver.connect();
        System.out.println("--------------------------");

        DBDriver mySqlDriver = new MySQLDriver();
        mySqlDriver.registerDriver();
        mySqlDriver.connect();
        System.out.println("--------------------------");

        DBDriver db2Driver = new MySQLDriver();
        db2Driver.registerDriver();
        db2Driver.connect();
        System.out.println("--------------------------");
    }

}
