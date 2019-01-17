package final修饰变量;

/*
 * 修饰成员变量
 * 1.可以直接赋值
 * 2.在构造方法中赋值
 * 之后都不可更改
 * 注意：成员变量在内存有默认值，但是final修饰不可更改的是手动赋值
 * */
public class A {
	final int n = 10;
	final int m;

	public A() {
		super();
		m = 20;
	}

	public void show() {
		System.out.println("show");
	}
}
