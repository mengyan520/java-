package dc_05_反射_泛型擦除;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws Exception {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		// 在泛型为String的集合里，添加Integer的数据
		Class class1 = arrayList.getClass();
		// 获取add方法
		Method method = class1.getMethod("add", Object.class);
		method.invoke(arrayList, 100);
		method.invoke(arrayList, 200);
		method.invoke(arrayList, 300);
		System.out.println(arrayList);
	}

}
