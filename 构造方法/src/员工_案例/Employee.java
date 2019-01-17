package 员工_案例;
/*
 * 员工抽象类
 * 定义姓名、员工好、抽象工作方法
 * */
public abstract class Employee {
	private String name;
	private String ID;
	public Employee(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	//抽象工作方法
	public abstract void work();
}
