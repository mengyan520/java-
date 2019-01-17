import java.util.Random;
public class ArrDemo{
	public static void main(String[] args) {
		String[] names = {"张三","里斯","明月","沟渠"};
		for (int i = 0;i< names.length; i++) {
			System.out.println(names[i]);
		}
		int ran = new Random().nextInt(names.length);
		System.out.print("随机点名：");
		System.out.println(names[ran]);
	}
}