package 多态_02_案例;

public class Computer {
	public void useUsb(USB usb) {
		usb.open();
		usb.close();
	}
}
