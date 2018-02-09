package com.threadjoin.cn;

public class ThreadNoJoin extends Thread {
	private String name;

	public ThreadNoJoin(String name) {
		super(name);
		this.name = name;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"�߳����п�ʼ!");
		
		for(int i = 0 ; i < 3;i++){
			System.out.println("���߳�"+name+"����:"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"�߳����н���!");
	}
	
}
