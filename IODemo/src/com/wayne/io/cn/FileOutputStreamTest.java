package com.wayne.io.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamTest {

	/**
	 * �������������flush()
	 * flush��Ҫ���ڰ��ڲ����������,��ʵ������������
	 * ���:os fw ����flush
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		File file = new File("D:\\4.txt");

		// �ж�file�ļ��Ƿ����,����������ָ��λ�ô���
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
					// �����flush��
					fos.flush();
					//�ر������
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}
}
