package com.threadsleep.cn;

public class ThreadSleepTest1 {

	public static void main(String[] args) {
		ThreadSleep1 t1 = new ThreadSleep1("A");
		ThreadSleep1 t2 = new ThreadSleep1("B");
		t1.start();
		t2.start();
		
//		�ظ�����start��������� ==> java.lang.IllegalThreadStateException
//		Thread1 t1 = new Thread1("A");
//		Thread1 t2 = t1;
//		t1.start();
//		t2.start();
	}
}
