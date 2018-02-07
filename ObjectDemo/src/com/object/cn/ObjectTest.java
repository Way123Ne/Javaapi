package com.object.cn;

/*
 * Object���÷���:
 * 1>ת������
 * 1)String toString()
 * 
 * 2>�жϹ���
 * 1)boolean equals(Object obj)
 * 
 * 3>���л�����
 * 1)void finalize()
 * 
 * 4>��ȡ��ǰ���������
 * 1)Class getClass()
 * 
 * 5>��ȡ��ǰ�����hashֵ
 * 1)int hashCode()
 */
public class ObjectTest {

	public static void main(String[] args) {
		// 1>ת������
		Integer i = 2;
		System.out.println(i.toString());

		// 2>�жϹ���
		String str = "aaaaa";
		String str2 = "cccccc";
		System.out.println(str.equals(str2));

		// 4>��ȡ��ǰ���������
		String str3 = "him";
		Class<? extends String> cs = str3.getClass();
		System.out.println(cs);
		
		//5>��ȡ��ǰ�����hashֵ
		String str4 = "her";
		int x = str4.hashCode();
		System.out.println("x = " + x);
	}
}
