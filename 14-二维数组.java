public class ArrDemo{
	public static void main(String[] args) {
		System.out.println("第一种方式");
		int arr[][] = new int[2][4];
		int arr1[] = {1,2};
		int arr2[] = {5,6,7,8};
		arr[0] = arr1;
		arr[1] = arr2;
		// 遍历
		for (int i = 0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("第二种方式:不推荐");
		int arr3[][] = new int[2][];
		int arr31[] =  {1,2,4,55,43};
		int arr32[] =  {5,6,7,8};
		arr3[0] = arr31;
		arr3[1] = arr32;
		// 遍历
		for (int i = 0; i<arr3.length; i++) {
			for (int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		System.out.println("第三种方式");
		int arr4[][] = {{4,5},{3,4,5,6}};
		// 遍历
		for (int i = 0; i<arr4.length; i++) {
			for (int j=0; j<arr4[i].length; j++) {
				System.out.println(arr4[i][j]);
			}
		}
	}
}