package com.threadsleep.cn;

public class Thread2 implements Runnable{

	private String name;

	public Thread2(String name) {
		//��super()Ҳ�ɲ�super() ==> ��Ϊ�����ӿڵĹ��캯��Ϊ��
		//super();
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println(name + "���� :" + i);
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
