package private关键字体验;

//定义私有化，只能修饰成员变量和成员方法
public class Person {
	private int age;
	String name;

	// 定义让外部访问的age set方法和get方法
	public void setAge(int age) {
		if (age<0) {
			System.out.println("年龄错误");
			return;
		}
		/*
		 * 当类中存在成员变量和局部变量同名的时候为了区分
		 * 就需要使用this关键字
		 * */
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void speek() {
		System.out.println(name + "在讲话");
	}
	// 比较年龄
	public boolean comple(Person p) {
		return this.age == p.getAge();
	}
}