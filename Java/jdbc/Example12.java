package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Example12{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		String name = "ravi";
		int roll = 5210094;
	 //	Scanner sc = new Scanner(System.in);
		Connection con = Database_C.createC();
		String  q="insert into Stu(name,id) values(?,?)";
		PreparedStatement pst = con.prepareStatement(q);
		pst.setString(1, name);
		pst.setInt(2, roll);
		pst.executeUpdate();
		
	}

}

