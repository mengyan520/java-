package dc_04_利用反射读取xml配置文件;

import java.lang.reflect.Method;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test {

	public static void main(String[] args)throws Exception {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read("src/web.xml");
		Element rooElement = document.getRootElement();
		String myServlet1 = rooElement.element("servlet").element("servlet-class").getText();
		//利用反射创建对象,运行对象方法
		Class class1 = Class.forName(myServlet1);
		Object object = class1.newInstance();
		Method method = class1.getMethod("init");
		method.invoke(object);
	}

}
