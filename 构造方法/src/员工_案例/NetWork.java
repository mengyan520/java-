package 员工_案例;

public class NetWork extends Maintain {

	public NetWork(String name, String iD) {
		super(name, iD);
	}

	public void work() {
		System.out.println(this.getName()+this.getID()+"在测试网络是否畅通");
	}

}
