public class MethodDemo{
	public static void main(String[] args) {
		action1();
		action2(2,5);
		System.out.println(action3());
		System.out.println(action4(10,20));
	}
	public static void action1(){
		System.out.println("无参无返回值");
	}
	public static void action2(int a,int b){
		System.out.print("有参无返回值:");
		System.out.println(a+b);

	}
	public static int action3(){
		System.out.print("无参有返回值:");
		return 3+5;
	}
	public static int action4(int a, int b){
		System.out.print("有参有返回值:");
		return a+b;
	}
}