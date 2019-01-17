package 重写equals方法;
/*
 * 重写equals，一般用来比较两个对象的成员变量是否相等
 * */
public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(18);
		Person p2 = new Person(18);
		Person p3 = new Person(20);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p2.equals("哈哈"));
		System.out.println(p2.equals(null));
		System.out.println(p2.equals(p1));
	}

}
