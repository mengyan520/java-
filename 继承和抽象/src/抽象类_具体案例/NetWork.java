package 抽象类_具体案例;

public class NetWork extends Maintain {

	public void work() {
		System.out.println(this.getName()+this.getID()+"在测试网络是否畅通");
	}

}
