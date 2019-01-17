package 抽象类_具体案例;

public class Test {

	public static void main(String[] args) {
		JAVAEE j = new JAVAEE();
		j.setName("张三");
		j.setID("001");
		j.work();
		NetWork n = new NetWork();
		n.setName("李四");
		n.setID("002");
		n.work();
	}

}
