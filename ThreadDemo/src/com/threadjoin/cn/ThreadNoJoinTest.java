package com.threadjoin.cn;

public class ThreadNoJoinTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "���߳����п�ʼ");
		
		ThreadNoJoin nj1 = new ThreadNoJoin("A");
		ThreadNoJoin nj2 = new ThreadNoJoin("B");
		nj1.start();
		nj2.start();

		System.out.println(Thread.currentThread().getName() + "���߳����н���");

	}
}
