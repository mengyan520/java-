import java.util.ArrayList;
public class ArraylistDemo {
	public static void main(String[] args) {
		// 存放String 类型
		ArrayList<String> arr1 = new ArrayList<String>();
		// 添加元素
		arr1.add("单车");
		// 获取对应下标的元素
		System.out.println(arr1.get(0));
		// 获取集合长度
		System.out.println(arr1.size());
		// 改变对应下标的元素
		arr1.set(0,"明月");
		System.out.println(arr1.get(0));
		// 删除对应下标的元素
		arr1.remove(0);
		System.out.println(arr1.size());
		// 清楚集合所有元素
		arr1.add("单车");
		System.out.println(arr1.size());
		arr1.clear();
		System.out.println(arr1.size());
		// 遍历
		System.out.println("遍历集合");
		arr1.add("张三");
		arr1.add("明月");
		arr1.add("里斯");
		for (int i = 0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
	}
}