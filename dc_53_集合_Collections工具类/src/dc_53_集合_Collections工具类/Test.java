package dc_53_集合_Collections工具类;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(2);
		// 升序,必须是list集合
		Collections.sort(list);
		System.out.println(list);
		// 二分查找
		int index = Collections.binarySearch(list, 10);
		System.out.println(index);
		// 随机排序
		Collections.shuffle(list);
		System.out.println(list);

	}
}
