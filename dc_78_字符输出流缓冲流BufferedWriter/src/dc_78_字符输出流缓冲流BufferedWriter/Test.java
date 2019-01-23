package dc_78_字符输出流缓冲流BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/text.txt"));
		bufferedWriter.write('a');
		bufferedWriter.flush();
		bufferedWriter.write("你好");
		//特有方法，换行
		bufferedWriter.newLine();
		bufferedWriter.flush();
		bufferedWriter.write("哈哈".toCharArray());
		bufferedWriter.flush();
		bufferedWriter.close();
	}

}
