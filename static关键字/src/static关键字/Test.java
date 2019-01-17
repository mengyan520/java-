package static关键字;

import java.awt.geom.PathIterator;

/*
 * static修饰的变量和方法都属于类 (对象之间共享数据,节省内存),但是静态的声明周期长跟类一样，多了也在一定程度上浪费
 * 通过类名来调用
 * 对象也可通过对象名调用，但是不推荐(编译警告)
 * 
 * 场景使用：
 * 1.变量
 * 看是否事物之间是否有共性
 * 2.方法
 * 跟随变量走，是否使用静态变量
 * 
 * 多态调用静态方法：
 * 多态中的静态方法,编译看父类,运行仍然看父类。因为静态和对象没有关系(静态绑定)
 * 
 * 静态常量使用:
 * public static final 数据类型 变量名 = 值;
 * 注意：变量名用全部大写，多个单词使用下划线连接
 * */
public class Test {
	public static final double PI = 3.14;
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("张三");
		System.out.println(s1.getName());
		System.out.println(s1.getSchoolName());// 编译警告
		System.out.println(Student.getSchoolName());
		// 修改静态变量
		Student.setSchoolName("基础班");

		Student s2 = new Student();
		s2.name = "李四";
		System.out.println(s2.getName());
		System.out.println(s2.getSchoolName());// 编译警告
		System.out.println(Student.getSchoolName());
		//多态， 因为多态是对象的，与类无关,而静态是属于类的
		Student s3 = new Zi();
		s3.show();
		//静态常量
		System.out.println(Test.PI);
	}

}
