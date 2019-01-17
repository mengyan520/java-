package 接口01;

/*
 * 类实现接口，此时该类需要重写该抽象方法，完成具体的逻辑
 * */
public class MyInterFaceImp implements MyinterFace {

	public void function() {
		//实现类必须重写所有接口的抽象方法，否则还是抽象类
		System.out.println("实现接口抽象方法");
	}
}
