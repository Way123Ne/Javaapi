package com.wayne.io.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamTest {

	/**
	 * 输出流都可以用flush()
	 * flush主要用于把内部缓存的数据,作实际输出而且清空
	 * 简记:os fw 都可flush
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		File file = new File("D:\\4.txt");

		// 判断file文件是否存在,不存在则在指定位置创建
		if (!file.exists()) {
			file.createNewFile();
		}
		
		try {
			int i = 65;
			fos = new FileOutputStream(file);
			fos.write(i);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null)
				try {
					// 输出流flush下
					fos.flush();
					//关闭输出流
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}
}
