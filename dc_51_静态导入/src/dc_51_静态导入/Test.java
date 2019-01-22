package dc_51_静态导入;
/*
1.jdk1.5
2.减少开发代码量
3.标准的写法,导入包的时候才能使用
import static java.lang.System.out;最末尾,必须是一个静态成员
注意：
如果本类中有和静态导入的同名方法会优先使用本类的
如果还想使用静态导入的,依然需要类名来调用
 * */
import static java.lang.System.out;
import static java.util.Arrays.sort;
public class Test {
	public static void main(String[] args) {
		out.println("hello");
		int[] arr = {1,4,2};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
