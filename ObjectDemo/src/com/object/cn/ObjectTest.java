package com.object.cn;

/*
 * Object常用方法:
 * 1>转换功能
 * 1)String toString()
 * 
 * 2>判断功能
 * 1)boolean equals(Object obj)
 * 
 * 3>序列化功能
 * 1)void finalize()
 * 
 * 4>获取当前对象的类型
 * 1)Class getClass()
 * 
 * 5>获取当前对象的hash值
 * 1)int hashCode()
 */
public class ObjectTest {

	public static void main(String[] args) {
		// 1>转换功能
		Integer i = 2;
		System.out.println(i.toString());

		// 2>判断功能
		String str = "aaaaa";
		String str2 = "cccccc";
		System.out.println(str.equals(str2));

		// 4>获取当前对象的类型
		String str3 = "him";
		Class<? extends String> cs = str3.getClass();
		System.out.println(cs);
		
		//5>获取当前对象的hash值
		String str4 = "her";
		int x = str4.hashCode();
		System.out.println("x = " + x);
	}
}
