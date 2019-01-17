package 继承练习;
/*
 * 1.子类会自动拥有父类所有非private修饰的属性和方法
 * 
 * 2.在Java中，类只支持单继承
 * 
 * 3.子类优先父类
 * */
public class Test {

	public static void main(String[] args) {
		Develop dev = new Develop();
		dev.name = "研发";
		dev.work();
	}

}
