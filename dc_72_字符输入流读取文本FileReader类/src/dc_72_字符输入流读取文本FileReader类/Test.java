package dc_72_字符输入流读取文本FileReader类;

import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("src/text.txt");
		//读取单个字符
		int len = 0;
		while ((len = fileReader.read()) != -1) {
			System.out.println((char)len);
		}
		fileReader.close();
		FileReader fileReader2 = new FileReader("src/text.txt");
		char[] ch = new char[1024];
		while ((fileReader2.read(ch)) != -1) {
			System.out.println(ch);
		}
		fileReader2.close();
	}

}
