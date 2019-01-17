package 成员内部类;

/*
 * 创建成员内部类 :
 * 外部类名.内部类名 变量名 = new 外部类名().new 内部类名();
 * */
public class Test {
	public static void main(String[] args) {

		Outer.Inner in = new Outer().new Inner();
		in.inner();
	}

}
