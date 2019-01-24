package dc_88_多线程_匿名内部类实现多线程;

public class Test {

	public static void main(String[] args) {
		// 接口方式
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("sub1---" + i);

				}
			}
		};
		new Thread(runnable).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("sub2---" + i);

				}
			}
		}).start();
		// 继承方式
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("sub3---" + i);

				}
			};
		}.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main---" + i);
		}

	}

}
