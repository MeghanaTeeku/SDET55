package myProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DemoJdbcCon {

	public static void main(String[] args) throws SQLException {
		//register Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet55", "root", "root");

		//create statement
		Statement state = con.createStatement();
		String query="select *from test;";
		//String query="insert into test values('hari','java',3);";
		
		//execute statement
		ResultSet res = state.executeQuery(query);
		//int res = state.executeUpdate(query);
//		while(res.next())
//		{
//			System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
//		}
		
		while(res.next())
		{
			for(int i=1;i<=3;i++)

		{
			System.out.print(res.getString(i)+" ");
		}
		System.out.println(" ");
		}
		//close db
		con.close();
	}
	}

