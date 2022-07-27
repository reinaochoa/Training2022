package com.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class swapTwo {
	public static void main(String[] args) {
		ArrayList<Integer> ArrList = new ArrayList<>();
		
		ArrList.add(10);
		ArrList.add(20);
		ArrList.add(30);
		ArrList.add(40);
		ArrList.add(50);
		ArrList.add(60);
		ArrList.add(70);
		ArrList.add(80);
		
		System.out.println("Current List: "+ArrList);
		Collections.swap(ArrList, 0, 7);
		Collections.swap(ArrList, 1, 6);
		Collections.swap(ArrList, 2, 5);
		System.out.println("The List swapped: "+ArrList);
	}
}
