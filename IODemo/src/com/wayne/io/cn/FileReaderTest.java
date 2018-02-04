package com.wayne.io.cn;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		//创建写入流和读取流的对象引用
		FileReader fr = null;
		
		//检测异常
		try {
			//创建对象实体-源文件和目的文件
			fr = new FileReader("D:\\he.txt");
			//创建字符数组,用于存储读到的字符数据
			char[] buf = new char[1024];
			int len = 0;
			while((len = fr.read(buf)) != -1) {
				System.out.println(new String(new String(buf,0,len)));
			}
		}
	//处理异常
		catch (IOException e) {
			throw new RuntimeException("读取失败!");
		}
		//最终要执行关闭1个流的动作
		finally {
			//关闭前要判断流是否存在,存在就关闭,关闭动作也要进行异常处理
			if (fr != null) 
				try {
					fr.close();
				}
				catch (IOException e) {
					
				}
		}
	}
}
