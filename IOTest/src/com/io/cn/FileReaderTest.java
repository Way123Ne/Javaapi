package com.io.cn;

import java.io.FileReader;
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
