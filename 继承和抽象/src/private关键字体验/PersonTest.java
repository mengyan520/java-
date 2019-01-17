package private关键字体验;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.setAge(-100);
		p.setAge(100);
		System.out.println(p.getAge());
		p.speek();
		Person p2 = new Person();
		p2.setAge(10);
		System.out.println(p.comple(p2));
	}

}
