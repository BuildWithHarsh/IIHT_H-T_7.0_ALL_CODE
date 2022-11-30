package com.basics.interfaces;

public class Vehicle {
	public static void main(String[] args) {
		
		Drivable d1 = new car();
		Drivable d2 = new truck();
		Drivable d3 = new bike();
		d1.driven();
		d2.driven();
		d3.driven();
	}
}

class car implements Drivable {
	public void driven() {
		System.out.println("The car can be driven");
	}
}

class truck implements Drivable {
	public void driven() {
		System.out.println("The truck can be driven");
	}
}

class bike implements Drivable {
	public void driven() {
		System.out.println("The bike can be driven");
	}
}
