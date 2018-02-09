package com.threadjoin.cn;
/*
 * Ϊʲôʹ��join()?
 * �ܶ�����£����߳����ɲ����������̣߳�������߳���Ҫ���д����ĺ�ʱ�����㣬���߳������������߳�֮ǰ������
 * ����������̴߳������������������Ҫ�õ����̵߳Ĵ�������Ҳ�������߳���Ҫ�ȴ����߳�ִ�����֮���ٽ���
 * �����ʱ���Ҫ�õ�join()
 */
public class ThreadJoinTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "���߳����п�ʼ");

		ThreadJoin ji1 = new ThreadJoin("A");
		ThreadJoin ji2 = new ThreadJoin("B");
		ji1.start();
		ji2.start();
		try {
			ji1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			ji2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + "���߳����н���");
	}
}
