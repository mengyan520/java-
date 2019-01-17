public class ArrDemo{
	public static void main(String[] args) {
		//定义int类型的数组,指定存放4个元素，以后不可更改
		int[] numberArr = new int[4];
		numberArr[0] = 1;
		numberArr[1] = 2;
		numberArr[2] = 3;
		numberArr[3] = 4;
		System.out.print("数组长度：");
		System.out.println(numberArr.length);
		for(int i = 0;i<numberArr.length;i++){
			System.out.println(numberArr[i]);
		}
		String[] strArr = {"张三","李四"};
		for (String str : strArr) {
			System.out.println(str);
		}
		//数组静态初始化,注意：后面[]不能写任何数据,一旦写了，有安全风险问题，后面定义的数组长度，跟[]对不上，所以禁止写了
		System.out.println("静态初始化：");
		int[] arr2 = new int[] {1,2,3,4};
		System.out.println(arr2[2]);
		// 直接赋值，推荐使用
		System.out.println("直接赋值：");
		String[] arr3 = {"哈哈","嘻嘻","哼哼"};
		arr3[2] = "哎呀";
		System.out.println(arr3[2]);
		//数组越界 java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(arr3[6]);
		//数组空指针 java.lang.NullPointerException
		arr3 = null;//数组不指向任何地址了，不保存任何数据了,数组置为null，之后，不可再次赋值
		System.out.println(arr3);
	}
}