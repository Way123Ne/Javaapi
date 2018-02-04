package com.wayne.io.cn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	/**
	 * �������������flush()
	 * flush��Ҫ���ڰ��ڲ����������,��ʵ������������
	 * ���:os fw ����flush
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// ����ָ���ļ�
		File file = new File("D:\\she.txt");
		FileWriter fw = null;
		
		// �ж�file�ļ��Ƿ����,����������ָ��λ�ô���
		if (!file.exists()) {
			file.createNewFile();
		}
		
		try {
			// �����ļ������ļ���������
			fw = new FileWriter(file);
			String message = "i am a good man";
			fw.write(message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null)
				try {
					//����ļ���flush��
					fw.flush();
					// �ر������
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
