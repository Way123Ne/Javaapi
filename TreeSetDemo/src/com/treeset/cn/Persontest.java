package com.treeset.cn;

import java.util.Comparator;

public class Persontest implements Comparable /*Comparator*/{

	private String name;
	private int age;
	
	public Persontest(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		//compareTo()接收的是Object，因此需要将Object向下转型为Persontest
		Persontest per = (Persontest) obj;
		if(per.age < this.age){
			return -1;
		}
		if(per.age > this.age){
			return 1;
		}
		if(per.age == this.age) {
			return this.name.compareTo(per.name);
		}
		return 0;
	}

	/*@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
}
