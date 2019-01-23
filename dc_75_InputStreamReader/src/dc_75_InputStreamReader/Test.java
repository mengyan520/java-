package dc_75_InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//字节转字符
public class Test {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("src/text.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");
		char[] ch = new char[1024];
		inputStreamReader.read(ch);
		System.out.println(ch);
		inputStreamReader.close();
	}
}
