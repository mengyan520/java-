package dc_41_集合_list接口;

import java.util.List;
import java.util.ArrayList;

/*
 * 1>元素存取有序的集合
 * 2>带有索引的集合
 * 3>集合中可以有重复的元素，通过元素的equals方法，来比较是否为重复的元素
 * */
public class Test {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("嘻嘻");
		list.add("呵呵");
		list.add("哼哼");
		//List接口的特有方法(带索引的方法)
		//指定索引处，添加指定的元素
		list.add(1, "插入");
		System.out.println(list);
		//指定索引处的元素，从集合中删除，返回值为被删除的元素
		System.out.println(list.remove(1)+" 被移除");
		System.out.println(list);
		//指定索引处的元素，替换成指定的元素，返回值为替换前的元素
		list.set(1, "替换");
		System.out.println(list);
		//取指定索引处的元素，并返回该元素
		System.out.println(list.get(0));
	}

}
