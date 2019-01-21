package Integer类;

public class Test {

	public static void main(String[] args) {
		// 数字格式字符串转化int类型，默认十进制
		int num = Integer.parseInt("12");
		System.out.println(num);
		// 指定进制转化
		int num2 = Integer.parseInt("110", 2);
		System.out.println(num2);
		// 转化字符串
		String s1 = 12 + "";
		String s2 = Integer.toString(12);
		// 把6转成指定进制数
		String s3 = Integer.toString(6, 2);
		System.out.println(s1 + s2);
		System.out.println(s3);
		// 构造方法
		@SuppressWarnings("deprecation")
		Integer integer = new Integer("200");
		int num3 = integer.intValue();
		System.out.println(num3);
		// 最大值
		System.out.println(Integer.MAX_VALUE);
		// 最小值
		System.out.println(Integer.MIN_VALUE);
		// 十进制转成二进制,返回值都是字符串
		System.out.println(Integer.toBinaryString(10));
		// 十进制转成八进制
		System.out.println(Integer.toOctalString(10));
		// 十进制转成十六进制
		System.out.println(Integer.toHexString(10));
	}

}
