

public class Test {

	public static void main(String[] args) {
		SubRannable subRannable = new SubRannable();
		Thread thread1 = new Thread(subRannable);
		Thread thread2 = new Thread(subRannable);
		Thread thread3 = new Thread(subRannable);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
