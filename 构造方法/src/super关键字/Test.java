package super关键字;

/*
 * 在创建子类对象时，父类的构造方法会先执行，因为子类中所有构造方法的第一行有默认的隐式super();语句
 * super()语句必须是构造方法第一行代码
 * this() 是调用本类的构造方法,super()是调用父类的构造方法, 且两条语句不能同时存在
 * */
public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		student.eat();
		new Teacher();
	}

}
