package dc_87_多线程_实现接口Runnable;

public class Test {

	public static void main(String[] args) {
		SubRunnable subRunnable = new SubRunnable();
		Thread thread = new Thread(subRunnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main---"+i);
			
		}
	}

}
