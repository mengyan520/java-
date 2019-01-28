package dc_06_网络知识_多线程上传图片;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8016);
		// 调用服务器套接字对象中的方法accept() 获取客户端套接字对象
		while (true) {
			Socket socket = serverSocket.accept();
			new Thread(new Upload(socket)).start();
		}
	}

}
