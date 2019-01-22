package dc_57_自定义异常;

public class ExceptionDemp {
	public static void main(String[] args) {
//		try {
//			int avg = getAvg(50,60,-70);
//			System.out.println(avg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		int avg = getAvg(50,60,-70);
		System.out.println(avg);
	}
	/*
	 * 传递成绩，计算成绩平均数
	 * 成绩不能为负数，检测到负数，需要抛出异常
	 * */
	public static int getAvg(int...source) {
		int sum = 0;
		for (int i : source) {
			if (i<0) {
				throw new FuShuException("成绩错误:"+i);
			}
			sum += i;
		}
		return sum/source.length;
	}
}
