package com.wayne.io.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
					//¹Ø±ÕÊä³öÁ÷
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}
}
