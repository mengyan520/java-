//导包
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args) {
		//创建sc对象
		Scanner sc = new Scanner(System.in);
		//获取输入的字符串
		System.out.println("请输入字符串：");
		String content = sc.next();
		System.out.println(content);
		//获取输入的数字
		System.out.println("请输入整数：");
		int number = sc.nextInt();
		System.out.println(number);
	}
}