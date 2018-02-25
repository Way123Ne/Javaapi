package com.teststrnullorempty.cn;

import java.awt.peer.SystemTrayPeer;

import sun.java2d.cmm.kcms.KcmsServiceProvider;
import sun.rmi.runtime.Log;

public class TestStrNullOrEmpty {
	
	public static void main(String[] args){
		
		//���str = null ����ն��󣬼���û���������󣬾��ǻ�û���ٿռ�
		//���str = "" ���������˶��󣬵������������Ϊ�գ�Ҳ���ǿ��ַ���
		//���str = " " ���������˶��󣬵�����������ݲ�Ϊ�գ����ǿո�
		
		String  str = null;
		String str2 = "";
		String str3 = " ";
		String str4 = "ab";
		
		System.out.println("str = " + str); //output:str = null
		System.out.println("str2 = " + str2);//output:str2 = 
		System.out.println("str3 = " + str3);//output:str3 = 
		System.out.println("str4 = " + str4);//output:str4 = ab
		
		//��ӡstr.length() => java.lang.NullPointerException ԭ��str = null ����ն��󣬼���û���������󣬾��ǻ�û���ٿռ�
		//System.out.println("str.length() = " + str.length());
		System.out.println("str2.length() = " + str2.length());//output:str2.length() = 0
		System.out.println("str3.length() = " + str3.length());//output:str3.length() = 1
		System.out.println("str4.length() = " + str4.length());//output:str4.length() = 2
		
		//equals()�Ƚϵ�����������������Ƿ���ͬ����ˣ����������ָ��Ŀռ䣬������Ϊnull,����ᱨNullPointerException
		System.out.println("str2.equals(null) =" + str2.equals(null)); //output:str2.equals(null) =false
		System.out.println("str2.equals(\"\") =" + str2.equals(""));//output:str2.equals("") =true
		System.out.println("str2.equals(\" \") =" + str2.equals(" "));//output:str2.equals(" ") =false
		System.out.println("str3.equals(\"\") =" + str3.equals(""));//output:str3.equals("") =false
		System.out.println("str3.equals(\" \") =" + str3.equals(" "));//output:str3.equals(" ") =true
		//�쳣
		//System.out.println("str.equals(null) =" + str.equals(null));
		
		//isEmpty()==>boolean����,���ڱȽ��ַ����Ƿ�Ϊ��
		System.out.println("str2.isEmpty() =" + str2.isEmpty());//output:str2.isEmpty() =true
		System.out.println("str3.isEmpty() =" + str3.isEmpty());//output:str3.isEmpty() =false
		//�쳣
		//System.out.println("str.isEmpty() =" + str.isEmpty());
		
		//��ʹ��"+"����ʱ�������һ�����������ַ����������������ᱻת�����ַ���
		str = str + str4;
		System.out.println("after (str + str4) =" + str);//output:after (str + str4) =nullab
		System.out.println("str.length() =" + str.length());//output:str.length() =6
		System.out.println("str == null = " + str == null);//output:false
		
		
	}
}
