package dc_04_网络知识_04_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8012);
		// 调用服务器套接字对象中的方法accept() 获取客户端套接字对象
		Socket socket = serverSocket.accept();
		// 通过客户端套接字对象,socket获取字节输入流,读取的是客户端发送来的数据
		InputStream inputStream = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = inputStream.read(data);
		System.out.println(new String(data, 0, len));
		//服务器向客户端回数据,字节输出流,通过客户端套接字对象获取字节输出流
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("你好，我是服务器".getBytes());
		serverSocket.close();
		socket.close();
		
	}

}
