package dc_90_多线程_Callable接口实现多线程;

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable<String> {
	@Override
	public String call() throws Exception {
		return "abc";
	}
}
