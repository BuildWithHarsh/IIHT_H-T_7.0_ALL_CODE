package com.basics.lambda;

public class LearnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations add = (Integer a , Integer b) -> a+b;
		MathOperations sub = (Integer a , Integer b) -> a-b;
		MathOperations multi = (Integer a , Integer b) -> a*b;
		MathOperations div = (Integer a , Integer b) -> a/b;
		
		System.out.println(add.operation(100, 50));
		System.out.println(sub.operation(100, 50));
		System.out.println(multi.operation(100, 50));
		System.out.println(div.operation(100, 50));		

	}

}
