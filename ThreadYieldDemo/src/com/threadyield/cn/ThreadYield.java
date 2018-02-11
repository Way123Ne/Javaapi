package com.threadyield.cn;

public class ThreadYield extends Thread {

	private String name;

	public ThreadYield(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("" + this.getName() + "---" + i);
			//当i为30时,该线程就会把cpu时间让掉,让其他或者自己的线程执行(也就是说谁先抢到谁先执行)
			if (i == 5) {
			this.yield();
		}
		}
	}

}
