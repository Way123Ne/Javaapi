package com.threadsleep.cn;

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1("A");
		Thread1 t2 = new Thread1("B");
		t1.start();
		t2.start();
		
//		�ظ�����start��������� ==> java.lang.IllegalThreadStateException
//		Thread1 t1 = new Thread1("A");
//		Thread1 t2 = t1;
//		t1.start();
//		t2.start();
	}
}
