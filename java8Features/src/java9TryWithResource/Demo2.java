package java9TryWithResource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo2 {

	public static void main(String args[]) throws ClassNotFoundException
	{
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "deepa", "deepa@123");
			Statement stm=con.createStatement();
			System.out.println(stm.execute("select * from customer"));
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e.getMessage());
		}
	}
}
