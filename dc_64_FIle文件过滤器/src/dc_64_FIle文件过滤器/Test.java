package dc_64_FIle�ļ�������;

import java.io.File;

/*
 *  File��Ļ�ȡ,�ļ���ȡ������
 *  ����Ŀ¼��ʱ��,���Ը�����Ҫ,ֻ��ȡ�����������ļ�
 *  ����Ŀ¼���� listFiles()������ʽ
 *  listFiles(FileFilter filter)�ӿ�����
 *  ����FileFilter�ӿڵ�ʵ����
 *  �Զ���FileFilter�ӿ�ʵ����,��д���󷽷�,
 *  �ӿ�ʵ������󴫵ݵ���������listFiles
 */
public class Test {

	public static void main(String[] args) {
		File file = new File("src/dc_64_FIle�ļ�������");
		File[] files = file.listFiles(new MyFilter()); 
		for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}

}
