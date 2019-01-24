package dc_86_多线程_继承Thread类;

/*
 * 将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法,F创建对象
 * 子类对象调用方法start()
 * */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		Thread1 thread1 = new Thread1();
		thread1.setName("我是线程1");
		thread1.start();
		Thread2 thread2 = new Thread2();
		thread2.setName("我是线程2");
		thread2.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("run" + "----" + i);
		}
		// 获取线程名字
		System.out.println("thread1-name:" + thread1.getName());
		System.out.println("thread2-name:" + thread2.getName());
		// 获取当前运行的线程
		System.out.println("currentThread:" + Thread.currentThread());
		//睡眠500ms,500ms已到并且cpu切换到该线程继续向下执行，写到哪里，哪个线程就会等待
		Thread.sleep(500);
		System.out.println("哈哈");
	}
}
