package dc_65_�ݹ�����ļ�Ŀ¼;

import java.io.File;
//ע���ļ����ܱ�����ֻ�ܱ����ļ���
public class Test {

	public static void main(String[] args) {
		getDir(new File("/Users/ming/Pythonѧϰ"));
	}

	public static void getDir(File dir) {

		File[] files = dir.listFiles();
		for (File file : files) {
			//�˳�����,�����ļ���
			if (file.isDirectory()) {
				getDir(file);
			}
			System.out.println(file);
		}
	}
}
