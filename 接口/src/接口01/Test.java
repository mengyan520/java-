package 接口01;

public class Test {
	public static void main(String[] args) {
		MyInterFaceImp imp = new MyInterFaceImp();
		imp.function();
		//调用接口常量,常量被静态修饰,可以被类名直接调用, 被接口的名字直接调用
		System.out.println(MyInterFaceImp.a);
		System.out.println(MyinterFace.a);
	}
}
