package com.collection.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Collection集合框架中的常用方法：
 * 增加：
 *1>add(Object o) 将指定对象存储到容器中 add 方法的参数类型是Object 便于接收任意对象
 *2>addAll(Collection c) 将指定集合中的元素添加到调用该方法和集合中
 *
 * 删除：
 *3>remove(Object o) 将指定的对象从集合中删除
 *4>removeAll(Collection c) 将指定集合中的元素删除
 *5>clear() 清空集合中的所有元素
 *
 *判断:
 *6>isEmpty() 判断集合是否为空
 *7>contains(Object o) 判断集合何中是否包含指定对象
 *8>containsAll(Collection c) 判断集合中是否包含指定集合使用equals()判断两个对象是否相等  
 *
 *交集:
 *9> retainAll(Collection c) 比较两个集合中是否有相同的元素
 *
 *获取长度: 
 *10>int size()    返回集合容器的大小
 *
 *转换:
 *11> toArray()   集合转换数组，转成Object数组
 *12> toString()  转字符串
 *
 *13> Iterator<E> iterator():迭代器 - 遍历功能
 *
 *总结：Map与Colletion在集合框架中属于并列存在
 */

/*
 * 整理:
 * 看到array,就要想到角标
 * 看到link,就要想到First,Last
 * 看到hash,就要想到hashCode,equals
 * 看到tree,就要想到两个接口 Comparable,Comparator
 */
public class CollectionTest {

	public static void main(String[] args) {
		// Collection的创建
		Collection collection = new ArrayList();

		// 1>Collection的add()
		collection.add("1");
		collection.add("3");
		collection.add("4");
		collection.add("5");
		collection.add("7");
		System.out.println(collection);

		// Collection的Iterator
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			// 两种不同的输出效果
			System.out.println(obj);
			System.out.println("obj=" + obj);
		}

		// 3>Collection的remove()
		collection.remove("1");
		System.out.println(collection);

		// 2>Collection的addAll()
		Collection collection2 = new ArrayList();
		collection2.add("8");
		// 将collection集合装到另一个集合colletion2中,先输出colletion2集合中的元素
		collection2.addAll(collection);
		System.out.println(collection2);

		// 9>Collectin的retainAll()
		System.out.println(collection.retainAll(collection2));

		// 7>Collection的contains()
		System.out.println(collection2.contains("8"));

		// 8>Collection的containsAll()
		System.out.println(collection2.containsAll(collection));

		// 6>Collection的isEmpty()
		System.out.println(collection.isEmpty());
		System.out.println(collection2.isEmpty());

		// 10>Collection的size()
		System.out.println(collection2.size());
		System.out.println(collection.size());

		// 11>Collection的toArray()
		System.out.println(collection.toArray());
		// 12>Collection的toString()
		System.out.println(collection2.toString());

		// 5>collection的clear(),clear()没有返回值-void
		collection.clear();
		System.out.println(collection);
		collection2.clear();
		System.out.println(collection2);
		
		//13> Iterator<E> iterator():迭代器 - 遍历功能
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
