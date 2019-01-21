package 常用方法;

public class Test {

	public static void main(String[] args) {
		// 创建形式
		StringBuffer buffer1 = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer("abc");
		// 追加字符串
		buffer1.append("哈哈");
		buffer2.append("de");
		buffer2.append(6);
		System.out.println(buffer1);
		System.out.println(buffer2);
		// 删除一部分中字符（不包括end下标）
		buffer2.delete(0, 2);
		System.out.println(buffer2);
		// 将任意类型数据,插入到缓冲区的指定索引上
		buffer2.insert(0, "嘻嘻");
		System.out.println(buffer2);
		// 将指定的索引范围内的所有字符,替换成新的字符串（不包括end下标）
		buffer2.replace(0, 2, "哼哼");
		System.out.println(buffer2);
		// 将缓冲区中的字符反转
		buffer2.reverse();
		System.out.println(buffer2);
		// 将缓冲区中的所有字符,变成字符串（不可变）
		String str1 = buffer2.toString();
		System.out.println(str1);
		// StringBuffer是jdk1.0版本的,是线程安全的,效率低
		// StringBuilder是jdk1.5版本的,是线程不安全的,效率高，使用方法一样
		StringBuilder builder = new StringBuilder();
		builder.append("哎呀");
		System.out.println(builder);
		int[] nums = {1,2,3,4,5,6};
		System.out.println(toString(nums));
	}

	// 数组转化为字符串
	public static String toString(int[] arr) {
		StringBuffer buffer = new StringBuffer("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				buffer.append(arr[i]).append("]");
			}else {
				buffer.append(arr[i]).append(",");
			}
		}
		return buffer.toString();
	}

}
