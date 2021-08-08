package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Database_C {

	 static Connection con;
	 public static Connection createC() throws ClassNotFoundException, SQLException
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/exam?autoReconnect=true&useSSL=false";
		 con = DriverManager.getConnection(url,"root","root");
		 return con;
	 }
    
	
}
