package com.io.cn;

import java.io.FileReader;
import java.io.IOException;
/*
 * IO流常用方法:
 * 
 * 1>创建功能  
 * 1)创建文件 ==> boolean createNewFile();如果返回true,原先文件不存在,创建文件;
 *                                     如果返回false,原先文件存在,不创建文件;                                   
 * 2)创建文件夹 ==> boolean mkdir(); 
 *              boolean mkdirs();
 *              
 * 2>删除功能 ==> boolean delete();可删除文件或删除空文件夹
 *                              通过java程序删除的文件,不经过回收站
 *                                                          
 * 3>判断功能 
 * 1)boolean exists() ==> 判断指定的File是否存在
 * 2)boolean isFile() ==> 判断File是否是文件
 * 3)boolean isDirectory() ==>判断File是否是文件夹
 * 4)boolean canRead() ==> 判断File是否可读
 * 5)boolean canWrite() ==> 判断File是否可写
 * 6)boolean isHidden() ==> 判断File是否隐藏
 * 
 * 4>重命名功能　==> boolean renameTo(File dest);如果两个File在同一文件夹下，起到重命名功能
 *　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　如果两个File不在同一文件夹下，剪切功能并重命名
 *
 * 5>获取功能　 
 * 1)String getAbsolutePath() ==> 获取文件的绝对路径/目录
 * 2)String getPath() ==> 获取文件的相对路径/目录
 * 3)String getName() ==> 获取文件的名字
 * 4)long length() ==> 获取文件的大小
 * 5)long lastModified() ==>　获取文件最后的修改时间
 */
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
