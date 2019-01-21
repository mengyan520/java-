package 其他方法_02;

public class Test {

	public static void main(String[] args) {
		String str1 = "哈哈Sdhgfs";
		// 获取字符串长度
		System.out.println(str1.length());
		// 返回字符串中的一部分，包含起点，但不包含结束位置的字符(注意不能越界)
		String str2 = str1.substring(4, 5);
		System.out.println(str2);
		// 返回字符串的一部分，从下标到结尾
		String str3 = str1.substring(4);
		System.out.println(str3);
		// 判断是否以什么开头
		System.out.println(str1.startsWith("哈哈"));
		// 判断是否以什么结尾
		System.out.println(str1.endsWith("gfs"));
		// 判断是否包含某个字符串
		System.out.println(str1.contains("sd"));
		// 判断字符串中的字符是否相同,忽略大小写
		System.out.println(str1.equalsIgnoreCase("哈哈SDhgfs"));
		// 查找字符或者字符串第一次出现的索引,不存在返回-1
		System.out.println(str1.indexOf("fs"));
		System.out.println(str1.indexOf('S'));
		System.out.println(str1.indexOf('j'));
		// 字符串大小写转换
		System.out.println("大写:"+str1.toUpperCase());
		System.out.println("小写:"+str1.toLowerCase());
		// 将字符串转成字符数组
		char[] chs = str1.toCharArray();
		System.out.println(chs);
		// 将字符串转成字节数组
		String string = "abAB";
		byte[] bytes = string.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		count();
	}
	// 查询一个字符串在另一个字符串出现的次数
	public static void count() {
		String string = "hellojava,nihaojava,javanb";
		String key = "java";
		int count = 0;
		int index = 0;
		while((index = string.indexOf(key)) != -1) {
			count++;
			string = string.substring(index+key.length());
		}
		System.out.println("出现次数:"+count);
	}

}
