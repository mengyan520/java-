package dc_90_多线程_Callable接口实现多线程;

import java.util.concurrent.Callable;

public class GetSumCallable implements Callable<Integer> {
	private int a = 0;

	public GetSumCallable(int a) {
		this.a = a;
	}

	@Override
	public Integer call() {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
