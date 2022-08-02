package com.assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
	   emp.add(new Employee(015, "Mark Jee", 21, "Female","SE", 2008, 60000));

	   
 	   //i) How many male and female employees are there in this organization?
	   Map<String, Long> cnt = emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(cnt);
	
	  //ii) Find out Average age of male and female emps?
		Map<String, Double> average = emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(average);
	 //iii) Find the highest paid employee in this org?
		Optional<Employee> highestPaidEmp = emp.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
		Employee highestEmp = highestPaidEmp.get();
		System.out.println("Highest Paid Employee: "+highestEmp.employeeName+" with Salary: "+highestEmp.employeeSalary);
	//iv) List all te names of employee who has joined after 2015?
		emp.stream().filter(e -> e.getStartDate() > 2015).map(Employee::getName).forEach(System.out::println);
		//v) Find out the senior most employee in this org?
		Optional<Employee> seniorMostEmp = emp.stream().sorted(Comparator.comparingInt(Employee::getStartDate)).findFirst();
		Employee senior = seniorMostEmp.get();
		System.out.println("Senior Employee is: "+senior.employeeName);
		// vi)Count the number of emps in each department?
		Map<String, Long> DeptCnt = emp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println(DeptCnt);
		//   vii)Find male and female employees are in Maintenance department?
		//	viii) Find the average slary of male and female employees?
		Map<String, Double> avg = emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avg);
	   //ix) Differentiat eht the employees who are younger or equal to 30 yrs from those employees who older than 25 years
		Map<Boolean, List<Employee>> emp30 = emp.stream().collect(Collectors.partitioningBy(e->e.getAge() <= 30 ));
		Map<Boolean, List<Employee>> emp25 = emp.stream().collect(Collectors.partitioningBy(e->e.getAge() > 25));
		Set<Entry<Boolean, List<Employee>>> entry1= emp30.entrySet();
		Set<Entry<Boolean, List<Employee>>> entry2 = emp25.entrySet();
		for(Entry<Boolean, List<Employee>> entry : entry1) {
			if(entry.getKey()) {
				System.out.println("Employees younger or equal to 30");
			}
			List<Employee> Emp = entry .getValue();
			for(Employee e : Emp) {
				System.out.println(e.getName());
			}
		}
		
		}
		
	// x) List down the names of all employees in each department?

   
}

