package com.treeset.cn;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet除了具备Set集合的常用方法外，还具备如下２个特有方法：
 * １)要排序的对象需实现自然排序Comparable接口，同时复写其compareTo(),
 * compareTo()内部代码可自定义。
 * 2)要排序的对象需实现比较器Comparator接口,同时复写其compare(),
 * compare()内部代码可自定义。
 */
public class TreeSetTest {

	public static void main(String[] args) {
		Persontest per1 = new Persontest("zhangsan",33);
		Persontest per2 = new Persontest("lisi",33);
		Persontest per3 = new Persontest("wangwu",22);
		
		TreeSet ts = new TreeSet();
		
		ts.add(per1);
		ts.add(per2);
		ts.add(per3);
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			Persontest pt = (Persontest) it.next();
			System.out.println(pt.getName()+"的年纪是"+pt.getAge());
		}
	}
}
