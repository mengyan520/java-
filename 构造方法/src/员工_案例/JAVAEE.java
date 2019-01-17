package 员工_案例;

public class JAVAEE extends Develop {
	public JAVAEE(String name, String iD) {
		super(name, iD);
	}

	public void work() {
		System.out.println(this.getName()+this.getID()+"在开发java程序");
	}

}
