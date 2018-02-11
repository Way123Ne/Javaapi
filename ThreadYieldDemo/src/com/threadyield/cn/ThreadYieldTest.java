package com.threadyield.cn;
/*
 * yield():暂停当前正在执行的线程对象,并执行其他线程
 * 运行结果2种情况:
 * 1>李四(线程)当执行到i=5时会让cpu时间让掉,这时张三(线程)抢到cpu时间并执行
 * 2>张三(线程)当执行到i=5时会让cpu时间让掉,这时李四(线程)抢到cpu时间并执行
 */

public class ThreadYieldTest {

	public static void main(String[] args){
		ThreadYield  yt1 = new ThreadYield("张三");
		ThreadYield  yt2 = new ThreadYield("李四");
		yt1.start();
		yt2.start();
	}
}
