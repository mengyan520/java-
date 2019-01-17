package final修饰变量;

/*
 * 一次赋值，终身不变
 * 
 * */
public class Test {

	public static void main(String[] args) {
		// 修饰局部变量
		final int i = 10;
//		i = 10;
		System.out.println(i);
		// 修饰对象,对象的内存地址不可更改
		final A a = new A();
		a.show();
//		a = new A();
//		a=  null;
//		a.n = 20;
//		a.m = 30;
		System.out.println(a.n);
		System.out.println(a.m);
	}

}
