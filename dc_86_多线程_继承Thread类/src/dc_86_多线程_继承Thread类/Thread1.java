package dc_86_���߳�_�̳�Thread��;

public class Thread1 extends Thread {
	public Thread1() {
		// TODO Auto-generated constructor stub
		super("����");
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("currentThread:"+Thread.currentThread());
	}
	
}
