package 成员内部类;
/*
 * 1.定义内部类时，就是一个正常定义类的过程，同样包含各种修饰符、继承与实现关系等
 * 2.在内部类中可以直接访问外部类的所有成员，包括私有
 * */
public class Outer {
	private int a = 1;
	
	class Inner {
		int a = 10;
		public void inner() {
			int a =30;
			//调用局部变量
			System.out.println("局部变量:a="+a);
			//调用内部类成员变量
			System.out.println("内部类成员变量:a="+this.a);
			//调用外部类成员变量
			System.out.println("外部类成员变量:a="+Outer.this.a);
		}
	}
}
