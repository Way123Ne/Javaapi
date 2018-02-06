package com.map.cn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���Ͽ�ܼ��:
 * 1>Map�洢���Ǽ�ֵ��
 * 2>Map�洢Ԫ��ʹ��put(),Collectionʹ��add()
 * 3>Map����û��ֱ��ȡ��Ԫ�صķ���,�����Ƚ�Ԫ��תΪSet����,��ͨ��������ȡԪ��
 * 4>Map������KeyҪ����Ψһ��,Key��Value����ӳ���ϵ
 * ��˵Map����˫�м��ϣ�Collection���ڵ��м���
 * 
 * �ܽ᣺Map��Colletion�ڼ��Ͽ�������ڲ��д���
 */

/*
 * Map���Ͽ�ܳ��÷�����
 * 1>���
 * 1)V put(K key,V value)[������ͬ��keyֵ,������ӵ�valueֵ�Ḳ��ǰ���,����ֵ��ǰһ�������û�з���ֵ�ͷ���null]
 * 2)putAll(Map<? extends K,? extends V>m)[��ָ��ӳ���н�����ӳ���ϵ���Ƶ���ӳ����] ==>һ�㲻ʹ�ø÷���
 * 
 * 2>ɾ��
 * 1)remove() ==> ɾ����������ָ��key����
 * 2)clear()  ==> ��ռ��϶���
 * 
 * 3>��ȡ
 * 1)value get(key); ==> �������ж�key�Ƿ���ڵ���������ָ����key�����ڣ��򷵻�null
 * 
 * 4>�ж�
 * 1)boolean isEmpty() ==> ����Ϊ������true����false
 * 2)boolean containsKey(Object key) ==> �жϼ������Ƿ����ָ����key
 * 3)boolean containsValue(Object value) ==> �жϼ������Ƿ����ָ����value
 * 
 * 5>����
 * 1)int size() 
 */

/*
 * ����Map�ķ�����  ��1��3�����Ƽ�ʹ���Ҿ�ʹ��Set����
 * 1>��map���Ͽ���еļ�ȡ������set����
 * Set<K> keySet() ==> ��������key�����Set���ϣ���ͨ��get()��ȡkey��Ӧ��value
 * 2>values() ==> ��ȡ���е�ֵ
 * Collection<V> values() ���ܻ�ȡ��key����
 * 3>Map.Entry�����Ƽ�ʹ��  �ص�
 * Set<Map.Entry<K,V>> entrySet() ==>����map�����еļ�ֵӳ���ϵ�����һ������
 * Map.Entry����ͨ��Map.Entry��getKey(),getValue()��ȡ�����ֵ
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
		
		//����Map�ķ���һ
		Set<Integer> ks = mp.keySet();
		Iterator<Integer> it = ks.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			String value = mp.get(key);
			System.out.println("key = " + key + "value = " + value);
			
		}
		
		//����Map�ķ�����:ͨ��values ��ȡ����ֵ�����ܻ�ȡ��key����
		Collection<String> vs = mp.values();
		Iterator<String> it2 = vs.iterator();
		while(it2.hasNext()){
			String value = it2.next();
			System.out.println("value =" + value);
		}
		
		/*
		 * ����Map�ķ�����
		 * Set<Map.Entry<K,V>> entrySet() ==>����������˼�뽫map�ļ���ֵ��ӳ���ϵ�����һ������Map.Entry,
		 * ���ö������Set������,Map.Entry��һ��������ô�ö���߱���getKey(),getValue()���ɻ�ȡ��map�е�key��value
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
