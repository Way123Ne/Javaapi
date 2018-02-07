package com.string.cn;
/*
 * String常用方法:
 * 1>判断功能
 * 1)boolean equals(Object obj) 
 * 2)boolean contains(String str) 
 * 3)boolean startsWith(String str) 
 * 4)boolean endWith(String str)
 * 5)boolean isEmpty() 
 * 
 * 2>获取功能
 * 1)int length() 
 * 2)char charAt(int index) 
 * 3)int indexOf(int ch)
 * 4)int indexOf(String str) 
 * 5)int indexOf(int ch,int fromIndex)
 * 6)int indexOf(String str,int fromIndex) 
 * 7)String substring(int start) 
 * 8)String substring(int start,int end) 
 * 
 * 3>转换功能
 * 1)byte[] getBytes[]
 * 2)char[] toCharArray()
 * 3)static String copyValueOf(char[] chs)
 * 4)static String valueOf(char[] chs)
 * 5)static String valueOf(int i)
 * 6)String toLowerCase() 
 * 7)String toUpperCase()
 * 8)String concat(String str)
 * 
 * 4>其他功能
 * 替换功能
 * 1)String replace(char old,char new)
 * 2)String replace(String old,String new)
 * 
 * 切割功能
 * 1)String[] split(String regex)
 * 
 * 去除字符串两端空格
 * 1)String trim()
 * 
 * 按字典顺序比较两个字符串
 * 1)int compareTo(String str)
 * 2)int compareToIgnoreCase(String str)
 */
public class StringTest {

	public static void main(String[] args) {
		//1>判断功能 
		String str = "aaa";
		String str2 = "bbb";
		String str3 = "aaa";
		System.out.println(str.equals(str2));
		System.out.println(str.isEmpty());
		//判断str是否以str3为结尾
		System.out.println(str.endsWith(str3));
		//判断str是否以str2为开始
		System.out.println(str.startsWith(str2));
		//判断str中是否包含str3
		System.out.println(str.contains(str3));
		
		//2>获取功能
		String str4 = "you";
		String str5 = "doing";
		System.out.println("str5" + "的长度为:" + str5.length());
		//获取str5索引位置为0处的字符
		System.out.println("str5字符串索引位置为0处的字符:" + str5.charAt(0));
		System.out.println("str4字符串中字母o在str4字符串中的位置:" + str4.indexOf("o"));
		//substring(index) ==> 不按照索引计算，直接按照个数截取：1->d 
	    System.out.println("str5截取两个字符串后变为:" + str5.substring(2));
	    //endIndex不包括最后一位 ==>str5.substring(0,4) 不包括索引4
	    System.out.println("str5截取索引0到4后变为:" + str5.substring(0, 4));
	    
	    //3>转换功能
	    String str6 = "AAA";
	    String str7 = "uuuuiiii";
	    String st;
	    System.out.println("str6 = " + str6.toLowerCase());
	    System.out.println("str7 = " + str7.toUpperCase());
	    //将两个字符串拼接到一起
	    System.out.println("st = " + str6.concat(str7));
	    
	    //4>其他功能-替换功能
	    String str8 = "no";
	    String str9 = "where";
	    System.out.println("str8 = " + str8.replace('n','d'));
	    System.out.println("str9 = " + str9.replaceAll("where", "how"));
	    
	    //4>其他-切割功能
	    String str10 = ",aa,bbb,cccc,dddddd";
	    String[] StrArray = str10.split(",");
	    for(int i = 0; i < StrArray.length ; i++) {
	    	System.out.println(StrArray[i]);
	    }
	    
	    //4>其他功能-去除字符串两端空格
	    String str11 = " waynesong  ";
	    System.out.println("去除str11两端空白后变为:" + str11.trim());
	    
	    //4>其他功能-按照字典顺序比较两个字符串
	    String str12 = "david";
	    String str13 = "will";
	    System.out.println("str12和str13比较后的结果为:" + str12.compareTo(str13));
	}
}
