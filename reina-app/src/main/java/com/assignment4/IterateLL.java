package com.assignment4;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLL {
 public static void main(String[] args) {
	LinkedList<Integer> LL = new LinkedList<>();
	
	LL.add(1);
	LL.add(2);
	LL.add(3);
	LL.add(4);
	LL.add(5);
	LL.add(6);
	 
	Iterator<Integer> i = LL.listIterator(3);
	while(i.hasNext()) {
		System.out.println(i.next()+" ");
	}

	
 }
 
}
