package com.threadyield.cn;
/*
 * yield():��ͣ��ǰ����ִ�е��̶߳���,��ִ�������߳�
 * ���н��2�����:
 * 1>����(�߳�)��ִ�е�i=5ʱ����cpuʱ���õ�,��ʱ����(�߳�)����cpuʱ�䲢ִ��
 * 2>����(�߳�)��ִ�е�i=5ʱ����cpuʱ���õ�,��ʱ����(�߳�)����cpuʱ�䲢ִ��
 */

public class ThreadYieldTest {

	public static void main(String[] args){
		ThreadYield  yt1 = new ThreadYield("����");
		ThreadYield  yt2 = new ThreadYield("����");
		yt1.start();
		yt2.start();
	}
}
