package dc_06_反射_配置文件;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
	public static void main(String[] args)throws Exception {
		//IO流读取配置文件
		FileReader fileReader = new FileReader("src/config.properties");
		//创建集合对象
		Properties properties = new Properties();
		//加载文件
		properties.load(fileReader);
		fileReader.close();
		//反射获取指定类的class文件对象
		Class class1 = Class.forName(properties.getProperty("className"));
		//创建对象
		Object object = class1.getConstructor().newInstance();
		//获取并运行方法
//		Method method = class1.getMethod(properties.getProperty("methodName"));
		Method method = class1.getDeclaredMethod(properties.getProperty("methodName"));
		method.setAccessible(true);
		method.invoke(object);
	}
}
