package dc_67_字节输出流FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 注意：流对象的构造方法,可以创建文件,如果文件存在,直接覆盖（注：不是追加方式）
 * */
public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("src/dc_67_字节输出流FileOutputStream/text.txt");
		//创建一个向指定 File 对象表示的文件中写入数据的文件输出流
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//追加的方式写入
//		FileOutputStream fileOutputStream = new FileOutputStream(file, true);
		//字符串形式
		FileOutputStream fileOutputStream = new FileOutputStream("src/dc_67_字节输出流FileOutputStream/text1.txt");
		//写入一个字节  ascii码 ,汉字占两个字节(负数表示)
		fileOutputStream.write(97);
		fileOutputStream.write(65);
		byte[] by = {49,48,48};
		//写入一个字节数组
		fileOutputStream.write(by);
		//写入字节数组的一部分 （不能越界）
		fileOutputStream.write(by, 0, 2);
		//利用字符串可以获取字节数组的方法写入
		fileOutputStream.write("你好\r\n".getBytes());
		//换行
		fileOutputStream.write("\r\n嘻嘻".getBytes());
		//关闭
		fileOutputStream.close();
	}

}
