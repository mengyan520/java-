package final修饰方法;

public class B extends A {
//	public void a() {
//		
//	}
	@Override
	public final void aa() {
		super.aa();
		System.out.println("子类重写，可以加上final修饰符");
	}
}
