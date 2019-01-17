package toString方法;import javax.crypto.interfaces.PBEKey;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Person() {}
	public Person(int age) {
		super();
		this.age = age;
	}
	//重写equals方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null & (obj instanceof Person)) {
			return this.age == ((Person)obj).age;
		}
		return false;
	}
}
