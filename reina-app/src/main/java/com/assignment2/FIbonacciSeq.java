package com.assignment2;

import java.util.Scanner;

public class FIbonacciSeq {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Length of Numbers Array: ");
		int length = scan.nextInt();
		int[] num = new int[length];
		num[0]=0;
		num[1]=1;
		
		for(int i=2;i<length;i++) {
			num[i] = num[i-1]+num[i-2];
		}
		
		scan.close();
		System.out.println("Fibonacci Sequence goes: ");
		for(int i=0;i<length;i++) {
			System.out.println(num[i]+" ");
		}
	}
}
