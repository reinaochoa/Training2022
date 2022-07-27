package com.assignment4;

import java.util.LinkedList;

public class ReplaceLL {
 public static void main(String[] args) {
	LinkedList<Integer> LL  = new LinkedList<>();
	LL.add(1);
	LL.add(2);
	LL.add(3);
	LL.add(4);
	LL.add(5);
	LL.add(6);
	
	System.out.println("Original List: "+LL);
	LL.set(2, 1);
	System.out.println("New List with Replacing an Element: "+LL);
	
}
}
