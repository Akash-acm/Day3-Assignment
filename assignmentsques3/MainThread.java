package com.demo.assignmentsques3;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1=new ChildThread();
		ChildThread t2=new ChildThread();
		ChildThread t3=new ChildThread();
		t1.run();
		//t1.start();
		t2.start();
		//t3.display();
		t3.run();
		

	}

}
