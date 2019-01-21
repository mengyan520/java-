package 正则表达式练习;

public class Test {

	public static void main(String[] args) {
		// matches(String 正则的规则) 是否匹配正则表达式，返回bool值
		String str1 = "abc";
		System.out.println(str1.matches("[a]"));
		// String[] split(String 正则的规则),返回字符串数组,如果不符合正则，则整体放进数组里面
		String str2 = "12-24-43-44";
		String[] str = str2.split("-");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		// String replaceAll( String 正则规则,String 字符串)
		System.out.println(str1.replaceAll("bc", "哈"));
		checkQQ();
		checkEmail();
	}
	/*
	 * 检测qq号码
	 *不是0开头,纯数字,5-10位
	 * */
	public static void checkQQ() {
		String qqString = "q234555555";
		// [1-9][0-9]{4,9}
		System.out.println(qqString.matches("[1-9][\\d]{4,9}"));
	}
	/*
	 * 检测邮箱
	 * 1145968323@qq.com
	 * m765462460@126.com
	 * m765462460@126.cn
	 * @前面数字和字母(包括_)都可以
	 * */
	public static void checkEmail() {
		String qqString = "m1145968323@126.cn.com";
		// [1-9][0-9]{4,9}
		System.out.println("邮箱："+qqString.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+"));
	}
}
