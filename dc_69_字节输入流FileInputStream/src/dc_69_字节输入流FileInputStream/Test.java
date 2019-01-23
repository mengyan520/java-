package dc_69_字节输入流FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
/*
 * 构造方法与输出流：
 * 基本一致
 * */
public class Test {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("src/text.txt");
		//每次读取一个字节,自动移动下一个字节，返回-1表示文件结束
		int len = 0;
		while (len != -1) {
			len = fileInputStream.read();
			//字节转化字符,注意汉字乱码
			System.out.println((char)len);
		}
		fileInputStream.close();
		//读取字节数组,注意不能 byte[] bytes = {},不能确定长度，不能确定存放数据
		FileInputStream fileInputStream2 = new FileInputStream("src/text.txt");
		byte[] b = new byte[1024];//一般写1024字节或者其倍数
		int len2 = 0 ;
		while( (len2 = fileInputStream2.read(b)) !=-1){
			//利用String构造方法打印数据
			System.out.print(new String(b,0,len2));
		}
		fileInputStream2.close();
	}

}
