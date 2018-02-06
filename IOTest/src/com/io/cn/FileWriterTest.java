package com.io.cn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/*
 * IO�����÷���:
 * 
 * 1>��������  
 * 1)�����ļ� ==> boolean createNewFile();�������true,ԭ���ļ�������,�����ļ�;
 *                                     �������false,ԭ���ļ�����,�������ļ�;                                   
 * 2)�����ļ��� ==> boolean mkdir(); 
 *              boolean mkdirs();
 *              
 * 2>ɾ������ ==> boolean delete();��ɾ���ļ���ɾ�����ļ���
 *                              ͨ��java����ɾ�����ļ�,����������վ
 *                                                          
 * 3>�жϹ��� 
 * 1)boolean exists() ==> �ж�ָ����File�Ƿ����
 * 2)boolean isFile() ==> �ж�File�Ƿ����ļ�
 * 3)boolean isDirectory() ==>�ж�File�Ƿ����ļ���
 * 4)boolean canRead() ==> �ж�File�Ƿ�ɶ�
 * 5)boolean canWrite() ==> �ж�File�Ƿ��д
 * 6)boolean isHidden() ==> �ж�File�Ƿ�����
 * 
 * 4>���������ܡ�==> boolean renameTo(File dest);�������File��ͬһ�ļ����£�������������
 *�������������������������������������������������������������������������File����ͬһ�ļ����£����й��ܲ�������
 *
 * 5>��ȡ���ܡ� 
 * 1)String getAbsolutePath() ==> ��ȡ�ļ��ľ���·��/Ŀ¼
 * 2)String getPath() ==> ��ȡ�ļ������·��/Ŀ¼
 * 3)String getName() ==> ��ȡ�ļ�������
 * 4)long length() ==> ��ȡ�ļ��Ĵ�С
 * 5)long lastModified() ==>����ȡ�ļ������޸�ʱ��
 */
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
