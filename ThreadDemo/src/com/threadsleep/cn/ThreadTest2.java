package com.threadsleep.cn;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		Thread2 t3 = new Thread2("C");
		Thread2 t4 = new Thread2("D");
		
		new Thread(t3).start();
		new Thread(t4).start();
		
		//new Thread(new Thread2("C")).start();
		//new Thread(new Thread2("D")).start();
		
	}
}
