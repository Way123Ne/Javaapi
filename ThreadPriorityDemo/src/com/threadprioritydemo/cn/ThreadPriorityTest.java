package com.threadprioritydemo.cn;

import com.threadsleep.cn.ThreadSleep1;
/*
 * �����̵߳����ȼ�
 */
public class ThreadPriorityTest {
	static int MAX_PRIORITY = 10;
	static int MIN_PRIORITY = 1;
	public static void main(String[] args){
	ThreadSleep1 t1 = new ThreadSleep1("A");
	ThreadSleep1 t2 = new ThreadSleep1("B");
	t1.start();
	t2.start();
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	}
}
