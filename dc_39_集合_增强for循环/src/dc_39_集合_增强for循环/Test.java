package dc_39_集合_增强for循环;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
	public static void main(String[] args) {

		Collection<String> arr = new ArrayList<String>();
		arr.add("哈哈");
		arr.add("嘻嘻");
		arr.add("呵呵");
		arr.add("嘻嘻");
		for (String string : arr) {
			string = string + "爱";
			System.out.println(string);
		}
		System.out.println(arr);
		Collection<Person> arr2 = new ArrayList<Person>();
		arr2.add(new Person(20));
		arr2.add(new Person(10));
		for (Person person : arr2) {
			person.age = person.age + 10;
		}
		System.out.println(arr2.toString());
	}
}
