package com.hashset.cn;

import java.util.HashSet;
import java.util.Iterator;

/*
 *HashSet���˾߱�Set���ϵĳ��÷����⣬��������������Ҫ������hashCode()&&equals()
 * 
 * HashSet(��ϣ��)����α�֤Ԫ��Ψһ�Եģ�
 * ��ͨ��Ԫ�ص���������,hashCode()&&equals()����ɵġ�
 * ���Ԫ�ص�hashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue
 * ���Ԫ�ص�hashCodeֵ��ͬ���������equals����
 */

/*
 * ��������������: ==> Set���ϵ��ص�:Ψһ�ԣ�����ظ�����Ӳ�����Set������
 * zhangsan1��������:21
 * zhangsan2��������:21
 * zhangsan3��������:23
 * zhangsan4��������:24
 */

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		// ʹ��HashSet�������һ������
		hs.add(new Student("zhangsan1", 21));
		hs.add(new Student("zhangsan1", 21));
		hs.add(new Student("zhangsan2", 21));
		hs.add(new Student("zhangsan3", 23));
		hs.add(new Student("zhangsan4", 24));
		
		//ʹ��Iterator��ȡֵ
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			Student  stu = it.next();
			
			System.out.println(stu.getName() + "��������:" + stu.getAge());
		}
	}
}

