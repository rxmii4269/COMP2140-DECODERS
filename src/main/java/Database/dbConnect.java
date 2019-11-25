package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {

    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassowrd";
    private static final String CONN = "jdbc:mysql://localhost/waterFord.sql";
    private static final String SQCONN = "jdbc:sql:waterFord.sql";


    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("org.sqllte.JDBC");
            return DriverManager.getConnection(SQCONN);
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
