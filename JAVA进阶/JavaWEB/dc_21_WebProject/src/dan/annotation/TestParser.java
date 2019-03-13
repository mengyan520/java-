package dan.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestParser {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<Test> clazzClass = Test.class;
		Method[] methods =  clazzClass.getMethods();
		for (Method method2 : methods) {
			//判断是否使用了MyTest注解
			if (method2.isAnnotationPresent(MyTest.class)) {
				Constructor<Test> con =  clazzClass.getConstructor();
				method2.invoke(con.newInstance());
			}
		}
	}

}
