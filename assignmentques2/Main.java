package com.demo.assignmentques2;

public class Main {
	public static void main(String[] args) {
		RunnableEx rd = new RunnableEx();
		Thread t1 = new Thread(rd);

		t1.start();

	}

}
