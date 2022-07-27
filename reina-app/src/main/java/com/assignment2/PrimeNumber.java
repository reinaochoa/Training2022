package com.assignment2;

import java.util.Scanner;

public class PrimeNumber {


	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number: ");
		int num = scan.nextInt();
		
		for(int i=0;i<num;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			
			}
		scan.close();
		}
	}
}

