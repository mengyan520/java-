package dc_04_网络知识_04_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		// 创建套接字
		Socket socket = new Socket("127.0.0.1", 8012);
		// 获取输出流,将数据输出,输出到服务器
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("你好".getBytes());
		// 获取输入流,从服务器端读取数据
		InputStream inputStream = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = inputStream.read(data);
		System.out.println(new String(data, 0, len));
		// 关闭套接字
		socket.close();
	}

}
