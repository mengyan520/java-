package dc_61_IO_File获取功能;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		File file = new File("./src/dc_61_IO_File获取功能/text.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回路径中表示的文件或者文件夹名(即路径的最后部分，如:text.txt)
		System.out.println(file.getName());
		//返回路径中表示的文件的字节数
		System.out.println(file.length());
		//获取绝对路径,返回String对象
		System.out.println(file.getAbsolutePath());
		//获取绝对路径,返回File对象
		System.out.println(file.getAbsoluteFile().length());
		//获取父路径,返回String对象
		System.out.println(file.getParent());
		//获取父路径,返回File对象
		System.out.println(file.getParentFile().length());
	}
	

}
