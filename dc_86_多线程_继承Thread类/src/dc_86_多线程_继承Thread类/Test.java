package dc_86_���߳�_�̳�Thread��;

/*
 * ��������Ϊ Thread �����ࡣ������Ӧ��д Thread ��� run ����,F��������
 * ���������÷���start()
 * */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		Thread1 thread1 = new Thread1();
		thread1.setName("�����߳�1");
		thread1.start();
		Thread2 thread2 = new Thread2();
		thread2.setName("�����߳�2");
		thread2.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("run" + "----" + i);
		}
		// ��ȡ�߳�����
		System.out.println("thread1-name:" + thread1.getName());
		System.out.println("thread2-name:" + thread2.getName());
		// ��ȡ��ǰ���е��߳�
		System.out.println("currentThread:" + Thread.currentThread());
		//˯��500ms,500ms�ѵ�����cpu�л������̼߳�������ִ�У�д������ĸ��߳̾ͻ�ȴ�
		Thread.sleep(500);
		System.out.println("����");
	}
}
