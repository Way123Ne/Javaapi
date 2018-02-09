package com.threadwait.cn;

public class ThreadWait implements Runnable {

	private String name;
	private Object prev;
	private Object self;

	public ThreadWait(String name, Object prev, Object self) {
		super();
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
			synchronized (self) {
			System.out.println(name);
			count--;
			
			self.notify();
			}	
			try {
				prev.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}
		
}
