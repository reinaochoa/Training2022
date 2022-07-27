package com.assignment5;

import java.util.ArrayList;
import java.util.List;

public class Employee {
   int employeeID;
   String employeeName;
   int employeeAge;
   String employeeGender;
   String DEPT;
   int startDate;
   int employeeSalary;
   
   public Employee(int employeeID, String employeeName, int employeeAge, String employeeGender, String DEPT, int startDate, int employeeSalary) {
	   this.employeeID = employeeID;
	   this.employeeName = employeeName;
	   this.employeeAge = employeeAge;
	   this.employeeGender = employeeGender;
	   this.DEPT=DEPT;
	   this.startDate=startDate;
	   this.employeeSalary= employeeSalary;
   }
   
   public int getID() {
	   return employeeID;
   }
   public String getName() {
	   return employeeName;
   }
   public int getAge() {
	   return employeeAge;
   }
   public String getGender() {
	   return employeeGender;
   }
   public String getDept()
   {
	   return DEPT;
}
   public int getStartDate()
{
	   return startDate;
}
   public int getSalary() {
	   return employeeSalary;
   }
   @Override
	public String toString() {
		return "Employee ID"+employeeID+"\n Employee Name: "+employeeName+
				"\n Employee Age: "+employeeAge+"\n Employee Gender: "+employeeGender+
				"\n Employee Department: "+DEPT+"\n Employee Start Year: "+startDate+
				"\n Employee Salary: "+employeeSalary;
	}
   
   public static void main(String[] args) {
	
	   List<Employee> emp = new ArrayList<>();
	   
	   emp.add(new Employee(011, "John Doe", 25, "Male","SE", 2022, 60000));
	   emp.add(new Employee(012, "Jane Doe", 30, "Female","HR", 2010, 75000));
	   emp.add(new Employee(013, "Jackson Rich", 32, "Male","HR", 2011, 75000));
	   emp.add(new Employee(014, "John Low", 40, "Male","SE", 2022, 100000));
	   emp.add(new Employee(015, "Mark Jee", 21, "Female","SE", 2022, 60000));

	   
 	   //i) How many male and female employees are there in this organization?
	  //ii) Find out Average age of male and female emps?
	 //iii) Find the highest paid employee in this org?
	//iv) List all te names of employee who has joined after 2015?
		//v) Find out the senior most employee in this org?
		// vi)Count the number of emps in each department?
	//   vii)Find male and female employees are in Maintenance department?
//	   viii) Find the average slary of male and female employees?
	   //ix) Differentiat eht the employees who are younger or equal to 30 yrs from those employees who older than 25 years
	// x) List down the names of all employees in each department?


}
}
