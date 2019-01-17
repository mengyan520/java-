package static关键字;
/*
 * 静态不能调用非静态，非静态可以调用静态
 * 1.专业解释:静态优先于非静态存在与内存中
 * 2.参考iOS中对象方法和类方法中self的使用
 * */
public class Student {
 	private static String schoolName = "学校";
	String name;
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
//		System.out.println(name);
		System.out.println(new Student().name);
		Student.schoolName = schoolName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(schoolName);
		this.name = name;
	}
	public static void show() {
		System.out.println("父类的静态方法");
	}
	
}
