package com.teststrnullorempty.cn;

import java.awt.peer.SystemTrayPeer;

import sun.java2d.cmm.kcms.KcmsServiceProvider;
import sun.rmi.runtime.Log;

public class TestStrNullOrEmpty {
	
	public static void main(String[] args){
		
		//如果str = null 代表空对象，即还没创建出对象，就是还没开辟空间
		//如果str = "" 代表创建出了对象，但这个对象内容为空，也就是空字符串
		//如果str = " " 代表创建出了对象，但这个对象内容不为空，而是空格
		
		String  str = null;
		String str2 = "";
		String str3 = " ";
		String str4 = "ab";
		
		System.out.println("str = " + str); //output:str = null
		System.out.println("str2 = " + str2);//output:str2 = 
		System.out.println("str3 = " + str3);//output:str3 = 
		System.out.println("str4 = " + str4);//output:str4 = ab
		
		//打印str.length() => java.lang.NullPointerException 原因str = null 代表空对象，即还没创建出对象，就是还没开辟空间
		//System.out.println("str.length() = " + str.length());
		System.out.println("str2.length() = " + str2.length());//output:str2.length() = 0
		System.out.println("str3.length() = " + str3.length());//output:str3.length() = 1
		System.out.println("str4.length() = " + str4.length());//output:str4.length() = 2
		
		//equals()比较的是两个对象的内容是否相同，因此，对象必须有指向的空间，即不能为null,否则会报NullPointerException
		System.out.println("str2.equals(null) =" + str2.equals(null)); //output:str2.equals(null) =false
		System.out.println("str2.equals(\"\") =" + str2.equals(""));//output:str2.equals("") =true
		System.out.println("str2.equals(\" \") =" + str2.equals(" "));//output:str2.equals(" ") =false
		System.out.println("str3.equals(\"\") =" + str3.equals(""));//output:str3.equals("") =false
		System.out.println("str3.equals(\" \") =" + str3.equals(" "));//output:str3.equals(" ") =true
		//异常
		//System.out.println("str.equals(null) =" + str.equals(null));
		
		//isEmpty()==>boolean类型,用于比较字符串是否为空
		System.out.println("str2.isEmpty() =" + str2.isEmpty());//output:str2.isEmpty() =true
		System.out.println("str3.isEmpty() =" + str3.isEmpty());//output:str3.isEmpty() =false
		//异常
		//System.out.println("str.isEmpty() =" + str.isEmpty());
		
		//在使用"+"操作时，如果有一个操作数是字符串，其他操作数会被转换成字符串
		str = str + str4;
		System.out.println("after (str + str4) =" + str);//output:after (str + str4) =nullab
		System.out.println("str.length() =" + str.length());//output:str.length() =6
		System.out.println("str == null = " + str == null);//output:false
		
		
	}
}
