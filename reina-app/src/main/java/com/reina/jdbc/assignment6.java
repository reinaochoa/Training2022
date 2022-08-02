package com.reina.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class assignment6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","184416");
		Statement st=con.createStatement();
		Scanner sc = new Scanner(System.in);
		/*JDBC-> use Prepared Statement and CallableStatment as well in the assignment
		Java Console ->Front End
		MySQL Database-> Backend (store atleast 5 records minimum)
		Getting the values from the user:
		Applly CRUD operations:
		i) Get the list of employees
		ii) Update the existing employee based in his/her id
		iii) Delete an employee based on the employee id
		iv) Get the employee by id
*/

		
		//i) Get the list of employees

		PreparedStatement pst = con.prepareStatement("select * from employee");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt("age"));
		}
		
		//ii) Update the existing employee based in his/her id
		PreparedStatement prt =con.prepareStatement("update employee set name=?, age=? where id=?");
		System.out.println("Enter Employee ID to Update: \n");
		int id=sc.nextInt();
		System.out.println("Enter Name: \n");
		String name=sc.next();
		System.out.println("Enter Age: \n");
		int age=sc.nextInt();
		
		prt.setString(1, name);
		prt.setInt(2, age);
		prt.setInt(3, id); 
		int y= prt.executeUpdate();
		  
		 System.out.println(y+" record(s) updated");
		 
		 //		iii) Delete an employee based on the employee id
		 PreparedStatement pr =con.prepareStatement("delete from employee where id=?"); 
		 System.out.println("enter ID number to Delete:  \n");
		 int num=sc.nextInt();
		 pr.setInt(1,num);
		 int z= pr.executeUpdate(); 
		 System.out.println(z+" record(s) deleted");
		 
		 //	iv) Get the employee by id
		 CallableStatement cst=con.prepareCall("{call GetEmpID(?)}");
		 System.out.println("Enter ID: \n");
			int gid=sc.nextInt();
			cst.setInt(1, gid);
			ResultSet r = cst.executeQuery();
			while(r.next()) {
			System.out.println(r.getInt(1) + " " + r.getString("name") + " " + r.getInt("age"));

		}
			
		
	}		
	
}
