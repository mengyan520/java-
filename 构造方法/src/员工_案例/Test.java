package 员工_案例;

public class Test {

	public static void main(String[] args) {
		JAVAEE javaee = new JAVAEE("张三", "001");
		javaee.work();
		NetWork netWork = new NetWork("李四", "002");
		netWork.work();
	}

}
