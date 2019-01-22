package dc_52_方法可变参数;

/*
1.JDK1.5新的特性,方法的可变参数
2. 前提: 方法参数数据类型确定,参数的个数任意
3.可变参数语法: 数据类型...变量名
4.可变参数,本质就是一个数组
5.一个方法中,可变参数只能有一个
6.可变参数,必须写在参数列表的最后一位
 * */
public class Test {

	public static void main(String[] args) {
		arguments1(1, 2, 3, 4);
		System.out.println("====");
		//任意类型
		arguments2("hah", 1, 3);
		System.out.println("====");
		int sum1 = getSum(10, 2, 4, 6);
		System.out.println(sum1);
		int sum2 = getSum(10);
		System.out.println(sum2);
	}

	public static void arguments1(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int getSum(int s, int... a) {
		int sum = s;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void arguments2(Object... o) {
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
	}
}
