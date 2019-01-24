package dc_90_多线程_Callable接口实现多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		// 提交线程任务的方法submit方法返回 Future接口的实现类
		Future<String> fu = ex.submit(new ThreadPoolCallable());
		System.out.println(fu.get());
		// 异步计算
		// 两个线程,1个线程计算1+100,另一个线程计算1+200的和
		ExecutorService ex2 = Executors.newFixedThreadPool(2);
		System.out.println(ex2.submit(new GetSumCallable(100)).get());
		System.out.println(ex2.submit(new GetSumCallable(200)).get());
	}

}
