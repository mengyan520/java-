package dc_03_xml解析;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test {

	public static void main(String[] args)  {
		try {
			// 创建解析器对象
			SAXReader saxReader = new SAXReader();
			// 使用解析器加载web.xml文件得到document对象
			Document document =  saxReader.read("src/4.xml");
			//获取元素
			Element rootElement = document.getRootElement();
			//根据元素名称获取子元素节点
			Element servletElement = rootElement.element("servlet");
			//获取当前元素的名称
			System.out.println(servletElement.getName());
			//根据元素名称获取servlet-class的文本节点
			System.out.println("=======");
			String servletClass = servletElement.element("servlet-class").getText();
			System.out.println(servletClass);
			//获取指定名称子元素的元素值
			System.out.println("=======");
			System.out.println(servletElement.elementText("servlet-name"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
