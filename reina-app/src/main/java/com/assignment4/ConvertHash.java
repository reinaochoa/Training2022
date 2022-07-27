package com.assignment4;

import java.util.HashSet;

public class ConvertHash {
 public static void main(String[] args) {
	HashSet<String> hash = new HashSet<String>();
	hash.add("1");
	hash.add("2");
	hash.add("3");
	hash.add("4");
	hash.add("5");
	
	System.out.println("Original List using Hash: "+hash);
	String conv[] = new String[hash.size()];
	int i=0;
	for(String num:hash) {
		conv[i++] = num;
	}

	System.out.println("New List with Array");

	for(String num:conv) {
		System.out.println(num); 
	}
}
}
