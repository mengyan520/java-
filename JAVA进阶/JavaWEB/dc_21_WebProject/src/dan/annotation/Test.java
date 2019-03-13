package dan.annotation;

public class Test {

	public static void main(String[] args) {

	}
	
	@Cutstom("zhangsan")
	public void show() {
		System.out.println("show-running");
	}
	@MyTest
	public void test1() {
		System.out.println("test1-running");
	}
}
