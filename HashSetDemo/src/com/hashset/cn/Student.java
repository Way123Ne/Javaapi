package com.hashset.cn;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//�Զ����
	@Override
	public int hashCode() {
		
		return 60;
	}

	//equals()���յ���Object�������Ҫ��Object����ת��ΪStudent
	@Override
	public boolean equals(Object obj) {
	//	if ((obj instanceof Student)
		Student stu = (Student) obj;
		
		return this.name.equals(stu.name);
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
	
	
}
