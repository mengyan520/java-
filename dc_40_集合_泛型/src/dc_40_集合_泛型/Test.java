package dc_40_集合_泛型;
/*
 * 1.? extends Employee 限制的是父类, 上限限定, 可以传递Employee,传递他的子类对象
 * 2.? super   Employee 限制的是子类, 下限限定, 可以传递Employee,传递他的父类对象
 * */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class Test {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("123");
		arr1.add("456");
		HashSet<Integer> arr2 = new HashSet<Integer>();
		arr2.add(789);
		arr2.add(101);
		each(arr1);
		each(arr2);
		// 泛型限定
		ArrayList<Person> arr3 = new ArrayList<Person>();
		Teacher teacher = new Teacher();
		arr3.add(teacher);
		Student student = new Student();
		arr3.add(student);
		eachp(arr3);
	}

	// 泛型的通配,匹配所有的数据类型 ?
	public static void each(Collection<?> c) {
		Iterator<?> iterator = c.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		}
	}
	public static void eachp(Collection<? extends Person> c) {
		Iterator<? extends Person> iterator = c.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			person.eat();
			person.run();
			
		}
	}
}
