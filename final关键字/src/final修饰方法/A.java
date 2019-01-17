package final修饰方法;
// 父类中修饰方法，不可被重写
public class A {
	public final void a() {
		System.out.println("不可被重写");
	}
	public void aa() {
		System.out.println("可以被重写");
	}
}
