package com.stringbuffer.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * StringBuffer���÷���:
 * 1>��������
 * 1)int length()
 * 2)int capacity()
 * 
 * 2>��ӹ���
 * 1)StringBuffer append(int i)
 * 2)StringBuffer insert(int offset,int i)
 * 
 * 3>ɾ������
 * 1)StringBuffer delete(int start,int end)
 * 2)StringBuffer deleteCharAt(int index)
 * 
 * 4>�滻����
 * 1)StringBuffer replace(int start,int end,String str)
 * 
 * 5>��ȡ����
 * 1)String substring(int start)
 * 2)String substring(int start,int end)
 * 
 * 6>��ת���� ==>��StringBuffer�е��ַ����ߵ�˳�����
 * 1)StringBuffer reverse()
 */
public class StringBufferTest {

	public static void main(String[] args) {

		//2>��ӹ���
		StringBuffer sb = new StringBuffer("abc");
		sb.append(true);
		System.out.println(sb);
		//insert(int offset,boolean b)  ==> offset����ֵ����StringBuffer�в����λ��,�������޹�.
		sb.insert(2, "ddd");
		System.out.println(sb);
	
		//1>��������
		System.out.println("sb�ĳ���Ϊ:" + sb.length());
		System.out.println("sb�ĳ���Ϊ:" + sb.capacity());
		
		//3>ɾ������
		System.out.println(sb.deleteCharAt(1));
		System.out.println(sb.delete(0, 3));
	
		//4>�滻����
		StringBuffer sb2 = new StringBuffer("iiiii");
		sb2.replace(0, 3,"uiuii");
		System.out.println(sb2);
		
		//5>��ȡ����
		StringBuffer sb3 = new StringBuffer("ooooo");
		String ss = sb3.substring(0, 3);
		System.out.println(ss);
		ss = sb3.substring(1);
		System.out.println(ss);
		
		//6>��ת����
		StringBuffer sb4 = new StringBuffer("poll");
		sb4.reverse();
		System.out.println(sb4);
	}
}
