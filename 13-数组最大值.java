public class ArrDemo{
	public static void main(String[] args) {
		int arr[] = {4,5,6,3,2,32};
		int max = arr[0];
		for (int i=0;i<arr.length ;i++ ) {
			if (max<arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
	}
}