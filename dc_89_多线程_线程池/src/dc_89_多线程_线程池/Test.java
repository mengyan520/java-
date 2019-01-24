package dc_89_多线程_线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * jdk1.5以后使用
1.使用工厂类 Executors中的静态方法创建线程对象,指定线程的个数
2.static ExecutorService newFixedThreadPool(int 个数) 
返回的是ExecutorService接口的实现类 (线程池对象)
3.接口实现类对象,调用方法submit (Ruunable r) 提交线程执行任务
 */
public class Test {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("sub1--" + i);
				}
			}
		});
		es.submit(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("sub2--" + i);
				}
			}
		});
//		销毁线程池
		es.shutdown();
	}

}
