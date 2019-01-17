public class MethodDemo{
	public static void main(String[] args) {
		// 在同一个类中，方法名相同，参数列表不同(个数和类型、顺序),与返回值类型无关,与参数变量名无关,与修饰符无关
		System.out.println(getSum(2,5));
		System.out.println(getSum(2,5,8));
		System.out.println(getSum(2.5,5.6));
	}
	public static int getSum(int a,int b){
		return a+b;
	}
	public static int getSum(int a,int b, int c){
		return a+b+c;
	}
	public static double getSum(double a,double b){
		return a+b;
	}
}