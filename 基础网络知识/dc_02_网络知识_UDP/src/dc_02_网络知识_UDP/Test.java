package dc_02_网络知识_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test {

	public static void main(String[] args) throws IOException {
		// 发送
		byte[] data = "你好，UDP".getBytes();
		InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
		DatagramPacket datagramPacket = new DatagramPacket(data, data.length, inetAddress, 8003);
		// 发送数据
		DatagramSocket datagramSocket = new DatagramSocket();
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
	}

}
