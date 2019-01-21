package 面向对象基础;

public class Car {
	// 定义成员变量
	String color;// 颜色
	int count = 2;// 轮胎个数,设置默认值 2

	// 定义成员方法
	public void run() {
		System.out.println(color + count + "轮胎" + "汽车在跑");
	}

}
