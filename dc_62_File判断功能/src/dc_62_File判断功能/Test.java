package dc_62_File�жϹ���;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File file = new File("src");
		//�ж��ļ����ļ����Ƿ����
		System.out.println(file.exists());
		//�ж��Ƿ��Ǹ��ļ���
		System.out.println(file.isDirectory());
		//�ж��Ƿ��Ǹ��ļ�
		System.out.println(file.isFile());
	}

}
