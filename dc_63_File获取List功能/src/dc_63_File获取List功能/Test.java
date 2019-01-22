package dc_63_File获取List功能;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File file = new File("src/dc_63_File获取List功能");
		// 获取当前目录下所有文件和文件夹的名字数组
		String[] strings = file.list();
		for (String string : strings) {
			System.out.println(string);
		}
		// 获取当前目录下所有文件和文件夹的File数组
		File[] files = file.listFiles();
		for (File file2 : files) {
			//返回的是目录或者文件的全路径
			System.out.println(file2);
		}
		//列出可用的文件系统根 
		File[] files2 = File.listRoots();
		for (File file3 : files2) {
			//返回的是目录或者文件的全路径
			System.out.println(file3);
		}
	}

}
