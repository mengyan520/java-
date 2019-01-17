package 多态_02_案例;

public class Mouse implements USB {

	@Override
	public void open() {
		System.out.println("打开鼠标");
	}

	@Override
	public void close() {
		System.out.println("关闭鼠标");
	}

}
