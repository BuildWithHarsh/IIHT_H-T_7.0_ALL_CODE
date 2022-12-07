package com.task.sprint1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortCourses {

	public static void main(String[] args) {
		
		//Creating the object of Course Class
		Course CAT = new Course(101, "CAT", 12, 10000, "Rohit");
		Course NEET = new Course(102, "NEET", 18, 25000, "Rahul");
		Course CA = new Course(103, "CA", 30, 22000, "Aakash");
		Course JEE = new Course(104, "JEE", 15, 24000, "Jayant");
		Course JAVA = new Course(105, "JAVA Language", 6, 5000, "Sujit");
		Course C = new Course(106, "C Language", 6, 5000, "Pratik");
		Course PYTHON = new Course(107, "Python Language", 6, 5000, "Arjun");
		Course UPSC = new Course(108, "Civil Services", 24, 55000, "Vikas");
		Course SSC = new Course(109, "SSC", 18, 35000, "Shubham");
		Course BANK_PO = new Course(110, "Bank PO", 12, 2000, "Vipul");
		Course AWS = new Course(111, "Amazon Web Services", 12, 10000, "Harsh");
		Course DEVOPS = new Course(112, "Devops", 10, 10000, "Siddharth");
		Course RRB = new Course(113, "RRB", 12, 24000, "Naman");
		Course JRE = new Course(114, "JRE", 12, 10000, "Gaurav");
		Course ATC = new Course(115, "ATC", 6, 7000, "Akansha");

		//Add the courses into the Arraylist of Course type
		List<Course> coursesList = new ArrayList<>();
		coursesList.add(CAT);
		coursesList.add(NEET);
		coursesList.add(CA);
		coursesList.add(JEE);
		coursesList.add(JAVA);
		coursesList.add(C);
		coursesList.add(PYTHON);
		coursesList.add(UPSC);
		coursesList.add(SSC);
		coursesList.add(BANK_PO);
		coursesList.add(AWS);
		coursesList.add(DEVOPS);
		coursesList.add(RRB);
		coursesList.add(JRE);
		coursesList.add(ATC);
		
		
		//Basic while loop for looping into the application ,the loop will be terminated based on some condition
		boolean flag = true;
		while (flag) {
			
			System.out.println("====================================================================================");
			System.out.println("Please Select the Number to sort the Courses : ");
			System.out.println(" Press 1 to Sort pricewise Ascending ");
			System.out.println(" Press 2 to Sort pricewise Descending ");
			System.out.println(" Press 3 to sort durationwise longest");
			System.out.println(" Press 4 to sort durationwise Shortest");
			System.out.println(" Press 5 to Exit");
			Scanner sc = new Scanner(System.in);
			int selectedOption = sc.nextInt();
			if (selectedOption == 1) {
				CoursePriceComparatorAsc priceCompareAsc = new CoursePriceComparatorAsc();
				Collections.sort(coursesList,(c1,c2)-> (c1.getCourseFees()<c2.getCourseFees()?-1:c1.getCourseFees()>c2.getCourseFees()?1:0));
//				Collections.sort(coursesList, priceCompareAsc);
				for (Course c : coursesList) {
					System.out.println(c.getCourseName() + " : " + c.getCourseFees());
				}
			} else if (selectedOption == 2) {
				CoursePriceComparatorDesc priceCompareDesc = new CoursePriceComparatorDesc();
				Collections.sort(coursesList, priceCompareDesc);
				for (Course c : coursesList) {
					System.out.println(c.getCourseName() + " : " + c.getCourseFees());
				}
			} else if (selectedOption == 3) {
				CourseDurationComparatorDesc durationCompareShort = new CourseDurationComparatorDesc();
				Collections.sort(coursesList, durationCompareShort);
				for (Course c : coursesList) {
					System.out.println(c.getCourseName() + " : " + c.getCourseDuration() + " Months");
				}
			} else if (selectedOption == 4) {
				CourseDurationComparatorAsc durationCompareLong = new CourseDurationComparatorAsc();
				Collections.sort(coursesList, durationCompareLong);
				for (Course c : coursesList) {
					System.out.println(c.getCourseName() + " : " + c.getCourseDuration() + " Months");
				}
			} else if (selectedOption == 5) {
				System.out.println("Thank You for using the feature");
				System.exit(0);
			} else {
				System.out.println("Please Enter a valid Input");
			}
		}

	}

}
