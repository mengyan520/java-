package dc_80_Properties����;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.annotation.processing.Filer;
/*
 * 1.Hashtable�����࣬map�����еķ����������ã��̰߳�ȫ��
 * 2.��Ҫ��IO����ϣ��������ݵĳ־û�����
 * 3.�����м���ֵ���������ַ���
 * */
public class Test {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		//�洢
		properties.setProperty("name", "����");
//		properties.put("hha", 22);��Ҫ�������Ҳ�治��ȥ
		//��ȡ,û�з���null
		String key = properties.getProperty("name");
		System.out.println(key);
//		����
		Set<String> set = properties.stringPropertyNames();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string+"="+properties.getProperty(string));	
		}
		storeFile();
		loadFile();
		
	}
	//�����ļ�
	public static void loadFile() throws IOException {
		FileReader fileReader = new FileReader("src/pro.properties");
		Properties properties = new Properties();
		properties.load(fileReader);
		fileReader.close();
		System.out.println(properties);
	}
	//�洢�ļ�
	public static void storeFile() throws IOException {
		System.out.println("===============");
		FileWriter fileWriter = new FileWriter("src/pro.properties", true);
		Properties properties = new Properties();
		properties.setProperty("class", "1");
		//�������׷��ģʽ���Ḳ��Դ�ļ�����
		properties.store(fileWriter,"");
		fileWriter.close();
	}
}
