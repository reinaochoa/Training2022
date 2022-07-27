package com.assignment3;

public class Bank {
 public static void main(String[] args) {
	 Deposit(100,10000);
	 Withdraw(150, 10000);
	 Withdraw(2000,1000);
}
 public static void Deposit(int num, int num2) {
	 System.out.println("New Balance is: "+(num+num2));
 }
 public static void Withdraw(int num, int num2) {
	 int Balance = num2-num;
	 
	 if(num2 >= num) 
		 System.out.println("New Balance is: "+Balance);
		 else
			 System.out.println("0");
	 
 }
}
