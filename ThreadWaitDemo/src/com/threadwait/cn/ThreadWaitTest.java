package com.threadwait.cn;

public class ThreadWaitTest {

	public static void main(String[] args) throws InterruptedException {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		ThreadWait tw = new ThreadWait("A", o3, o1);
		ThreadWait tw2 = new ThreadWait("B", o1, o2);
		ThreadWait tw3 = new ThreadWait("C",o2, o3);
		
		new Thread(tw).start();
		Thread.sleep(100);
		new Thread(tw2).start();
		Thread.sleep(100);
		new Thread(tw3).start();
		Thread.sleep(100);
		
	}
}
