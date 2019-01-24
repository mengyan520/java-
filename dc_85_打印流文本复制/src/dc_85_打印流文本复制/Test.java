package dc_85_打印流文本复制;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
1.读取数据源  BufferedReader+File 读取文本行
2.写入数据目的 PrintWriter+println 自动刷新
 * */
public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/text.txt"));
		PrintWriter printWriter = new PrintWriter(new FileWriter("src/text2.txt"), true);
		String lineString = null;
		while ((lineString = bufferedReader.readLine()) != null) {
			printWriter.println(lineString);
		}
		bufferedReader.close();
		printWriter.close();

	}

}
