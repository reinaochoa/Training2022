package com.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArray {
public static void main(String[] args) {
	ArrayList<Integer> ArrList = new ArrayList<>();
	
	ArrList.add(10);
	ArrList.add(20);
	ArrList.add(30);
	ArrList.add(40);
	ArrList.add(50);
	ArrList.add(60);
	
	System.out.println("Current List: "+ArrList);
	Collections.reverse(ArrList);
	System.out.println("The List reversed: "+ArrList);
}
}
