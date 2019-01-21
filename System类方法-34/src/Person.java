
public class Person {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("垃圾回收了");
	}
}
