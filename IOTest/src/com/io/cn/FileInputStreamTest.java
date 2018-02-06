package com.io.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;

		try {
			File file = new File("D:\\12.jpg");
			fis = new FileInputStream(file);
			int content = 0;
			while ((content = fis.read()) != -1) {
				System.out.println(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null)
				try {
					//关闭输出流
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}
}
