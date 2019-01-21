import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//数组转化字符串
		int[] nums = {1,2,60,5,6};
		System.out.println(Arrays.toString(nums));
		//数组升序排列
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		//返回查找的元素的索引 (二分查找,前提，数组是有序排列的)
		//元素不存在, 返回的是  (-插入点-1)
		int num = Arrays.binarySearch(nums, 5);
		System.out.println(num);
		int num2 = Arrays.binarySearch(nums, 3);
		System.out.println(num2);
	}

}
