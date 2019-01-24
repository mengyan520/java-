package dc_87_多线程_实现接口Runnable;

public class SubRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("SubRunnable---"+i);
			
		}
	}

}
