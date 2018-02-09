package com.threaddatatransmit.cn;
/*
 * 线程数据传递: 
 * 第一种方法:
 * 通过构造方法传递数据
 */
public class ThreadDataTransTest {

	public static void main(String[] args) {
	ThreadDataTrans dt = new ThreadDataTrans("world");
	dt.start();
	}
}
