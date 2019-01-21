package dc_42_集合_迭代器并发异常;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 迭代器的并发修改异常 java.util.ConcurrentModificationException
 * 就是在遍历的过程中,使用了集合方法修改了集合的长度,不允许的，导致迭代器并不知道集合中的变化，容易引发数据的不确定性
 * */
/*
 * 并发修改异常解决办法：
 * 在迭代时，不要使用集合的方法操作元素。
 * 或者通过ListIterator迭代器操作元素是可以的，ListIterator的出现，解决了使用Iterator迭代过程中可能会发生的错误情况
 * 注意：
 * 1>ListIterator只能用于List及其子类型。
 * 2>ListIterator有add方法，可以向List中添加对象，而Iterator不能
 * */
public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("嘻嘻");
		list.add("嘻嘻");
		list.add("abc3");
		list.add("嘻嘻");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			if (string.equals("abc3")) {// 引用类型比较最好用equals
				listIterator.add("ABC3");
			}
			System.out.println(string);

		}
		System.out.println(list);
		System.out.println("======");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equals("abc3")) {// 引用类型比较最好用equals
				list.add("ABC3");//抛出异常
			}
			System.out.println(string);

		}
	}
}
