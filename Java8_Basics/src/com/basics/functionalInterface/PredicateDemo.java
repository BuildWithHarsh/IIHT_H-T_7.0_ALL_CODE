package com.basics.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> pred = (t) -> t%2==0;
//		System.out.println(pred.test(30));
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		list.stream().filter(pred).forEach(number -> System.out.println("Printing :" + number));
		
	}
}
