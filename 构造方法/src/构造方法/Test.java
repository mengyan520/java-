package 构造方法;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person(18, "张三");
		p1.des();
		Person p2 = new Person("李四", 20);
		p2.des();
		Person p3 = new Person();
		p3.des();
	}
}
