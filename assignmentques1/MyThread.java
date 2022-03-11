package com.demo.assignmentques1;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {	for(int i=0;i<10;i++) {
			System.out.println("Namaste Bharat "+i);
	Thread.sleep(2000);	
	}}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	}
}
