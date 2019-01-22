package dc_61_IO_File��ȡ����;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		File file = new File("./src/dc_61_IO_File��ȡ����/text.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ����·���б�ʾ���ļ������ļ�����(��·������󲿷֣���:text.txt)
		System.out.println(file.getName());
		//����·���б�ʾ���ļ����ֽ���
		System.out.println(file.length());
		//��ȡ����·��,����String����
		System.out.println(file.getAbsolutePath());
		//��ȡ����·��,����File����
		System.out.println(file.getAbsoluteFile().length());
		//��ȡ��·��,����String����
		System.out.println(file.getParent());
		//��ȡ��·��,����File����
		System.out.println(file.getParentFile().length());
	}
	

}
