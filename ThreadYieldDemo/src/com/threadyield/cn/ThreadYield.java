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
			//��iΪ30ʱ,���߳̾ͻ��cpuʱ���õ�,�����������Լ����߳�ִ��(Ҳ����˵˭������˭��ִ��)
			if (i == 5) {
			this.yield();
		}
		}
	}

}
