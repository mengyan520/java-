package dc_60_IO_File������ɾ��;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		//�����ļ� ��������������ļ����Ͳ�������
		//ע�⣺����������ܴ����ļ���
		File file1 = new File("./src/dc_60_IO_File������ɾ��/text.txt");
		boolean b = false;
		try {
			b = file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(b);
		//�����ļ���
		File file2 = new File("./src/dc_60_IO_File������ɾ��/�½��ļ���/��һ���ļ���");
		boolean b2 = false;
		//�����ļ��� ��������������ļ��У��Ͳ�������(����)
//		b2 = file2.mkdir();
		b2 = file2.mkdirs();
		System.err.println(b2);
		//ɾ���ļ������ļ���
		//ɾ������,���߻���վ,ֱ�Ӵ�Ӳ����ɾ��
		boolean  b3 = file1.delete();
		System.out.println(b3);
		boolean  b4 = file2.delete();
		System.out.println(b4);
		File file3 = new File("./src/dc_60_IO_File������ɾ��/�½��ļ���");
		boolean  b5 = file3.delete();
		System.out.println(b5);
	}

}
