package com.arraylist.cn;

import java.util.ArrayList;

import java.util.List;

/*
 * List常用方法:
 *1>list中添加，获取，删除元素；
 *2>list中是否包含某个元素；
 *3>list中根据索引将元素数值改变(替换)；
 *4>list中查看（判断）元素的索引；
 *5>根据元素索引位置进行的判断；
 *6>利用list中索引位置重新生成一个新的list（截取集合）；
 *7>对比两个list中的所有元素；
 *8>判断list是否为空；
 *9>返回Iterator集合对象；
 *10>将集合转换为字符串；
 *11>将集合转换为数组；
 *12>集合类型转换；->有点难理解
 *13>去重复；*/

public class ListTest {
	public static void main(String[] args) {

		/*
		 * 1>list中添加，获取，删除元素
		 * 添加的方法是: .add(e);
		 * 获取的方法是: .get(index);
		 * 删除的方法是: .remove(index);->按照索引删除
		 *           .remove(Object o);->按照元素内容删除
		 */
		List<String> person = new ArrayList<>();
		//索引为0
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
		
		//person集合的size为4，从索引0开始，而不是从1开始
		//循环遍历person集合
		for(int i = 0;i<person.size();i++){
			System.out.println(person.get(i));
		}
		
		/*
		 * 2> list中是否包含某个元素；
		 * .contains（Object o）； 返回true为包含，返回false不包含
		 */
		String str = "kayla";
		System.out.println("person集合中是否包含kayla:" + person.contains("str"));
		
		/*
		 * 3>list中根据索引将元素数值改变(替换)；
		 * 注意 .set(index, element); 和 .add(index, element); 的不同；
		 */
		String str2 = "will",str3 = "david";
		person.set(0, str2);
		person.add(1, str3);
		//增强for(数据类型   变量名[随意] : 要遍历的集合或数组)
		for(String string : person) {
			System.out.println(string);
		}
		
		/*
		 * 4>list中查看（判断）元素的索引；　　
		 * 注意：.indexOf（）->第一次出现的位置； 和  lastIndexOf（）-〉最后一次出现的位置；
		 */
		List<String> person2=new ArrayList<>();
        person2.add("刘备");    //索引为0
        person2.add("关羽");    //索引为1
        person2.add("张飞");    //索引为2
        person2.add("刘备");    //索引为3
        person2.add("张飞");    //索引为4
        System.out.println(person2.indexOf("刘备"));
        System.out.println(person2.lastIndexOf("刘备"));
        System.out.println(person2.indexOf("张飞"));
        System.out.println(person2.lastIndexOf("张飞"));
	
        //5>根据元素索引位置进行的判断;
        if (person2.indexOf("刘备") == 0) {
        	System.out.println("刘备在这里");
        } else if (person2.lastIndexOf("刘备") == 3) {
        	System.out.println("刘备在那里");
        } else {
        	System.out.println("刘备到底在哪里?");
        }
           
        /*
         * 6>利用list中索引位置重新生成一个新的list(截取集合)
         * 方法: .subList(fromIndex,toIndex);   .size();该方法得到list中元素数的和
         */
        List<String> phone=new ArrayList<>();
        phone.add("三星");
        phone.add("苹果");
        phone.add("华为");
        phone.add("金立");
        //遍历原List
        for (String pho : phone) {
        	System.out.println(pho);
        }
        //利用索引0-3的对象重新生成新的list<String> phone2
        List<String> phone2;
        phone2 = phone.subList(0,3);
        for (int i = 0; i< phone2.size(); i++) {
            System.out.println("新的list包含的元素是:" + phone.get(i));
        }
        
        /*
         * 7>对比两个list中的所有元素
         *   两个相等对象的equals()一定为true,但两个hashcode相等的对象不一定是相等的对象
         */
        
        if (phone.equals(phone2)) {
        	System.out.println("两个list中的所有元素相同");
        } else {
        	System.out.println("两个list中的所有元素不相同");
        }
        
        if (phone.hashCode() == phone2.hashCode()) {
        	System.out.println("我们相同");
        } else {
        	System.out.println("我们不一样");
        }
        
        /*
         * 8>判断list是否为空
         *   空则返回true,非空则返回false
         */
        if (phone.isEmpty()) {
        	System.out.println("person集合为空");
        } else {
        	System.out.println("person集合不为空");
        }
        
        //9>返回Iterator对象
        System.out.println("返回Iterator集合对象:" + phone.iterator());
        
        //10>将集合转换字符串
        String str4 = "";
        str4 = phone.toString();
        System.out.println("将集合转换为字符串:" + str4);
        
        //11>将集合转换为数组
        System.out.println("将集合转换为数组:" + phone.toArray());
        
        //12>集合类型转换
        //默认类型
       List<Object> ls = new ArrayList<>();
       for (int i = 0 ; i < phone.size(); i++) {
    	   ls.add(phone.get(i));
    	   System.out.println(ls);
       }
      /* 指定类型
       List<StringBuffer> ls2 = new ArrayList<>();
       for (String str5 : phone) {
    	   ls2.add(StringBuffer(str5));
       }*/
       
       //13>去重复
       List<String> lst = new ArrayList<>();
       lst.add("aaa");
       lst.add("bbb");
       lst.add("ccc");
       lst.add("ddd");
       lst.add("eee");
       lst.add("aaa");
       lst.add("ddd");
       
       //方法一
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
