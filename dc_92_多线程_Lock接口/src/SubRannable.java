import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SubRannable implements Runnable {
	private int count = 100;
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while (true) {
			lock.lock();
			if (count > 0) {
				try {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + "--" + count--);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
		}

	}
}
