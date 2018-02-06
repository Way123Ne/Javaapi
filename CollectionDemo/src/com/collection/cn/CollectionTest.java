package com.collection.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Collection���Ͽ���еĳ��÷�����
 * ���ӣ�
 *1>add(Object o) ��ָ������洢�������� add �����Ĳ���������Object ���ڽ����������
 *2>addAll(Collection c) ��ָ�������е�Ԫ����ӵ����ø÷����ͼ�����
 *
 * ɾ����
 *3>remove(Object o) ��ָ���Ķ���Ӽ�����ɾ��
 *4>removeAll(Collection c) ��ָ�������е�Ԫ��ɾ��
 *5>clear() ��ռ����е�����Ԫ��
 *
 *�ж�:
 *6>isEmpty() �жϼ����Ƿ�Ϊ��
 *7>contains(Object o) �жϼ��Ϻ����Ƿ����ָ������
 *8>containsAll(Collection c) �жϼ������Ƿ����ָ������ʹ��equals()�ж����������Ƿ����  
 *
 *����:
 *9> retainAll(Collection c) �Ƚ������������Ƿ�����ͬ��Ԫ��
 *
 *��ȡ����: 
 *10>int size()    ���ؼ��������Ĵ�С
 *
 *ת��:
 *11> toArray()   ����ת�����飬ת��Object����
 *12> toString()  ת�ַ���
 *
 *13> Iterator<E> iterator():������ - ��������
 *
 *�ܽ᣺Map��Colletion�ڼ��Ͽ�������ڲ��д���
 */

/*
 * ����:
 * ����array,��Ҫ�뵽�Ǳ�
 * ����link,��Ҫ�뵽First,Last
 * ����hash,��Ҫ�뵽hashCode,equals
 * ����tree,��Ҫ�뵽�����ӿ� Comparable,Comparator
 */
public class CollectionTest {

	public static void main(String[] args) {
		// Collection�Ĵ���
		Collection collection = new ArrayList();

		// 1>Collection��add()
		collection.add("1");
		collection.add("3");
		collection.add("4");
		collection.add("5");
		collection.add("7");
		System.out.println(collection);

		// Collection��Iterator
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			// ���ֲ�ͬ�����Ч��
			System.out.println(obj);
			System.out.println("obj=" + obj);
		}

		// 3>Collection��remove()
		collection.remove("1");
		System.out.println(collection);

		// 2>Collection��addAll()
		Collection collection2 = new ArrayList();
		collection2.add("8");
		// ��collection����װ����һ������colletion2��,�����colletion2�����е�Ԫ��
		collection2.addAll(collection);
		System.out.println(collection2);

		// 9>Collectin��retainAll()
		System.out.println(collection.retainAll(collection2));

		// 7>Collection��contains()
		System.out.println(collection2.contains("8"));

		// 8>Collection��containsAll()
		System.out.println(collection2.containsAll(collection));

		// 6>Collection��isEmpty()
		System.out.println(collection.isEmpty());
		System.out.println(collection2.isEmpty());

		// 10>Collection��size()
		System.out.println(collection2.size());
		System.out.println(collection.size());

		// 11>Collection��toArray()
		System.out.println(collection.toArray());
		// 12>Collection��toString()
		System.out.println(collection2.toString());

		// 5>collection��clear(),clear()û�з���ֵ-void
		collection.clear();
		System.out.println(collection);
		collection2.clear();
		System.out.println(collection2);
		
		//13> Iterator<E> iterator():������ - ��������
		Collection<String> ct = new ArrayList<>();
		ct.add("11");
		ct.add("22");
		ct.add("33");
		ct.add("44");
		Iterator<String> it2 = ct.iterator();
		while(it2.hasNext()) {
			Object obj = it2.next();
			System.out.println(obj);
			System.out.println("obj = " + obj);
		}
		

	}
}
