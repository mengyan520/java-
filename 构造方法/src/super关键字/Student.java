package super关键字;

public class Student extends Person {
	public Student() {
		super("明月");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("学生吃东西");
	}
}
