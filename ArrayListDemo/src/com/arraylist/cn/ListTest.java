package com.arraylist.cn;

import java.util.ArrayList;

import java.util.List;

/*
 * List���÷���:
 *1>list����ӣ���ȡ��ɾ��Ԫ�أ�
 *2>list���Ƿ����ĳ��Ԫ�أ�
 *3>list�и���������Ԫ����ֵ�ı�(�滻)��
 *4>list�в鿴���жϣ�Ԫ�ص�������
 *5>����Ԫ������λ�ý��е��жϣ�
 *6>����list������λ����������һ���µ�list����ȡ���ϣ���
 *7>�Ա�����list�е�����Ԫ�أ�
 *8>�ж�list�Ƿ�Ϊ�գ�
 *9>����Iterator���϶���
 *10>������ת��Ϊ�ַ�����
 *11>������ת��Ϊ���飻
 *12>��������ת����->�е������
 *13>ȥ�ظ���*/

public class ListTest {
	public static void main(String[] args) {

		/*
		 * 1>list����ӣ���ȡ��ɾ��Ԫ��
		 * ��ӵķ�����: .add(e);
		 * ��ȡ�ķ�����: .get(index);
		 * ɾ���ķ�����: .remove(index);->��������ɾ��
		 *           .remove(Object o);->����Ԫ������ɾ��
		 */
		List<String> person = new ArrayList<>();
		//����Ϊ0
		person.add("jackie");
		person.add("peter");
		person.add("annie");
		person.add("martin");  
		person.add("marry");
		System.out.println(person);
		
		person.remove(3);
		person.remove("marry");
		System.out.println(person);
		
		String per = "";
		per = person.get(1);
		System.out.println(per);
		
		//person���ϵ�sizeΪ4��������0��ʼ�������Ǵ�1��ʼ
		//ѭ������person����
		for(int i = 0;i<person.size();i++){
			System.out.println(person.get(i));
		}
		
		/*
		 * 2> list���Ƿ����ĳ��Ԫ�أ�
		 * .contains��Object o���� ����trueΪ����������false������
		 */
		String str = "kayla";
		System.out.println("person�������Ƿ����kayla:" + person.contains("str"));
		
		/*
		 * 3>list�и���������Ԫ����ֵ�ı�(�滻)��
		 * ע�� .set(index, element); �� .add(index, element); �Ĳ�ͬ��
		 */
		String str2 = "will",str3 = "david";
		person.set(0, str2);
		person.add(1, str3);
		//��ǿfor(��������   ������[����] : Ҫ�����ļ��ϻ�����)
		for(String string : person) {
			System.out.println(string);
		}
		
		/*
		 * 4>list�в鿴���жϣ�Ԫ�ص�����������
		 * ע�⣺.indexOf����->��һ�γ��ֵ�λ�ã� ��  lastIndexOf����-�����һ�γ��ֵ�λ�ã�
		 */
		List<String> person2=new ArrayList<>();
        person2.add("����");    //����Ϊ0
        person2.add("����");    //����Ϊ1
        person2.add("�ŷ�");    //����Ϊ2
        person2.add("����");    //����Ϊ3
        person2.add("�ŷ�");    //����Ϊ4
        System.out.println(person2.indexOf("����"));
        System.out.println(person2.lastIndexOf("����"));
        System.out.println(person2.indexOf("�ŷ�"));
        System.out.println(person2.lastIndexOf("�ŷ�"));
	
        //5>����Ԫ������λ�ý��е��ж�;
        if (person2.indexOf("����") == 0) {
        	System.out.println("����������");
        } else if (person2.lastIndexOf("����") == 3) {
        	System.out.println("����������");
        } else {
        	System.out.println("��������������?");
        }
           
        /*
         * 6>����list������λ����������һ���µ�list(��ȡ����)
         * ����: .subList(fromIndex,toIndex);   .size();�÷����õ�list��Ԫ�����ĺ�
         */
        List<String> phone=new ArrayList<>();
        phone.add("����");
        phone.add("ƻ��");
        phone.add("��Ϊ");
        phone.add("����");
        //����ԭList
        for (String pho : phone) {
        	System.out.println(pho);
        }
        //��������0-3�Ķ������������µ�list<String> phone2
        List<String> phone2;
        phone2 = phone.subList(0,3);
        for (int i = 0; i< phone2.size(); i++) {
            System.out.println("�µ�list������Ԫ����:" + phone.get(i));
        }
        
        /*
         * 7>�Ա�����list�е�����Ԫ��
         *   ������ȶ����equals()һ��Ϊtrue,������hashcode��ȵĶ���һ������ȵĶ���
         */
        
        if (phone.equals(phone2)) {
        	System.out.println("����list�е�����Ԫ����ͬ");
        } else {
        	System.out.println("����list�е�����Ԫ�ز���ͬ");
        }
        
        if (phone.hashCode() == phone2.hashCode()) {
        	System.out.println("������ͬ");
        } else {
        	System.out.println("���ǲ�һ��");
        }
        
        /*
         * 8>�ж�list�Ƿ�Ϊ��
         *   ���򷵻�true,�ǿ��򷵻�false
         */
        if (phone.isEmpty()) {
        	System.out.println("person����Ϊ��");
        } else {
        	System.out.println("person���ϲ�Ϊ��");
        }
        
        //9>����Iterator����
        System.out.println("����Iterator���϶���:" + phone.iterator());
        
        //10>������ת���ַ���
        String str4 = "";
        str4 = phone.toString();
        System.out.println("������ת��Ϊ�ַ���:" + str4);
        
        //11>������ת��Ϊ����
        System.out.println("������ת��Ϊ����:" + phone.toArray());
        
        //12>��������ת��
        //Ĭ������
       List<Object> ls = new ArrayList<>();
       for (int i = 0 ; i < phone.size(); i++) {
    	   ls.add(phone.get(i));
    	   System.out.println(ls);
       }
      /* ָ������
       List<StringBuffer> ls2 = new ArrayList<>();
       for (String str5 : phone) {
    	   ls2.add(StringBuffer(str5));
       }*/
       
       //13>ȥ�ظ�
       List<String> lst = new ArrayList<>();
       lst.add("aaa");
       lst.add("bbb");
       lst.add("ccc");
       lst.add("ddd");
       lst.add("eee");
       lst.add("aaa");
       lst.add("ddd");
       
       //����һ
       for (int i = 0 ; i < lst.size()-1 ; i++) {
    	   for (int j = lst.size()-1 ; j > i ; j--) {
    		   if (lst.get(j).equals(lst.get(i))) {
    			   //lst.remove(j); 
    			   System.out.println(lst.get(j));
    		   }
    	   }
       }  
         
	}
}
