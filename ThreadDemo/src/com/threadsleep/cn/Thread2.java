package com.threadsleep.cn;

public class Thread2 implements Runnable{

	private String name;

	public Thread2(String name) {
		//可super()也可不super() ==> 因为父类或接口的构造函数为空
		//super();
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println(name + "运行 :" + i);
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
