package MavenDEMO.GmailAutomate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnection {
	
	public static void main(String[] arg) throws ClassNotFoundException, SQLException{
	String dburl = "jdbc:mysql://localhost:3306/training1";
	String username ="root";
	String password ="Annant@1234";
	String query ="Select * from login";
	Class.forName("con.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(dburl,username,password);
	Statement stmt =con.createStatement();
	ResultSet rs =stmt.executeQuery(query);
	rs.next();
	{
		String Person = rs.getString("PersonID");
		String last =rs.getString("LastName");
		String fn =rs.getString("FirstName");
		String Add =rs.getString("Address");
		String C =rs.getString("City");
		System.out.println(Person);
		System.out.println(last);
		System.out.println(fn);
		System.out.println(Add);
		System.out.println(C);
		con.close();
				
	}
	}
}

