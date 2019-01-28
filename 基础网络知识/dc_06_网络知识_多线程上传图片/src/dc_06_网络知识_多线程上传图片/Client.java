package dc_06_网络知识_多线程上传图片;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args)throws IOException {
		// 创建套接字
		Socket socket = new Socket("127.0.0.1", 8016);
		// 获取输出流,将数据输出,输出到服务器
		OutputStream outputStream = socket.getOutputStream();
		FileInputStream fileInputStream = new FileInputStream("src/005.png");
		int len = 0;
		byte[] img = new byte[1024];
		// 这边读的是图片文件
		while ((len = fileInputStream.read(img)) != -1) {
			outputStream.write(img, 0, len);
		}
		// 给服务器写终止序列
		socket.shutdownOutput();
		// 获取输入流,从服务器端读取数据
		InputStream inputStream = socket.getInputStream();
		byte[] data = new byte[1024];
		// 注意：read方法，如果在没有读取到数据之前，一直处于阻塞状态
		int len2 = inputStream.read(data);
		System.out.println(new String(data, 0, len2));
		// 关闭套接字
		fileInputStream.close();
		socket.close();
	}
}
