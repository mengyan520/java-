package equals方法;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		//equals比较内存地址是否相等，只能用于引用类型, equals底层调用的就是 == 比较运算符，只不过只允许引用类型使用
		System.out.println(p1.equals(p2));
		//==是一个比较运算符号,既可以比较基本数据类型,也可以比较引用数据类型,基本数据类型比较的是值,引用数据类型比较的是地址值
		System.out.println(p1==p2);
		System.out.println(1==1);
	}

}
