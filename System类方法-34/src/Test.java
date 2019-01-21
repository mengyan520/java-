
public class Test {

	public static void main(String[] args) {
		// 获取当前时间戳
		System.out.println(System.currentTimeMillis());
		// 垃圾回收机制，释放对象
		/*
		 * JVM在内存中,收取对象的垃圾 当没有更多引用指向该对象时,会自动调用垃圾回收机制回收堆中的对象 同时调用回收对象所属类的finalize方法()
		 */
		new Person();
		new Person();
		new Person();
		new Person();
		System.gc();
		// 获取当前操作系统的属性:例如操作系统名称
		System.out.println(System.getProperties());

		arrCopy();

		// 退出,所有程序全停止
		System.exit(0);
	}

	public static void arrCopy() {
		/*
		 * 复制数组 格式：arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		 * Object src, 要复制的源数组 
		 * int srcPos, 数组源的起始索引 
		 * Object dest,复制后的目标数组 
		 * int destPos,目标数组起始索引 
		 * int length, 复制几个
		 */
		int[] src = {11,22,33,44,55,66};
		int[] desc = {77,88,99,0};
		//将src数组的1位置开始(包含1位置)的两个元素,拷贝到desc的1,2位置上（替换）
		System.arraycopy(src, 1, desc, 1, 2);
		for (int i = 0; i < desc.length; i++) {
			System.out.println(desc[i]);
		}
	}

}
