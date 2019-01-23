package dc_76_字节输出流缓冲流BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("src/text.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		bufferedOutputStream.write(100);
		bufferedOutputStream.write("你好".getBytes());
		bufferedOutputStream.close();
	}
}
