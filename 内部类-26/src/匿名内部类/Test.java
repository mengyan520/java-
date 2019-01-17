package 匿名内部类;
/*
 * 局部内部类的一种
 * 把定义实现类、重写抽象方法、建立实现对象，合为一步完成
 * 格式：
 * new 接口或者父类(){
	重写抽象方法
   };
 * */
public class Test {
	public static void main(String[] args) {
		// 接口
		new Smoking() {

			@Override
			public void smoking() {
				System.out.println("正在吸烟");
			}
		}.smoking();
		// 类
		Animal animal = new Animal() {

			@Override
			public void eat() {
				System.out.println("正在吃饭");
			}

			public void sleep() {
				System.out.println("正在睡觉");
			}
		};
		animal.eat();
		animal.sleep();
	}
}
