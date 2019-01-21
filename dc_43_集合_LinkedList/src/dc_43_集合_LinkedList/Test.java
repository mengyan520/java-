package dc_43_集合_LinkedList;

import java.util.LinkedList;

/*
 * 底层采用链表结构,每次查询都要从链头或链尾找起,查询相对数组较慢（查询慢,增删快）
 * 但是删除直接修改元素记录的地址值即可,不要大量移动元素
 * */
public class Test {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("哈哈");
		// LinkedList特有方法（获取,添加,删除）
		// 添加到链表的开头
		linkedList.addFirst("嘻嘻");
		// 添加到链表的尾部
		linkedList.addLast("哼哼");
		System.out.println(linkedList);
		// 保证，链表有元素
		if (!linkedList.isEmpty()) {
			// 获取链表的开头
			System.out.println("开头：" + linkedList.getFirst());
			// 获取链表的尾部
			System.out.println("尾部：" + linkedList.getLast());
			// 移除并返回链表的开头
			System.out.println(linkedList.removeFirst());
			// 移除并返回链表的尾部
			System.out.println(linkedList.removeLast());
		}
	}
}
