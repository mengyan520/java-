package dc_71_字符输出流写文本FileWriter类;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("src/text.txt");
		// 写一个字符
		fileWriter.write(100);
		// 刷新缓冲区 需要调用刷新功能，才能真正写入,
		fileWriter.flush();
		fileWriter.write('哼');
		fileWriter.flush();
		// 写字符数组
		fileWriter.write((new String("你好").toCharArray()));
		fileWriter.flush();
		// 写字符数组的一部分
		String string = "哈哈哈嘻嘻嘻";
		fileWriter.write(string.toCharArray(), 0, 4);
		fileWriter.flush();
		// 直接写入字符串
		fileWriter.write("java");
		fileWriter.flush();
		// 直接写入字符串的一部分
		fileWriter.write("哎呀怎么啦", 1, 2);
		fileWriter.flush();
		// close()前会自动执行flush(),最好写一次刷新一次，因为，如果最后在刷新，数据预先保存在内存中，浪费空间
		fileWriter.close();
	}

}
