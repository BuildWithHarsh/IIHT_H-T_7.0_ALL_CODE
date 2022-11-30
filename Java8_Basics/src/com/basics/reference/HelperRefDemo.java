package com.basics.reference;

import java.time.LocalDate;

public class HelperRefDemo {

	public static void progress() {
		System.out.println("Project is making project");
		LocalDate now = LocalDate.now();
		System.out.println("on : " + now.toString());
	}

	public static void threadProcess() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static void oddThread() {
		for (int i = 1; i <= 100; i=i+2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
