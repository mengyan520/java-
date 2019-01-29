package dc_03_反射_获取成员变量;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
		Class class1 = Class.forName("dc_03_反射_获取成员变量.Person");
		// 获取公共成员变量
		Field[] fields = class1.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		// 获取指定公共成员变量
		Field field = class1.getField("height");
		System.out.println(field);
		System.out.println("======");
		// 获取所有成员变量
		Field[] fields2 = class1.getDeclaredFields();
		for (Field field2 : fields2) {
			System.out.println(field2);
		}
		System.out.println("======");
		// 获取指定成员变量
		Field field2 = class1.getDeclaredField("name");
		System.out.println(field2);
		System.out.println("======");
		// 改变公共成员变量
		Constructor constructor = class1.getConstructor();
		Object object = constructor.newInstance();
		field.set(object, 18);
		System.out.println(object);
	}

}
