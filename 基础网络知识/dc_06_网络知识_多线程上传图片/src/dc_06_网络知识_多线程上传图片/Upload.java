package dc_06_网络知识_多线程上传图片;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable {
	private Socket socket;
	
	public Upload(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			String fileNameString = System.currentTimeMillis()+new Random().nextInt(99999)+".png";
			InputStream inputStream = socket.getInputStream();
			FileOutputStream fileOutputStream = new FileOutputStream("src/"+fileNameString);
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
			socket.close();
		} catch (Exception e) {
			throw new RuntimeException("连接失败");
		}
	}

}
