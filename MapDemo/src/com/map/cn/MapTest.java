package com.map.cn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合框架简介:
 * 1>Map存储的是键值对
 * 2>Map存储元素使用put(),Collection使用add()
 * 3>Map集合没有直接取出元素的方法,而是先将元素转为Set集合,在通过迭代获取元素
 * 4>Map集合中Key要保持唯一性,Key与Value存在映射关系
 * 简单说Map属于双列集合，Collection属于单列集合
 * 
 * 总结：Map与Colletion在集合框架中属于并列存在
 */

/*
 * Map集合框架常用方法：
 * 1>添加
 * 1)V put(K key,V value)[可以相同的key值,但是添加的value值会覆盖前面的,返回值是前一个，如果没有返回值就返回null]
 * 2)putAll(Map<? extends K,? extends V>m)[从指定映射中将所有映射关系复制到此映射中] ==>一般不使用该方法
 * 
 * 2>删除
 * 1)remove() ==> 删除关联对象，指定key对象
 * 2)clear()  ==> 清空集合对象
 * 
 * 3>获取
 * 1)value get(key); ==> 可用于判断key是否存在的情况，如果指定的key不存在，则返回null
 * 
 * 4>判断
 * 1)boolean isEmpty() ==> 长度为０返回true否则false
 * 2)boolean containsKey(Object key) ==> 判断集合中是否包含指定的key
 * 3)boolean containsValue(Object value) ==> 判断集合中是否包含指定的value
 * 
 * 5>长度
 * 1)int size() 
 */

/*
 * 遍历Map的方法：  第1、3方法推荐使用且均使用Set集合
 * 1>将map集合框架中的键取出存入set集合
 * Set<K> keySet() ==> 返回所有key对象的Set集合，再通过get()获取key对应的value
 * 2>values() ==> 获取所有的值
 * Collection<V> values() 不能获取到key对象
 * 3>Map.Entry对象，推荐使用  重点
 * Set<Map.Entry<K,V>> entrySet() ==>　将map集合中的键值映射关系打包成一个对象
 * Map.Entry对象通过Map.Entry的getKey(),getValue()获取其键和值
 * 
 */
public class MapTest {

	public static void main(String[] args){
		Map<Integer,String> mp = new HashMap<Integer,String>();
		//1>V put(K key,V value)
		mp.put(1, "aaa");
		mp.put(2, "bbb");
		mp.put(3, "ccc");
		System.out.println(mp);
		
		//2>remove()
		mp.remove(2);
		System.out.println(mp);
		
		//3>value get(key);
		mp.get(1);
		System.out.println(mp);
		
		//4>boolean isEmpty()
		System.out.println(mp.isEmpty());
		
		//5>int size()
		System.out.println(mp.size());
		
		//遍历Map的方法一
		Set<Integer> ks = mp.keySet();
		Iterator<Integer> it = ks.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			String value = mp.get(key);
			System.out.println("key = " + key + "value = " + value);
			
		}
		
		//遍历Map的方法二:通过values 获取所有值，不能获取到key对象
		Collection<String> vs = mp.values();
		Iterator<String> it2 = vs.iterator();
		while(it2.hasNext()){
			String value = it2.next();
			System.out.println("value =" + value);
		}
		
		/*
		 * 遍历Map的方法三
		 * Set<Map.Entry<K,V>> entrySet() ==>　面向对象的思想将map的键和值的映射关系打包成一个对象即Map.Entry,
		 * 将该对象存入Set集合中,Map.Entry是一个对象，那么该对象具备的getKey(),getValue()即可获取到map中的key和value
		 */
		
		Set<Map.Entry<Integer, String>> es = mp.entrySet();
		Iterator<Map.Entry<Integer, String>> it3 = es.iterator();
		while(it3.hasNext()) {
			Map.Entry<Integer,String> me = it3.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println("key = " + key + "value = " + value);
		}
	}
}
