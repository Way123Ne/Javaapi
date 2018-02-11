package com.threaddatatransmit.cn;

public class ThreadDataTrans2 implements Runnable {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello " + name);
	}

}
