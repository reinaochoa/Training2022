package com.assignment3;

public class WashingMachine {
 public static void main(String[] args) {
	switcho();
	
	int noOfClothes = 20;
	acceptClothes(noOfClothes);
	acceptDetergent();
	switchOFF();
}
 
 public static void switcho() {
 	System.out.println("Washing Machine is ON");
	
}
 public static int acceptClothes(int num) {
	 System.out.println("Clothes Accepted Value: "+num);
	 return num;
}
 public static void acceptDetergent() {
	 System.out.println("Detergent is here");
	
}
 public static void switchOFF() {
	 System.out.println("Wasshing Machine is Done, now turning off\n");
	
}
}
