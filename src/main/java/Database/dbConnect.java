package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConnect {

	private final static String USERNAME = "user2019";
	private final static String PASSWORD = "dECODERS@2140";
	private final static String CONN = "jdbc:mysql://54.84.172.164:3306/student_records";


	public static Connection getConnection() throws SQLException {
        try{
	        Connection connection = DriverManager.getConnection(CONN, USERNAME, PASSWORD);
	        System.out.println("Database Connected!");
	        return connection;
        } catch (SQLException ex) {
	        throw new SQLException("Cannot to the database", ex);
        }

	}
}
