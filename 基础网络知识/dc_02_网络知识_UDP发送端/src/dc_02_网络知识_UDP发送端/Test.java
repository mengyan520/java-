package dc_02_网络知识_UDP发送端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test {

	public static void main(String[] args) throws IOException {
		//封装数据
		byte[] b = {'a','b','c'};
		InetAddress inetAddress = InetAddress.getLocalHost();
		DatagramPacket datagramPacket = new DatagramPacket(b, 3, inetAddress, 8080);
		//发送数据
		DatagramSocket datagramSocket = new DatagramSocket();
		datagramSocket.send(datagramPacket);
	}

}
