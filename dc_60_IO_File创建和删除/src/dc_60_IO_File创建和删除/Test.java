package dc_60_IO_File创建和删除;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		//创建文件 如果存在这样的文件，就不创建了
		//注意：这个方法不能创建文件夹
		File file1 = new File("./src/dc_60_IO_File创建和删除/text.txt");
		boolean b = false;
		try {
			b = file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(b);
		//创建文件夹
		File file2 = new File("./src/dc_60_IO_File创建和删除/新建文件夹/下一级文件夹");
		boolean b2 = false;
		//创建文件夹 如果存在这样的文件夹，就不创建了(单层)
//		b2 = file2.mkdir();
		b2 = file2.mkdirs();
		System.err.println(b2);
		//删除文件或者文件夹
		//删除方法,不走回收站,直接从硬盘中删除
		boolean  b3 = file1.delete();
		System.out.println(b3);
		boolean  b4 = file2.delete();
		System.out.println(b4);
		File file3 = new File("./src/dc_60_IO_File创建和删除/新建文件夹");
		boolean  b5 = file3.delete();
		System.out.println(b5);
	}

}
