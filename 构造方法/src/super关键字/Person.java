package super关键字;
/*
 * 父类有多个构造方法，只要实现一个就行
 * */
public class Person {
	public Person() {
		System.out.println("父类构造方法");
	}
	public Person (String name) {
		System.out.println("父类:"+name);
	}
	public void eat() {
		System.out.println("人吃东西");
	}
}
