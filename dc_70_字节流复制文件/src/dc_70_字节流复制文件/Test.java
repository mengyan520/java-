package dc_70_字节流复制文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		//读文件
		FileInputStream fileInputStream = null;
		byte[] b = new byte[1024];
		int len = 0;
		try {
			fileInputStream = new FileInputStream("src/text.txt");
			try {
				while ((len = fileInputStream.read(b)) != -1) {
					System.out.println(new String(b,0,len));
				}	
				writeFile(b);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("文件读取失败");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("文件打开失败");
		}finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("文件关闭失败");
			}
		}
	}
	//写文件
	public static void writeFile(byte[] b) {
		FileOutputStream fileOutputStream = null;
		  try {
			fileOutputStream= new FileOutputStream("src/text1.txt");
			try {
				fileOutputStream.write(b);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("文件写入失败");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("文件打开失败");
		}finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("文件关闭失败");
			}
		}
		
	}
}
