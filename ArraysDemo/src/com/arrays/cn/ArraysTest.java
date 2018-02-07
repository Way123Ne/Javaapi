package com.arrays.cn;

import java.util.Arrays;

/*
 * Arrays常用方法:  ==> 重点记住 index
 * 1>转换功能
 * 1)String toString(int[] a)
 * 
 * 2>排序功能 ==>默认升序排列
 * 1)void sort(int[] a)
 * 
 * 3>二分查找法
 * 1)int binarySearch(int[] a,int k)
 * 
 */
public class ArraysTest {
	public static  void main(String[] args){
		int[] i = {23,5354,2342,232,222};
		//1>转换功能
	    String str = Arrays.toString(i);
	    System.out.println(str);
	    
	    //2>排序功能
	    int[] array = {4,34,534,-33};
	    Arrays.sort(array);
	    String str2 = Arrays.toString(array);
	    System.out.println(str2);
	    
	    //3>二分查找法
	    int[] arr = {2,2342,345,232,2345,5465,2356542,32456,234,-2,1};
	    Arrays.binarySearch(arr, 5);
	    String str3 = Arrays.toString(arr);
	    System.out.println(str3);
	}

}
