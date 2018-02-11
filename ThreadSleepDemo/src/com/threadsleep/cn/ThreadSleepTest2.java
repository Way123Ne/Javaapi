package com.threadsleep.cn;

public class ThreadSleepTest2 {

	public static void main(String[] args) {
		
		ThreadSleep2 t3 = new ThreadSleep2("C");
		ThreadSleep2 t4 = new ThreadSleep2("D");
		
		new Thread(t3).start();
		new Thread(t4).start();
		
		//new Thread(new Thread2("C")).start();
		//new Thread(new Thread2("D")).start();
		
	}
}
