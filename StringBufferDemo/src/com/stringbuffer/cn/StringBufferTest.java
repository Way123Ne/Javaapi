package com.stringbuffer.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * StringBuffer常用方法:
 * 1>容量方法
 * 1)int length()
 * 2)int capacity()
 * 
 * 2>添加功能
 * 1)StringBuffer append(int i)
 * 2)StringBuffer insert(int offset,int i)
 * 
 * 3>删除功能
 * 1)StringBuffer delete(int start,int end)
 * 2)StringBuffer deleteCharAt(int index)
 * 
 * 4>替换功能
 * 1)StringBuffer replace(int start,int end,String str)
 * 
 * 5>截取功能
 * 1)String substring(int start)
 * 2)String substring(int start,int end)
 * 
 * 6>反转功能 ==>将StringBuffer中的字符串颠倒顺序输出
 * 1)StringBuffer reverse()
 */
public class StringBufferTest {

	public static void main(String[] args) {

		//2>添加功能
		StringBuffer sb = new StringBuffer("abc");
		sb.append(true);
		System.out.println(sb);
		//insert(int offset,boolean b)  ==> offset的数值即向StringBuffer中插入的位置,和索引无关.
		sb.insert(2, "ddd");
		System.out.println(sb);
	
		//1>容量方法
		System.out.println("sb的长度为:" + sb.length());
		System.out.println("sb的长度为:" + sb.capacity());
		
		//3>删除方法
		System.out.println(sb.deleteCharAt(1));
		System.out.println(sb.delete(0, 3));
	
		//4>替换功能
		StringBuffer sb2 = new StringBuffer("iiiii");
		sb2.replace(0, 3,"uiuii");
		System.out.println(sb2);
		
		//5>截取功能
		StringBuffer sb3 = new StringBuffer("ooooo");
		String ss = sb3.substring(0, 3);
		System.out.println(ss);
		ss = sb3.substring(1);
		System.out.println(ss);
		
		//6>反转功能
		StringBuffer sb4 = new StringBuffer("poll");
		sb4.reverse();
		System.out.println(sb4);
	}
}
