import java.util.Random;
public class RandomDemo{
	public static void main(String[] args) {
		Random rn = new Random();
		//指定生成为0-9的一个数，不指定，随机产生
		int number = rn.nextInt(10);
		System.out.println(number);
		//随机[0,1)产生
		double bnumber= rn.nextDouble();
		System.out.println(bnumber);
	}
}

