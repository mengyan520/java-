package dc_59_File构造方法;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		// 传递路径名，可以是文件也可以是文件夹 （无论有没有，都只是把路径转化为File对象）
		File file = new File("./src/dc_59_File构造方法/test.txt");
		System.out.println(file.length());
		// 传递父子路径名
		File file2 = new File("./src/dc_59_File构造方法/", "test.txt");
		System.out.println(file2.length());
		// 传递父子路径名
		File parent = new File("./src/dc_59_File构造方法/");
		File file3 = new File(parent, "test.txt");
		System.out.println(file3.length());
	}
}
