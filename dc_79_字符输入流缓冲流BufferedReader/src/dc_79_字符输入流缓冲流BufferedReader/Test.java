package dc_79_字符输入流缓冲流BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/text.txt"));
//		char[] ch = new char[1024];
//		int len = 0;
//		while ((len = bufferedReader.read(ch)) != -1) {
//			System.out.println(ch);
//		}
		//特有方法，读取一个文本行，包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
		String string = null;
		while ((string = bufferedReader.readLine()) != null) {
			System.out.println(string);
		}
		bufferedReader.close();
	}

}
