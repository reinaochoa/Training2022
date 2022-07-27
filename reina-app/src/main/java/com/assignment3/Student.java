package com.assignment3;

public class Student {
  public static void main(String[] args) {
	
	  if(Average(85,65,96)) {
		  System.out.println("Passed");
	  }else
		  System.out.println("Failed");
	  
	  Input("John Doe");
	  
}
  public static boolean Average(int n1, int n2, int n3) {
	int sum= n1+n2+n3;
	  if((sum/3)>50)
		return true;
	else
		return false;
}
  public static String Input(String str) {
	  System.out.println(str);
	 return str;
}
}
