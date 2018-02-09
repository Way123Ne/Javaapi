package com.threadpriority.cn;

import com.threadsleep.cn.Thread1;
/*
 * 更改线程的优先级
 */
public class ThreadPriorityTest {
	static int MAX_PRIORITY = 10;
	static int MIN_PRIORITY = 1;
	public static void main(String[] args){
	Thread1 t1 = new Thread1("A");
	Thread1 t2 = new Thread1("B");
	t1.start();
	t2.start();
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	}
}
