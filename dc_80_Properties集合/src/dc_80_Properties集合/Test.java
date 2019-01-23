package dc_80_Properties集合;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.annotation.processing.Filer;
/*
 * 1.Hashtable的子类，map集合中的方法都可以用（线程安全）
 * 2.主要和IO流结合，进行数据的持久化操作
 * 3.集合中键和值都必须是字符串
 * */
public class Test {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		//存储
		properties.setProperty("name", "单车");
//		properties.put("hha", 22);不要用这个，也存不进去
		//获取,没有返回null
		String key = properties.getProperty("name");
		System.out.println(key);
//		遍历
		Set<String> set = properties.stringPropertyNames();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string+"="+properties.getProperty(string));	
		}
		storeFile();
		loadFile();
		
	}
	//加载文件
	public static void loadFile() throws IOException {
		FileReader fileReader = new FileReader("src/pro.properties");
		Properties properties = new Properties();
		properties.load(fileReader);
		fileReader.close();
		System.out.println(properties);
	}
	//存储文件
	public static void storeFile() throws IOException {
		System.out.println("===============");
		FileWriter fileWriter = new FileWriter("src/pro.properties", true);
		Properties properties = new Properties();
		properties.setProperty("class", "1");
		//如果不是追加模式，会覆盖源文件内容
		properties.store(fileWriter,"");
		fileWriter.close();
	}
}
