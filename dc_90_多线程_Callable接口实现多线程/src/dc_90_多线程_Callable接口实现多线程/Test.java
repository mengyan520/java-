package dc_90_���߳�_Callable�ӿ�ʵ�ֶ��߳�;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		// �ύ�߳�����ķ���submit�������� Future�ӿڵ�ʵ����
		Future<String> fu = ex.submit(new ThreadPoolCallable());
		System.out.println(fu.get());
		// �첽����
		// �����߳�,1���̼߳���1+100,��һ���̼߳���1+200�ĺ�
		ExecutorService ex2 = Executors.newFixedThreadPool(2);
		System.out.println(ex2.submit(new GetSumCallable(100)).get());
		System.out.println(ex2.submit(new GetSumCallable(200)).get());
	}

}
