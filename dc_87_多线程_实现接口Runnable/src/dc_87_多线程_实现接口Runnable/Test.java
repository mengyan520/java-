package dc_87_���߳�_ʵ�ֽӿ�Runnable;

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
