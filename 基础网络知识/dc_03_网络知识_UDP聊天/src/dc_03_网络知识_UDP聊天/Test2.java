package dc_03_网络知识_UDP聊天;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test2 {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket(8007);
		byte[] data = new byte[1024];
		while (true) {
			DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
			datagramSocket.receive(datagramPacket);
			// 拆包
			System.out.println("发送IP地址：" + datagramPacket.getAddress().getHostAddress());
			System.out.println("发送数据大小：" + datagramPacket.getLength());
			System.out.println("发送端口号：" + datagramPacket.getPort());
			System.out.println("接收数据：" + new String(data, 0, datagramPacket.getLength()));
		}
	}
}
