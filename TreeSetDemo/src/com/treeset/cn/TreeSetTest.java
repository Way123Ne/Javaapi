package com.treeset.cn;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet���˾߱�Set���ϵĳ��÷����⣬���߱����£������з�����
 * ��)Ҫ����Ķ�����ʵ����Ȼ����Comparable�ӿڣ�ͬʱ��д��compareTo(),
 * compareTo()�ڲ�������Զ��塣
 * 2)Ҫ����Ķ�����ʵ�ֱȽ���Comparator�ӿ�,ͬʱ��д��compare(),
 * compare()�ڲ�������Զ��塣
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
			System.out.println(pt.getName()+"�������"+pt.getAge());
		}
	}
}
