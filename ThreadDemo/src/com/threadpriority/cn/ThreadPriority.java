package com.threadpriority.cn;

public class ThreadPriority extends Thread {

	private String name;

	public ThreadPriority(String name) {
		//��super()Ҳ�ɲ�super() ==> ��Ϊ�����ӿڵĹ��캯��Ϊ��
		//super();
		this.name = name;
	}
	
	public void run() {
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println(name+"���� :" + i);
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
