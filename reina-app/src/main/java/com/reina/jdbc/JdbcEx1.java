package com.reina.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","184416");
	Statement st=con.createStatement();
	/*st.execute("insert into employee values(1,'DYLAN',25)");
	st.execute("insert into employee values(2,'Jackson',20)");
	st.execute("insert into employee values(3,'Sandra',45)");
	st.execute("insert into employee values(4,'Sarah',24)");
	st.execute("insert into employee values(5,'Lence',25)");*/

	st.execute("update employee set name='Reina' where id=3");
	st.execute("delete from employee where id=5");
	ResultSet rs = st.executeQuery("select * from employee");
	
	while(rs.next()) { 
		System.out.println("Emp Number : "+rs.getInt(1));
		System.out.println("Emp Name : "+rs.getString("name"));
		System.out.println("Emp Age : "+rs.getInt("age"));
	}


}		
}
               