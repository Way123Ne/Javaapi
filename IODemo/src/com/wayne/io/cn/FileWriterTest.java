package com.wayne.io.cn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	/**
	 * 输出流都可以用flush()
	 * flush主要用于把内部缓存的数据,作实际输出而且清空
	 * 简记:os fw 都可flush
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 构建指定文件
		File file = new File("D:\\she.txt");
		FileWriter fw = null;
		
		// 判断file文件是否存在,不存在则在指定位置创建
		if (!file.exists()) {
			file.createNewFile();
		}
		
		try {
			// 根据文件创建文件的输入流
			fw = new FileWriter(file);
			String message = "i am a good man";
			fw.write(message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null)
				try {
					//输出文件流flush下
					fw.flush();
					// 关闭输出流
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
