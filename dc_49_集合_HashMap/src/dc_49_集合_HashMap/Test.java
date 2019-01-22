package dc_49_集合_HashMap;

import java.util.HashMap;
import java.util.Map;

/*
 * 使用HashMap存储自定义对象
 * 自定义对象可以作为键，也可以作为值
 * */
public class Test {
	public static void main(String[] args) {
		function1();
		function2();
	}

	// 作为值
	private static void function1() {
		HashMap<String, Person> hashMap = new HashMap<String, Person>();
		hashMap.put("北京", new Person("a", 20));
		hashMap.put("上海", new Person("b", 18));
		hashMap.put("河南", new Person("c", 16));
		for (String keString : hashMap.keySet()) {
			System.out.println(hashMap.get(keString));
		}
		System.out.println("======");
		for (Map.Entry<String, Person> entry : hashMap.entrySet()) {
			System.out.print(entry.getKey() + ":");
			System.out.println(entry.getValue());
		}
	}

	// 作为键
	private static void function2() {
		System.out.println("======");
		HashMap<Person, String> hashMap = new HashMap<Person, String>();
		hashMap.put(new Person("a", 20), "北京");
		hashMap.put(new Person("b", 18), "深圳");
		//覆盖前面
		hashMap.put(new Person("b", 18), "广州");
		hashMap.put(new Person("c", 16), "上海");
		for (Person person : hashMap.keySet()) {
			System.out.println(hashMap.get(person));
		}
		System.out.println("======");
		for (Map.Entry<Person, String> entry : hashMap.entrySet()) {
			System.out.print(entry.getKey() + ":");
			System.out.println(entry.getValue());
		}
	}
}
