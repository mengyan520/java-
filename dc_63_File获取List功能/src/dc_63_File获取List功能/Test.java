package dc_63_File��ȡList����;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File file = new File("src/dc_63_File��ȡList����");
		// ��ȡ��ǰĿ¼�������ļ����ļ��е���������
		String[] strings = file.list();
		for (String string : strings) {
			System.out.println(string);
		}
		// ��ȡ��ǰĿ¼�������ļ����ļ��е�File����
		File[] files = file.listFiles();
		for (File file2 : files) {
			//���ص���Ŀ¼�����ļ���ȫ·��
			System.out.println(file2);
		}
		//�г����õ��ļ�ϵͳ�� 
		File[] files2 = File.listRoots();
		for (File file3 : files2) {
			//���ص���Ŀ¼�����ļ���ȫ·��
			System.out.println(file3);
		}
	}

}
