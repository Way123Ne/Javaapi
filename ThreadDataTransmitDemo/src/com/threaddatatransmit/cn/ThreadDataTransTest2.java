package com.threaddatatransmit.cn;
/*
 * 线程数据传递:
 * 第二种方法:
 * 通过变量和方法传递数据
 */
public class ThreadDataTransTest2 {

	public static void main(String[] args){
		ThreadDataTrans2 dt2 = new ThreadDataTrans2();
		dt2.setName("world");
		new Thread(dt2).start();
	}
}
