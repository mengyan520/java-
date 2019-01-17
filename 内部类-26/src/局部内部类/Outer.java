package 局部内部类;
/*
 * 局部内部类，定义在外部类方法中的局部位置
 * 与访问方法中的局部变量相似，可通过调用方法进行访问
 * */
public class Outer {
	public void out() {
		class Inner {
			public void inner() {
				System.out.println("局部内部类方法");
			}
		}
		Inner in = new Inner();
		in.inner();
	}
}
