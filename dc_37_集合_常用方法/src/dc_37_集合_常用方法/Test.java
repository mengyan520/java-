package dc_37_集合_常用方法;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
	public static void main(String[] args) {
		//指定存储的引用类型
		Collection<String> arr = new ArrayList<String>();
		//添加元素
		arr.add("哈哈");
		arr.add("嘻嘻");
		arr.add("呵呵");
		arr.add("嘻嘻");
		System.out.println(arr);
		//判断是否存在某个元素
		System.out.println("是否存在："+arr.contains("嘻嘻"));
		//获取元素个数
		System.out.println("元素个数："+arr.size());
		// 集合转化成数组,返回对象是 Object[] 
		Object[] strings = arr.toArray();
		System.out.println(strings[0]);
		//移除集合中指定的元素,如果有多个，删除第一个,返回值boolean
		System.out.println(arr.remove("嘻嘻"));
		System.out.println(arr.remove("哎呀"));
		System.out.println(arr);
		//清空列表存储的元素
		arr.clear();
		System.out.println(arr);
		//不指定存储类型
		System.out.println("=========");
		Collection collection = new ArrayList();
		collection.add("xixi");
		collection.add(3);
		System.out.println(collection);
	}
}
