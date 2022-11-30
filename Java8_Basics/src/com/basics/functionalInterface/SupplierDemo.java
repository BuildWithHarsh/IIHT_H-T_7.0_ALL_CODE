package com.basics.functionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
	//get() method

	public static void main(String[] args) {
		Supplier<String> sup = () -> {return "hello world";};
		System.out.println(sup.get());
		
	}

}
