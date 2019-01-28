package dc_02_网络知识_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// 接收方
		/// 创建数据包传输对象DatagramSocket 绑定端口号
		DatagramSocket datagramSocket = new DatagramSocket(8003);
		// 创建字节数组
		byte[] data = new byte[1024];
		// 创建数据包对象,传递字节数组
		DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
		// 调用ds对象的方法receive传递数据包
		datagramSocket.receive(datagramPacket);
		datagramSocket.close();
		//拆包
		System.out.println("发送IP地址："+datagramPacket.getAddress().getHostAddress());
		System.out.println("发送数据大小："+datagramPacket.getLength());
		System.out.println("发送端口号："+datagramPacket.getPort());
		System.out.println("接收数据："+new String(data, 0, datagramPacket.getLength()));
		
	}

}
