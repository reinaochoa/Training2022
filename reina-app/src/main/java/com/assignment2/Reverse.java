package com.assignment2;

import java.util.Scanner;

public class Reverse {
 public static void main(String[] args) {
	Scanner word = new Scanner(System.in);
	
	System.out.println("Enter a word to Reverse: \n");
	String reverse = word.next();
	String neword ="";
	char c;
	word.close();
	for(int i=0;i<reverse.length();i++) {
		c = reverse.charAt(i);
		neword = c+neword;
	}
	System.out.println("The word is Now: "+neword);
	
	
}
}
