package dc_77_字节输入流缓冲流BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/text.txt"));
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = bufferedInputStream.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		bufferedInputStream.close();
	}
}
