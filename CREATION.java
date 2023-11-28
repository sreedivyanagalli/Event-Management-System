package EventManagementSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CREATION {

	public static void main(String[] args) {
		Connection c = connection.connect();
		Statement stmt = null;
	      try {
		         System.out.println("Opened database successfully");
		         stmt = c.createStatement();

	         String sql = "CREATE TABLE EventDetails" +
	            "(User_ID  VARCHAR(10) PRIMARY KEY     NOT NULL," +
	         " Event_Status   VARCHAR(20)    NOT NULL, " +
	            "Amount_Paid  VARCHAR(20)   NOT NULL, " +
                "Pending_Amount      VARCHAR(100)    NOT NULL)";
	         String sql3 = "CREATE TABLE EventDetails1" +
	 	            "(EVENT_NAME  VARCHAR(10)  NOT NULL," +
	 	         " EVENT_TYPE   VARCHAR(20)    NOT NULL, " +
	 	            "PRICE_RANGE  VARCHAR(20)   NOT NULL, " +
 	           "AVAILABILITY  VARCHAR(20)   NOT NULL, " +
                  "FOOD_REQUIREMENT      VARCHAR(100)    NOT NULL)";
	         String sql4 = "CREATE TABLE UpdateEvent" +
		 	            "(USER_ID  VARCHAR(10)  NOT NULL," +
		 	         " EVENT_NAME  VARCHAR(20)    NOT NULL, " +
		 	            "SLOT_CHANGE  VARCHAR(20)   NOT NULL, )";

	         String sql1 = "CREATE TABLE CustomerInfo1" +
	 	            "(User_ID  VARCHAR(10) PRIMARY KEY NOT NULL," +
	 	            " UserName  VARCHAR(100)    NOT NULL, " +
	 	            " Contact_NO VARCHAR(100)    NOT NULL, " +
	 	            " Email_Address  VARCHAR(50) NOT NULL , "+
	 	           " Event  VARCHAR(50) NOT NULL , "+
	 	          " Deposit  VARCHAR(50) NOT NULL , "+
	 	            "Event_Status VARCHAR(50) NOT NULL  )";

	         String sql2 = "CREATE TABLE Department1" +
		 	            "(Department VARCHAR(20) PRIMARY KEY NOT NULL, " +
		 	            " Amount INT NOT NULL )";
         stmt.executeUpdate(sql);
         stmt.executeUpdate(sql1);
         stmt.executeUpdate(sql2);
	     stmt.executeUpdate(sql3);
	     stmt.executeUpdate(sql4);
         stmt.close();
	         c.close();	      
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");
		
	}
}