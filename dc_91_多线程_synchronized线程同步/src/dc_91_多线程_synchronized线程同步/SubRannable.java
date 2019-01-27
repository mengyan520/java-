package dc_91_多线程_synchronized线程同步;

public class SubRannable implements Runnable {
	private int count = 100;
	private Object obj = new Object();

	@Override
	public void run() {
//		while (true) {
//			//任意对象,同步锁对象
//			synchronized (obj) {
//				if (count > 0) {
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "--" + count--);
//				}
//			}
//		}
		while (true) {
			payTicket();
		}
	}

	// 同步锁方法
	public synchronized void payTicket() {
		if (count > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--" + count--);
		}

	}

}
