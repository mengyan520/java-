import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Test {

	public static void main(String[] args) throws IOException {

		// 工具类FilenameUtils
		// 获取文件扩张名
		System.out.println(FilenameUtils.getExtension("src/text.txt"));
		// 获取文件名
		System.out.println(FilenameUtils.getName("src/text.txt"));
		// 判断文件格式
		System.out.println(FilenameUtils.isExtension("src/text.txt", "exe"));
		//工具类FileUtils
		File file = new File("src/text.txt");
		//读取文件内容，并返回一个String
		System.out.println(FileUtils.readFileToString(file));
		//将字符串写入到file中 true追加
		FileUtils.writeStringToFile(file, "hah");
		System.out.println(FileUtils.readFileToString(file));
		//文件夹复制
		FileUtils.copyDirectoryToDirectory(new File("src/text1"), new File("src/text2"));
		//文件复制
		FileUtils.copyFile(file, new File("src/text2.txt"));
		
	}

}
