package com.reina.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","184416");
		
		/*
		 * PreparedStatement pst =
		 * con.prepareStatement("insert into employee values(?,?,?)"); pst.setInt(1, 6);
		 * pst.setString(2,"Beyonce"); pst.setInt(3, 24);
		 * 
		 * int x=pst.executeUpdate(); System.out.println(x+" record(s) inserted");
		 */
		/*
		 * PreparedStatement prt
		 * =con.prepareStatement("update employee set name=? where id=?");
		 * prt.setString(1, "Giselle"); prt.setInt(2, 4); int y= prt.executeUpdate();
		 * 
		 * System.out.println(y+" record(s) inserted");
		 */
	
		
			/*
			 * PreparedStatement prt
			 * =con.prepareStatement("delete from employee where id=?"); prt.setInt(1, 3);
			 * int y= prt.executeUpdate(); // System.out.println(y+" record(s) deleted");
			 */
		
		PreparedStatement pst = con.prepareStatement("select * from employee");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt("age"));
		}
	}
}
