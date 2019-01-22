package dc_56_异常;
/*
 * 异常中的关键字 throw,用来抛出一个指定的异常对象（类似assert）
 * 格式：
 * throw new 异常类名(参数);
 *throws用来声明异常
 * */
public class Test {

	public static void main(String[] args) throws  Exception {
		int[] arr = {};
		int in = getArray(null);
	}
	//如果方法内通过throw抛出了编译时异常，而没有捕获处理，那么必须通过throws进行声明，让调用者去处理
	public static int getArray(int[] arr) throws Exception{
		if (arr == null) {
			throw new Exception("不能传空数组");
		}
		if (arr.length == 0) {
			throw new Exception("数组长度不能0");
		}
		return arr[arr.length-1];
	}
}
