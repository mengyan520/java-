package dc_47_集合_Entry静态内部接口;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Entry是Map接口中提供的一个静态内部嵌套接口
 * Map的子类的内部类实现
 * 作用：将键值对的对应关系封装成对象
 * */
public class Test {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		//用于返回Map集合中所有的键值对(Entry)对象，以Set集合形式返回。
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) iterator
					.next();
			//key
			System.out.print(entry.getKey()+":");
			//value
			System.out.println(entry.getValue());
		}
	}
}
