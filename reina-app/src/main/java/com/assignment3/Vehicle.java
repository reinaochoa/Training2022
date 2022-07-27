package com.assignment3;

public class Vehicle {
	
	int vehicleNo;
	String vehicleModel;
	String manufacturer;
	String color;
	
	Vehicle(int vNum, String vModel, String man, String clr){
		vNum = vehicleNo;
		vModel = vehicleModel;
		man = manufacturer;
		clr = color;
	}
	
	public static class Truck extends Vehicle{
		int loadCap;
		
		Truck(int vNum, String model, String man, String clr, int load ){
			super(vNum, model, man, clr);
			load = loadCap;
		}
		public void print() {
			System.out.println("Vehicle Number is: " + vehicleNo );
			System.out.println("Vehicle Model is: " + vehicleModel);
			System.out.println("Vehicle Manufacturer is: " + manufacturer);
			System.out.println("Vehicle Color is: " + color);
			System.out.println("Vehicle Loading Capacity is: " + loadCap + " tons");
		}
	}
	
}
