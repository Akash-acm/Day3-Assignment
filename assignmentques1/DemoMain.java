package com.demo.assignmentques1;

public class DemoMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MyThread());
		Thread t2=new Thread(new MyThread());
		Thread t3=new Thread(new MyThread());
		t1.run();
		t2.start();
		t3.run();
	}

}
