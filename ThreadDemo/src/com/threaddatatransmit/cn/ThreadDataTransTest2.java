package com.threaddatatransmit.cn;
/*
 * �߳����ݴ���:
 * �ڶ��ַ���:
 * ͨ�������ͷ�����������
 */
public class ThreadDataTransTest2 {

	public static void main(String[] args){
		ThreadDataTrans2 dt2 = new ThreadDataTrans2();
		dt2.setName("world");
		new Thread(dt2).start();
	}
}
