
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8015);
		// 调用服务器套接字对象中的方法accept() 获取客户端套接字对象
		Socket socket = serverSocket.accept();
		// 通过客户端套接字对象,socket获取字节输入流,读取的是客户端发送来的数据
		InputStream inputStream = socket.getInputStream();
		FileOutputStream fileOutputStream = new FileOutputStream("src/复制005.png");
		int len = 0;
		byte[] data = new byte[1024];
		// 这里读的是字节数组，所以这里永远读不到-1，所以需要客户端终止序列
		while ((len = inputStream.read(data)) != -1) {
			fileOutputStream.write(data, 0, len);
		}
		// 服务器向客户端回数据,字节输出流,通过客户端套接字对象获取字节输出流
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("上传成功".getBytes());
		fileOutputStream.close();
		serverSocket.close();
		socket.close();

	}

}
