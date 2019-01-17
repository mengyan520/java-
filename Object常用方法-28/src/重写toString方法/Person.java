package 重写toString方法;

public class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public Person() {
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 重写equals方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null & (obj instanceof Person)) {
			return this.age == ((Person) obj).age;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.name + this.age;
	}
}
