package dc_45_LinkedHashSet;

import java.util.LinkedHashSet;
/*
 *基于链表的哈希表实现，继承自HashSet （双向链表）
 *LinkedHashSet 自身特性,具有顺序,存储和取出的顺序相同的
 *线程不安全的集合,运行速度块
 * */
public class Test {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("我");
		linkedHashSet.add("爱");
		linkedHashSet.add("你");
		System.out.println(linkedHashSet);
	}

}
