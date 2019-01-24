package dc_89_���߳�_�̳߳�;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * jdk1.5�Ժ�ʹ��
1.ʹ�ù����� Executors�еľ�̬���������̶߳���,ָ���̵߳ĸ���
2.static ExecutorService newFixedThreadPool(int ����) 
���ص���ExecutorService�ӿڵ�ʵ���� (�̳߳ض���)
3.�ӿ�ʵ�������,���÷���submit (Ruunable r) �ύ�߳�ִ������
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
//		�����̳߳�
		es.shutdown();
	}

}
