package dc_74_OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 主要作用：字符转化为字节
 * 构造方法
 * 1.OutputStreamWriter(OuputStream out)接收所有的字节输出流 
 * 字节输出流：  FileOutputStream       
 * 2.OutputStreamWriter(OutputStream out, String charsetName) 
 * String charsetName 传递编码表名字 GBK  UTF-8 
 * */
public class Test {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("src/text.txt");
		//默认 UTF-8
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"GBK");
		outputStreamWriter.write("你好");
		//关闭这个，字节输出流也会关闭
		outputStreamWriter.close();
	}

}
