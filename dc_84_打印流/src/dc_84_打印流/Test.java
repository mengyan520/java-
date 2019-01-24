package dc_84_打印流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 方法print println  原样输出
 * write方法走码表
 */
/*自动刷新
 * 1. 输出的数据目的必须是流对象
 * OutputStream  Writer
 * 2.必须调用println,printf,format三个方法中的一个,启用自动刷新
 * */
public class Test {
	public static void main(String[] args) throws IOException {
		// 打印到文件中
		File file = new File("src/text.txt");
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.print("哈哈");
		printWriter.flush();
		printWriter.println();
		printWriter.flush();
		
		printWriter.println("100");
		printWriter.write(100);

		printWriter.flush();
		printWriter.close();
		// 打印到字符串文件名
		PrintWriter printWriter2 = new PrintWriter("src/text2.txt");
		printWriter2.print("哈哈");
		printWriter2.flush();
		printWriter2.close();
		//打印到字节流或者字符流
		FileOutputStream fileOutputStream = new FileOutputStream("src/text3.txt");
		PrintWriter printWriter3 = new PrintWriter(fileOutputStream);
		printWriter3.print("哈哈");
		printWriter3.close();
		FileWriter fileWriter = new FileWriter("src/text4.txt");
		PrintWriter printWriter4 = new PrintWriter(fileWriter);
		printWriter4.print("哈哈");
		printWriter4.close();
		//自动刷新
		FileOutputStream fileOutputStream2 = new FileOutputStream(new File("src/text4.txt"),true);
//		FileOutputStream fileOutputStream2 = new FileOutputStream("src/text5.txt");
		PrintWriter printWriter5 = new PrintWriter(fileOutputStream2,true);
		printWriter5.println("哈哈");
		printWriter5.close();
	}
}
