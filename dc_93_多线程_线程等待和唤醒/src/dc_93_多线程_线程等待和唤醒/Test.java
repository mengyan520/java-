package dc_93_多线程_线程等待和唤醒;

//等待和唤醒必须锁对象调用
public class Test {

	public static void main(String[] args) {
		Resource resource = new Resource();
		Thread thread1 = new Thread(new Input(resource));
		Thread thread2 = new Thread(new Output(resource));
		thread1.start();
		thread2.start();
	}

}
