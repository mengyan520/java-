package dc_44_集合_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 哈希表
 * 无序集合,存储和取出的顺序不同,没有索引,不存储重复元素（单向链表）
 * 代码的编写上,和ArrayList完全一致
 * 存储、查询都比较（链表数组结合体）
 * 线程不安全
 * 当存入元素数量>哈希表长度*加载因子,就要扩容,底层会开辟一个长度为原长度2倍的数组
 * 把老元素拷贝到新数组中,再把新元素添加数组中,因此加载因子决定扩容时机
 * 默认长度16，默认加载因子0.75
 * 数组的扩容成为复制（会浪费资源）
 * 这里也称为数组的再哈希
 * */
/*
 * 1.首先调用本类的hashCode()方法算出哈希值
 * 2.在容器中找是否与新元素哈希值相同的老元素,
 * 如果没有直接存入
 * 如果有转到第三步
 * 3.新元素会与该索引位置下的老元素利用equals方法一一对比
一旦新元素.equals(老元素)返回true,停止对比,说明重复,不再存入
如果与该索引位置下的老元素都通过equals方法对比返回false,说明没有重复,存入
注意：
使用HashSet存储自定义类型，如果没有重写该类的hashCode与equals方法，
则判断重复时，使用的是地址值，如果想通过内容比较元素是否相同，
需要重写该元素类的hashcode与equals方法
 * */
public class Test {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("我");
		set.add("爱");
		set.add("你");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		//对象的哈希值,普通的十进制整数
		Person person = new Person();
		person.name="哈哈";
		person.age = 18;
		System.out.println(set.hashCode());
		System.out.println(person.hashCode());
		//String哈希值
		String string1 = "abc";
		String string2 = "abc";
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		//存储
		//简单：1.比较哈希值 2.比较equals
		System.out.println("=======");
		Person person1 = new Person();
		person1.name="哈哈";
		person1.age = 18;
		Person person2 = new Person();
		person2.name="哈哈";
		person2.age = 18;
		HashSet<Person> hashSet = new HashSet<Person>();
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println(hashSet);
	}

}
