package dc_03_网络知识_UDP聊天;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
		DatagramSocket datagramSocket = new DatagramSocket();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			// next()收到空格就结束，现在用一行
			byte[] data = scanner.nextLine().getBytes();
			DatagramPacket datagramPacket = new DatagramPacket(data, data.length, inetAddress, 8007);
			datagramSocket.send(datagramPacket);
		}
	}

}
