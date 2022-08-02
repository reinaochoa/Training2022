package com.reina.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcEx3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","184416");
	CallableStatement cst = con.prepareCall("{call insertEmp(?,?,?)}");
	cst.setInt(1, 7);
	cst.setString(2, "Mauricio");
	cst.setInt(3, 48);
	cst.execute();
	
	System.out.println("callable record inserted");
}

}
