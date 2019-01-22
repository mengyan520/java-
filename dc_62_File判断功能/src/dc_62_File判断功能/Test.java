package dc_62_File判断功能;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File file = new File("src");
		//判断文件或文件夹是否存在
		System.out.println(file.exists());
		//判断是否是个文件夹
		System.out.println(file.isDirectory());
		//判读是否是个文件
		System.out.println(file.isFile());
	}

}
