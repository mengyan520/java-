package 构造方法;

/*
 * 1.格式:
 * 修饰符 构造方法名(类名)(参数列表){}
 * 
 * 2.一个类中可以有多个构造方法，多个构造方法是以重载的形式存在的
 * */
public class Person {
	private int age;
	private String name;
	public Person() {
		// 调用其他构造方法,必须放在第一行
		this(20, "明月");
		
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void des() {
		System.out.println(this.age + this.name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
