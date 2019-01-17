package 多态_02_案例;

public class Keyboard implements USB {

	@Override
	public void open() {
		System.out.println("打开键盘");
	}

	@Override
	public void close() {
		System.out.println("打开键盘");
	}

}
