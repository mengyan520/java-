package dc_88_���߳�_�����ڲ���ʵ�ֶ��߳�;

public class Test {

	public static void main(String[] args) {
		// �ӿڷ�ʽ
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
		// �̳з�ʽ
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
