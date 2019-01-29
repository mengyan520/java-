package dc_04_反射_获取成员方法;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		Class class1 = Class.forName("dc_04_反射_获取成员方法.Person");
		Object object = class1.getConstructor().newInstance();
		// 获取所有公共成员方法
		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("============");
		// 获取指定有参
		Method method2 = class1.getMethod("setName", String.class);
		System.out.println(method2);
		method2.invoke(object, "单车");
		System.out.println(object);
		System.out.println("============");
		// 获取指定无参
		Method method = class1.getMethod("getName");
		System.out.println(method);
		System.out.println(method.invoke(object));
		System.out.println("============");
		System.out.println("============");
		//获取所有（私有），不包括继承的
		Method[] methods2 = class1.getDeclaredMethods();
		for (Method method3 : methods2) {
			System.out.println(method3);
		}
		System.out.println("============");
		//运行私有
		Method method3 = class1.getDeclaredMethod("eat");
		System.out.println(method3);
		method3.setAccessible(true);
		method3.invoke(object);
	}

}
