package com.arrays.cn;

import java.util.Arrays;

/*
 * Arrays���÷���:  ==> �ص��ס index
 * 1>ת������
 * 1)String toString(int[] a)
 * 
 * 2>������ ==>Ĭ����������
 * 1)void sort(int[] a)
 * 
 * 3>���ֲ��ҷ�
 * 1)int binarySearch(int[] a,int k)
 * 
 */
public class ArraysTest {
	public static  void main(String[] args){
		int[] i = {23,5354,2342,232,222};
		//1>ת������
	    String str = Arrays.toString(i);
	    System.out.println(str);
	    
	    //2>������
	    int[] array = {4,34,534,-33};
	    Arrays.sort(array);
	    String str2 = Arrays.toString(array);
	    System.out.println(str2);
	    
	    //3>���ֲ��ҷ�
	    int[] arr = {2,2342,345,232,2345,5465,2356542,32456,234,-2,1};
	    Arrays.binarySearch(arr, 5);
	    String str3 = Arrays.toString(arr);
	    System.out.println(str3);
	}

}
