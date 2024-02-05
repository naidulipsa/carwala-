import java.sql.*;

import java.util.*;
public class car {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?"
		 		+ "user=root&password=root");
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("insert into carinfo.listcars values('k16','matuti',' maruti alto',10000)");
			stmt.executeUpdate("insert into carinfo.listcars values('o11','mahindra','mahindra lio',34000)");
			stmt.executeUpdate("update carinfo.listcars set carmodel='mahindra lio'  where carnumber='o11' "); 
			stmt.executeUpdate("insert into carinfo.listcars values('u12','honda','honda city',45000)");
			stmt.executeUpdate("insert into carinfo.listcars values('t13','renault','renault triber',67900)");
			stmt.executeUpdate("insert into carinfo.listcars values('k14','tata nexon','tiago',98000)");
			
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("body");
	}
	System.out.println("enter value of n");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	switch(n)
	{
	case 1:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?"
			 		+ "user=root&password=root");
				Statement stmt=con.createStatement();
				stmt.executeUpdate("insert into carinfo.listcars values('y34','kia',' kia sonet',11000)");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("handled");
		}
	break;
	case 2:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?"
			 		+ "user=root&password=root");
				Statement stmt=con.createStatement();
				stmt.executeUpdate("delete  from carinfo.listcars where carnumber='y34' ");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("handled");
		}
	break;
	case 3:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?"
			 		+ "user=root&password=root");
				Statement stmt=con.createStatement();
			//	stmt.executeUpdate("insert into  carinfo.latestcar values('w34','hyundai','hyundai aura',76000) ");
				//stmt.executeUpdate("insert into  carinfo.latestcar values('r94','bmw','bmw x1',87000) ");
			//	stmt.executeUpdate("insert into  carinfo.listcars values('w34','hyundai','hyundai aura',76000) ");
			//	stmt.executeUpdate("insert into  carinfo.listcars values('r94','bmw','bmw x1',87000) ");
				
				ResultSet rs=stmt.executeQuery("select * from carinfo.latestcar");
				System.out.println();
				while(rs.next())
				{
					String carnumber=rs.getString(1);
					String carname=rs.getString(2);
					String carmodel=rs.getString(3);
					double carprice=rs.getDouble(4);
					System.out.println(carnumber+" "+carname+" "+carmodel+" "+carprice);
					
				}
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("handled");
		}
	break;
	case 4:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?"
			 		+ "user=root&password=root");
				Statement stmt=con.createStatement();
				
				ResultSet rs=stmt.executeQuery("select * from carinfo.listcars");
				
				while(rs.next())
				{
					String carnumber=rs.getString(1);
					String carname=rs.getString(2);
					String carmodel=rs.getString(3);
					System.out.println(carnumber+" "+carname+" "+carmodel);
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("handled");
		}
	break;
    default:
    	System.out.println("invalid");

	}
}
}
