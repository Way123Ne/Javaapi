package com.threaddatatransmit.cn;

public class ThreadDataTrans extends Thread {
	private String name;

	public ThreadDataTrans(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("hello " + name);
	}

}
