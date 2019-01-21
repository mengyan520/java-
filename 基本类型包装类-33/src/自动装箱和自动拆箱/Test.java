package 自动装箱和自动拆箱;
/*
 * jdk1.5之后出现
 * 自动装箱：基本类型自动转化引用类型
 * 自动拆箱：引用类型自动转化为基本类型
 * 注意：基本类型和引用类型不能直接计算，自动装拆箱，就简便了计算
 * 注意：任何引用类型都是可以为 null，所有当为null的时候使用自动会发生空指针异常
 */
public class Test {

	public static void main(String[] args) {
		//自动装箱
		Integer a = 500;//等价于 new Integer("500");
		System.out.println(a);
		//自动拆箱
		a = a+100;//a+100等价于a.intValue()+100
		System.out.println(a);
		//空指针异常 java.lang.NullPointerException
//		Integer integer = null;
//		int num = integer+100;
		//比较地址 ,注意 当小于等于127时，地址一样，大于127的时候地址不一样
		//数据在byte(-128~127)范围内,JVM不会从新new对象
		System.out.println("=========");
		Integer integer1 = 127;
		Integer integer2 = 127;
		System.out.println(integer1 == integer2);//true
		System.out.println(integer1.equals(integer2));//true
		System.out.println("=========");
		Integer integer3 = 128;
		Integer integer4 = 128;
		System.out.println(integer3 == integer4);//false
		System.out.println(integer3.equals(integer4));//true
	}

}
