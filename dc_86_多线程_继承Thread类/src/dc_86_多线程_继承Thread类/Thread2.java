package dc_86_���߳�_�̳�Thread��;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+"h");
		}
		System.out.println("currentThread:"+Thread.currentThread());
	}
}
