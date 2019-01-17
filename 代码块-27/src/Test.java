/*
 * 1.局部代码块是定义在方法或语句中,可以限定变量的声明周期
 * 2.构造代码块是定义在类中成员位置的代码块,优先于构造方法执行,每次创建对象都会调用
 * 3.静态代码块是定义在成员位置，使用static修饰的代码块,静态代码块只执行一次，优先于构造代码块
 * */
public class Test {

	public static void main(String[] args) {
		// 局部代码块
		{
			int a = 10;
			System.out.println(a);
		}
		new Person();
		new Person();
	}
}
