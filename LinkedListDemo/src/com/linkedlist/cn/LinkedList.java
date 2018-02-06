package com.linkedlist.cn;

/*
 * LinkedList(除list常用方法外)特有方法:
 * 1>添加功能: .addFirst(Object o); .addLast(Object o);
 * 2>获取功能: .getFirst(); .getLast(); ==> 获取元素,但不删除元素.如果集合中没有元素,会出现NoSuchElementException
 * 3>删除功能: .removeFirst(); .removeLast(); ==>  获取元素,但删除元素.如果集合中没有元素,会出现NoSuchElementException
 * 
 * jdk6.0以后出现如下替换方法:
 * 1>offerFirst(); offerLast(); 
 * 2>peekFirst();peekLast(); ==> 获取元素,但不删除元素.如果集合中没有元素,会返回 null
 * 3>pollFirst();pollLast(); ==> 获取元素,但删除元素.如果集合中没有元素,会返回 null
 */
public class LinkedList {
	
	public static void main(String[] args) {
		
	}
	
}
