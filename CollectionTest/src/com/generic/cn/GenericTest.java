package com.generic.cn;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {

		// 为List集合指定存取的数据类型，提高安全性
		// List<String> ls = new ArrayList<String>();也可以
		List<String> ls = new ArrayList();
		ls.add("hi,how are you?");
		ls.add("what are you doing now ?");
		ls.add("please help me!");
		System.out.println(ls);

		// 为Iterator指定迭代的数据类型，提高安全性
		Iterator<String> it = ls.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			// 两种不同的输出效果
			System.out.println(obj);
			System.out.println("obj=" + obj);
		}

	}
}
