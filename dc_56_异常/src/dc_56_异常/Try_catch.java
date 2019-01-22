package dc_56_异常;

public class Try_catch {

	public static void main(String[] args) {
		System.out.println(getArray(null));
	}
	public static int getArray(int[] arr) {
		int num = 0;
		try {
			num = arr[arr.length-1];
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("最终执行");
		}
		return num;
	}
	
}
