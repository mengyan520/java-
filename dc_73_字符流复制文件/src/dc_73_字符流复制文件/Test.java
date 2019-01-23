package dc_73_字符流复制文件;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("src/text.txt");
			fileWriter = new FileWriter("src/text1.txt");
			char[] ch = new char[1024];
			int len = 0;
			while ((len = fileReader.read(ch)) != -1) {
				fileWriter.write(ch, 0, len);
				fileWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("文件打开失败");
		}finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
				if (fileWriter != null) {
					fileWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
