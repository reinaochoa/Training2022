package com.assignment2;

public class SwapVariables {
    public static void main(String[] args) {
		int swap1 = 1;
		int swap2 = 2;
		int temp;
		
		System.out.println("Original Placemement for 1 is: "
				+swap1+" and for 2 is: "+swap2);
		temp=swap1;
		swap1=swap2;
		swap2=temp;
		
		System.out.println("NEW Placemement for 1 is: "
				+swap1+" and for 2 is: "+swap2);
		
	}
}
