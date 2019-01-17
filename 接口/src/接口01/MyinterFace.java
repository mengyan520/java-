package 接口01;

/*
 * 1>使用interface代替了原来的class，其他步骤与定义类相同
 * 2>接口中的方法均为公共访问的抽象方法
 * 3>接口中无法定义普通的成员变量
 * 4.定义抽象方法:
 * public abstract固定写法,注意，public可以不写，默认也是公共，但是最好写上
 * public abstract void show1();
 * 5.接口中可以定义变量，但是变量必须有固定的修饰符修饰
 * public static final 所以接口中的变量也称之为常量，其值不能改变
 * */
public interface MyinterFace {
	//public static final在接口中可以省略不写（也可以选择性书写），但是不写，不代表没有，是默认的加上的
	public static final int a = 1;
   // public abstract 修饰符 同上，但是如果不写，类实现方法的时候也必须写public 
	public abstract void function();
}
