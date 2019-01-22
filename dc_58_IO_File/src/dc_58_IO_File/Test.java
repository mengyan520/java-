package dc_58_IO_File;

import java.io.File;
/*
 * 操作文件和文件夹（目录）
 * 静态成员变量:
 * 1.pathSeparator
 * 与系统有关的路径分隔符，为了方便，它被表示为一个字符串
 * 2.separator
 * 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
 * */
public class Test {
	public static void main(String[] args) {
		//win ;   Linux :
		System.out.println(File.pathSeparator);
		//win \   Linux /
		System.out.println(File.separator);
	}
}
