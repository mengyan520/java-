package dc_01_网络知识_InetAddress类;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) throws UnknownHostException {
		//返回本地主机,返回值InetAddress对象
		System.out.println(InetAddress.getLocalHost());
		//传递主机名(ip地址或域名)，不要传递名字，容易重复，获取InetAddress对象
		System.out.println(InetAddress.getByName("www.baidu.com"));

		InetAddress inetAddress = InetAddress.getLocalHost();
		//获取主机IP地址
		System.out.println(inetAddress.getHostAddress());
		//获取主机名
		System.out.println(inetAddress.getHostName());
	}

}
