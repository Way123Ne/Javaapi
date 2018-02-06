package com.generic.cn;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {

		// ΪList����ָ����ȡ���������ͣ���߰�ȫ��
		// List<String> ls = new ArrayList<String>();Ҳ����
		List<String> ls = new ArrayList();
		ls.add("hi,how are you?");
		ls.add("what are you doing now ?");
		ls.add("please help me!");
		System.out.println(ls);

		// ΪIteratorָ���������������ͣ���߰�ȫ��
		Iterator<String> it = ls.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			// ���ֲ�ͬ�����Ч��
			System.out.println(obj);
			System.out.println("obj=" + obj);
		}

	}
}
