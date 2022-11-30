package com.basics.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
//		Date today = new Date();
		
		LocalDate today = LocalDate.of(2022, Month.AUGUST, 15);
		System.out.println(today);
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		
	}
}
