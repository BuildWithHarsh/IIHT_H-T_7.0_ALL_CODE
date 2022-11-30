package com.basics.reference;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method Refernce Demo : ");
		
		IWork iWork = HelperRefDemo::progress;
		iWork.doProject();
		
//		Runnable runnable = HelperRefDemo::threadProcess;
//		Thread t1 = new Thread(runnable);
//		t1.start();
		
		Runnable runnable = HelperRefDemo::oddThread;
		Thread t2 = new Thread(runnable);
		t2.start();
	}
}
