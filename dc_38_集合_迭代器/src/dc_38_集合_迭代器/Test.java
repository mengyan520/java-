package dc_38_集合_迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator是个接口
 * */
public class Test {
	public static void main(String[] args) {
		Collection<String> arr = new ArrayList<String>();
		arr.add("哈哈");
		arr.add("嘻嘻");
		arr.add("呵呵");
		arr.add("哼哼");
		// 通过 iterator() 获取出,Iterator接口的实现类的对象
		Iterator<String> it = arr.iterator();
		// next() 取出集合中的下一个元素
		// hasNext()判断集合中还有没有可以被取出的元素,如果有返回true
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		// 不常用 增强for遍历
		Collection<String> arr2 = new ArrayList<String>();
		arr2.add("笑哈哈");
		arr2.add("嘻嘻");
		arr2.add("呵呵");
		arr2.add("哼哼");
		for (Iterator<String> iterator = arr2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		// 不指定存储类型迭代
		System.out.println("=========");
		Collection collection = new ArrayList();
		collection.add("xixi");
		collection.add(3);
		collection.add("呵呵");
		Iterator it2 = collection.iterator();
		while (it2.hasNext()) {
			Object object = (Object) it2.next();
			System.out.println(object);
			
		}

	}
}
