package com.string.cn;
/*
 * String���÷���:
 * 1>�жϹ���
 * 1)boolean equals(Object obj) 
 * 2)boolean contains(String str) 
 * 3)boolean startsWith(String str) 
 * 4)boolean endWith(String str)
 * 5)boolean isEmpty() 
 * 
 * 2>��ȡ����
 * 1)int length() 
 * 2)char charAt(int index) 
 * 3)int indexOf(int ch)
 * 4)int indexOf(String str) 
 * 5)int indexOf(int ch,int fromIndex)
 * 6)int indexOf(String str,int fromIndex) 
 * 7)String substring(int start) 
 * 8)String substring(int start,int end) 
 * 
 * 3>ת������
 * 1)byte[] getBytes[]
 * 2)char[] toCharArray()
 * 3)static String copyValueOf(char[] chs)
 * 4)static String valueOf(char[] chs)
 * 5)static String valueOf(int i)
 * 6)String toLowerCase() 
 * 7)String toUpperCase()
 * 8)String concat(String str)
 * 
 * 4>��������
 * �滻����
 * 1)String replace(char old,char new)
 * 2)String replace(String old,String new)
 * 
 * �и��
 * 1)String[] split(String regex)
 * 
 * ȥ���ַ������˿ո�
 * 1)String trim()
 * 
 * ���ֵ�˳��Ƚ������ַ���
 * 1)int compareTo(String str)
 * 2)int compareToIgnoreCase(String str)
 */
public class StringTest {

	public static void main(String[] args) {
		//1>�жϹ��� 
		String str = "aaa";
		String str2 = "bbb";
		String str3 = "aaa";
		System.out.println(str.equals(str2));
		System.out.println(str.isEmpty());
		//�ж�str�Ƿ���str3Ϊ��β
		System.out.println(str.endsWith(str3));
		//�ж�str�Ƿ���str2Ϊ��ʼ
		System.out.println(str.startsWith(str2));
		//�ж�str���Ƿ����str3
		System.out.println(str.contains(str3));
		
		//2>��ȡ����
		String str4 = "you";
		String str5 = "doing";
		System.out.println("str5" + "�ĳ���Ϊ:" + str5.length());
		//��ȡstr5����λ��Ϊ0�����ַ�
		System.out.println("str5�ַ�������λ��Ϊ0�����ַ�:" + str5.charAt(0));
		System.out.println("str4�ַ�������ĸo��str4�ַ����е�λ��:" + str4.indexOf("o"));
		//substring(index) ==> �������������㣬ֱ�Ӱ��ո�����ȡ��1->d 
	    System.out.println("str5��ȡ�����ַ������Ϊ:" + str5.substring(2));
	    //endIndex���������һλ ==>str5.substring(0,4) ����������4
	    System.out.println("str5��ȡ����0��4���Ϊ:" + str5.substring(0, 4));
	    
	    //3>ת������
	    String str6 = "AAA";
	    String str7 = "uuuuiiii";
	    String st;
	    System.out.println("str6 = " + str6.toLowerCase());
	    System.out.println("str7 = " + str7.toUpperCase());
	    //�������ַ���ƴ�ӵ�һ��
	    System.out.println("st = " + str6.concat(str7));
	    
	    //4>��������-�滻����
	    String str8 = "no";
	    String str9 = "where";
	    System.out.println("str8 = " + str8.replace('n','d'));
	    System.out.println("str9 = " + str9.replaceAll("where", "how"));
	    
	    //4>����-�и��
	    String str10 = ",aa,bbb,cccc,dddddd";
	    String[] StrArray = str10.split(",");
	    for(int i = 0; i < StrArray.length ; i++) {
	    	System.out.println(StrArray[i]);
	    }
	    
	    //4>��������-ȥ���ַ������˿ո�
	    String str11 = " waynesong  ";
	    System.out.println("ȥ��str11���˿հ׺��Ϊ:" + str11.trim());
	    
	    //4>��������-�����ֵ�˳��Ƚ������ַ���
	    String str12 = "david";
	    String str13 = "will";
	    System.out.println("str12��str13�ȽϺ�Ľ��Ϊ:" + str12.compareTo(str13));
	}
}
