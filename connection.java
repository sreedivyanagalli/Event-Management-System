package EventManagementSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//public class connection {

//	public static void main(String[] args) {
//		Connection c = null;
//	      try {
//	         Class.forName("org.postgresql.Driver");
//	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EventManagementSystem", "postgres", "ajay117");
//	      } catch (Exception e) {
//	         e.printStackTrace();
//	         System.err.println(e.getClass().getName()+": "+e.getMessage());
//	         System.exit(0);
//	      }
//	      System.out.println("Opened database successfully");
//		
//	}
//}
	public class connection {
	    static final String DB_URL = "jdbc:postgresql://localhost:5432/EventManagementSystem";
	    static final String USER = "postgres";
	    static final String PASS = "ajay117";
	    public static Connection connect() {
	        try {
	            return DriverManager.getConnection(DB_URL, USER, PASS);
	        } catch (SQLException e) {
	            System.out.println(e.getClass().getName() + ": " + e.getMessage());
	            System.exit(0);
	        }
	        return null;
	    }
	}