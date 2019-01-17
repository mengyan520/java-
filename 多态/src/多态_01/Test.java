package 多态_01;
/*
 * 适用于类、抽象类、接口
 * 
 * 多态-向上转型成员变量: 编译和运行都参考等号的左边
 * 多态-向上转型成员方法: 编译看左边，运行看右边
 * 
 * 通过instanceof关键字来判断某个对象是否属于某种数据类型（当前类或者父类）
 * */
public class Test {

	public static void main(String[] args) {
		//多态 向上转型
		Fu fu = new Zi();
		fu.show();
		//打印 1 ，而不是2
		System.out.println(fu.a);
		System.out.println(fu instanceof Fu);
		//多态 向下转型
		Zi zi = (Zi)fu;
		zi.show();
		//打印 2
		System.out.println(zi.a);
		System.out.println(zi instanceof Fu);
		System.out.println(zi instanceof Zi);
	}

}
