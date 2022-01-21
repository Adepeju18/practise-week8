import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class EMPConnect {
	public static void main(String[]args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String DriveName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/hotel";
			String user = "root";
			String password = "root";
			
			try
			{
				Class.forName(DriveName);
				Connection con = DriverManager.getConnection(url, user, password);
				
				Statement stmt = con.createStatement();
				if(con != null)
				{
					System.out.println("Connection done !");
				}
//			Statement stmt = con.createStatement();
//			int row_count = stmt.executeUpdate("insert into employee(eid,ename,email,mobile,designation,salary)values("+eid+",'"+name+"'",'"+email+"',"+mobile+",'"+designation+"',"+salary+")");		
//			System.out.println("Row Insert :"+row_count);		

			String qry1 = "select * from employee";
			ResultSet rs = stmt.executeQuery(qry1);
			while(rs.next())
			{
				System.out.println("=========================");
				System.out.println("Employee id : "+rs.getInt("eid"));
				System.out.println("Employee name : "+rs.getString("ename"));
				System.out.println("Employee email : "+rs.getString("email"));
				System.out.println("Employee mobile : "+rs.getString("mobile"));
				System.out.println("Employee designation : "+rs.getString("designation"));
				System.out.println("Employee salary : "+rs.getString("salary"));
			}
			System.out.println("=========================");
			
			System.out.println("Enter employee id : ");
			int eid = sc.nextInt();
			
			System.out.println("Enter employee name : ");
			String name = sc.next();

			System.out.println("Enter employee email : ");
			String email = sc.next();
			
			System.out.println("Enter student mobile : ");
			String mobile = sc.next();
			
			System.out.println("Enter employee designation : ");
			String designation = sc.next();
			
			System.out.println("Enter student salary : ");
			String salary = sc.next();
			
			String qry2 = "insert into employee(eid,ename,email,mobile,designation,salary) values("+eid+", "+name+"','"+email+"',"+mobile+", "+designation+"', "+salary+"')";
			
			int insert_count = stmt.executeUpdate(qry2);
			if(insert_count != 1)
			{
				System.out.println("Please check query...");
			}
			
			}
			
catch(Exception ex)
{
			System.out.println("DB Error :"+ex);
}
		}

	}

 }

