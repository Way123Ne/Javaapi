package com.threadsleep.cn;

public class Thread1 extends Thread{

	private String name;

	public Thread1(String name) {
		//可super()也可不super() ==> 因为父类或接口的构造函数为空
		//super();
		this.name = name;
	}
	
	public void run() {
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println(name+"运行 :" + i);
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
