package 多态_02_案例;
// 向上转型
public class Test {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.useUsb(new Mouse());
		computer.useUsb(new Keyboard());

	}

}
