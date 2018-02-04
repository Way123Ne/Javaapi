package com.wayne.io.cn;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		//����д�����Ͷ�ȡ���Ķ�������
		FileReader fr = null;
		
		//����쳣
		try {
			//��������ʵ��-Դ�ļ���Ŀ���ļ�
			fr = new FileReader("D:\\he.txt");
			//�����ַ�����,���ڴ洢�������ַ�����
			char[] buf = new char[1024];
			int len = 0;
			while((len = fr.read(buf)) != -1) {
				System.out.println(new String(new String(buf,0,len)));
			}
		}
	//�����쳣
		catch (IOException e) {
			throw new RuntimeException("��ȡʧ��!");
		}
		//����Ҫִ�йر�1�����Ķ���
		finally {
			//�ر�ǰҪ�ж����Ƿ����,���ھ͹ر�,�رն���ҲҪ�����쳣����
			if (fr != null) 
				try {
					fr.close();
				}
				catch (IOException e) {
					
				}
		}
	}
}
