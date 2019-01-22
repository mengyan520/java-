package dc_65_递归遍历文件目录;

import java.io.File;
//注意文件不能遍历，只能遍历文件夹
public class Test {

	public static void main(String[] args) {
		getDir(new File("/Users/ming/Python学习"));
	}

	public static void getDir(File dir) {

		File[] files = dir.listFiles();
		for (File file : files) {
			//退出条件,不是文件夹
			if (file.isDirectory()) {
				getDir(file);
			}
			System.out.println(file);
		}
	}
}
