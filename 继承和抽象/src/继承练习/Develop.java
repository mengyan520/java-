package 继承练习;
/*
 *定义研发员工类，继承自员工类
 * */
public class Develop extends Employee {
	// 重写父类方法,前提：子类方法的权限>=父类的方法的权限
	@Override
	public void work() {
		//调用父类方法
//		super.work();
		System.out.println(name+"努力的"+"在工作");
	}
}
