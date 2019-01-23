package dc_68_IO异常处理;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1. 保证流对象变量,作用域足够
 * 2. catch里面,怎么处理异常
 * 输出异常的信息,目的看到哪里出现了问题,停下程序,从新尝试
 * 3. 如果流对象建立失败了,需要关闭资源吗
 * new 对象的时候,失败了,没有占用系统资源,释放资源的时候,对流对象判断null,变量不是null,对象建立成功,需要关闭资源
 * 注意：程序解决不了IO问题（例如，光盘划坏，读取不了文件，没法处理）,停下程序,从新尝试
 * */
public class Test {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("src/dc_68_IO异常处理/text.txt");
			try {
				fileOutputStream.write(100);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("文件写入失败");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("文件创建失败");

		} finally {
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
