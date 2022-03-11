package com.demo.assignmentsques5;

public class Main {
	public static void main(String[] args) {
		Join t1 = new Join();
		Join t2 = new Join();
		Join t3 = new Join();

		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}

}
