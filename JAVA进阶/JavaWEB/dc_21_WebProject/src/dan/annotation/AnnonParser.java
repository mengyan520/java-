package dan.annotation;

import java.lang.reflect.Method;

public class AnnonParser {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//解析注解,获取参数
		Class clazzClass = Test.class;
		Method method =  clazzClass.getMethod("show");
		
		Cutstom cutstom = method.getAnnotation(Cutstom.class);
		System.out.println(cutstom);
		System.out.println(cutstom.value());
	}
}
