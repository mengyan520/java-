package 构造方法_01;
/*
 * 字符串是一个常量,一旦创建,不能改变（字符串不能更改，地址（String对象）可以更改）（存放在堆内存的一个常量池里）
 * String类底层采用的是字符数组
 * */
public class Test {
	public static void main(String[] args) {
		String str1 = "abc";
		//这个方法，会创建两个对象，一个new 对象，一个"abc"字符数组
		String str2 = new String("abc");
		//引用数据类型,比较对象的地址 false
		System.out.println(str1 == str2);
		//true（底层重写了方法，比较每个字符是否相同）
		System.out.println(str1.equals(str2));
		String str3 = "abc";
		//因为这里"abc"已经创建，地址不变，只不过把str3变量指向这个地址，所以为true
		System.out.println(str1 == str3);
		bytesString();
	}
	// 参数字节数组,将字节数组的每个字节查询编码表（操作系统的默认编码表）， 生成字符串
	public static void bytesString() {
		byte[] bytes = {65,66,67};
		String str = new String(bytes);
		System.out.println(str);
		byte[] bytes2 = {65,66,67};
		//把字节数组的一部分转化为字符串,  public String(byte bytes[], int offset, int length)
		String str2 = new String(bytes2,1,1);
		System.out.println(str2);
	}
	
}
