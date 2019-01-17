import java.util.Scanner;
public class SwitchDemo{
	public static void main(String[] args) {
		int a =  new Scanner(System.in).nextInt();
		switch(a){
			case 1:
		    System.out.println("哈哈");
		    break;
		    case 2:
		    System.out.println("嘻嘻");
		    break;
		    case 10:
		    System.out.println("正确");
		    break;
		    default:
		    System.out.println("哼哼");
		    break;
		}
	}
}