package 重写toString方法;
/*
 * toString方法返回该对象的字符串表示，其实该字符串内容就是对象的类型+@+内存地址值
 * */
public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(18,"张三");
		String pString = p1.toString();
		System.out.println(pString);
		//打印对象，默认调用对象的toString方法
		System.out.println(p1);
	}

}
