package com.hashset.cn;

import java.util.HashSet;
import java.util.Iterator;

/*
 *HashSet除了具备Set集合的常用方法外，还有如下两个重要方法：hashCode()&&equals()
 * 
 * HashSet(哈希表)是如何保证元素唯一性的？
 * 是通过元素的两个方法,hashCode()&&equals()来完成的。
 * 如果元素的hashCode值相同，才会判断equals是否为true
 * 如果元素的hashCode值不同，不会调用equals方法
 */

/*
 * 下面程序的输出结果: ==> Set集合的特点:唯一性，如果重复了添加不进到Set集合中
 * zhangsan1的年龄是:21
 * zhangsan2的年龄是:21
 * zhangsan3的年龄是:23
 * zhangsan4的年龄是:24
 */

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		// 使用HashSet集合添加一个对象
		hs.add(new Student("zhangsan1", 21));
		hs.add(new Student("zhangsan1", 21));
		hs.add(new Student("zhangsan2", 21));
		hs.add(new Student("zhangsan3", 23));
		hs.add(new Student("zhangsan4", 24));
		
		//使用Iterator获取值
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			Student  stu = it.next();
			
			System.out.println(stu.getName() + "的年龄是:" + stu.getAge());
		}
	}
}

