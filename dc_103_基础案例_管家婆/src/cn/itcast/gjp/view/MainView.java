package cn.itcast.gjp.view;

import java.util.List;
import java.util.Scanner;

//视图层
/*
 *  run方法
 *  实现界面效果
 *  接收用户的输入
 *  根据数据,调用不同的功能方法
 */
import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();

	public void run() {
		// 创建Scanner类对象,反复键盘输入
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			String chooseString = sc.next();
			switch (chooseString) {
			case "1":
				addZhangWu();
				break;
			case "2":
				editZhangWu();
				break;
			case "3":
				deleteZhangWu();
				break;
			case "4":
				selectZhangWu();
				break;
			case "5":
				System.out.println("再见！");
				System.exit(0);
				break;

			default:
				System.out.println("输入错误！");
				break;
			}
		}
	}

	public void selectZhangWu() {
		System.out.println("1. 查询所有    2. 条件查询");
		Scanner sc = new Scanner(System.in);
		String selectChooser = sc.next();
		// 判断根据用户的选择,调用不同的功能
		switch (selectChooser) {
		case "1":
			// 选择的查询所有,调用查询所有的方法
			selectAll();
			break;
		case "2":
			// 选的条件查询,调用带有查询条件的方法
			select();
			break;
		default:
			System.out.println("输入错误！");
			break;
		}
	}

	public void addZhangWu() {
		System.out.println("选择的添加账务功能，请输入以下内容");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入分类名称");
		String flname = sc.next();
		System.out.println("输入金额");
		String money = sc.next();
		System.out.println("输入账户");
		String zhanghu = sc.next();
		System.out.println("输入日期：格式XXXX-XX-xx");
		String createtime = sc.next();
		System.out.println("输入具体描述");
		String description = sc.next();
		// 将接收到的数据，调用controller层的方法，传递参数，实现数据添加
		ZhangWu zw = new ZhangWu(0, flname, money, zhanghu, createtime, description);
		controller.addZhangWu(zw);

	}

	public void editZhangWu() {
		// 调用查询所有账务数据的功能，显示出来
		// 看到所有数据，从中选择一项，进行修改
		selectAll();
		System.out.println("选择的是编辑功能，请输入数据");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入ID");
		int zwid = sc.nextInt();
		System.out.println("输入分类名称");
		String flname = sc.next();
		System.out.println("输入金额");
		String money = sc.next();
		System.out.println("输入账户");
		String zhanghu = sc.next();
		System.out.println("输入日期：格式XXXX-XX-xx");
		String createtime = sc.next();
		System.out.println("输入具体描述");
		String description = sc.next();
		// 将用户输入的数据，封装到ZhangWu对象中
		// 用户输入的ID，必须封装到到对象中
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
		// 调用controller层中的方法，实现编辑账务
		controller.editZhangWu(zw);
	}

	public void deleteZhangWu() {
		// 调用查询所有账务数据的功能，显示出来
		// 看到所有数据，从中选择一项，进行修改
		selectAll();
		System.out.println("选择的是删除功能，请输入序号即可");
		int zwid = new Scanner(System.in).nextInt();
		// 调用控制层方法，传递主键id即可
		controller.deleteZhangWu(zwid);
	}

	/*
	 * 定义方法,实现查询所有的账务数据
	 */
	public void selectAll() {
		List<ZhangWu> list = controller.selectAll();
		print(list);
	}

	/*
	 * 定义方法,实现条件查询账务数据 提供用户的输入日期,开始日期结束日期 就2个日期,传递到controller层
	 * 调用controller的方法,传递2个日期参数 获取到controller查询的结果集,打印出来
	 */
	public void select() {
		System.out.println("选择条件查询,输入日期格式XXXX-XX-XX");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入开始日期:");
		String startDate = sc.nextLine();
		System.out.print("请输入结果日期:");
		String endDate = sc.nextLine();
		// 调用controller层的方法,传递日期,获取查询结果集
		List<ZhangWu> list = controller.select(startDate, endDate);
		print(list);
	}

	// 输出账务数据方法,接收List集合,遍历集合,输出表格
	private void print(List<ZhangWu> list) {
		if (list.size() <= 0) {
			System.out.println("查询的数据为空");
			return;
		}
		// 输出表头
		System.out.println("ID\t\t类别\t\t账户\t\t金额\t\t时间\t\t说明");
		// 遍历集合,结果输出控制台
		for (ZhangWu zw : list) {
			System.out.println(zw.getZwid() + "\t\t" + zw.getFlname() + "\t\t" + zw.getZhanghu() + "\t\t"
					+ zw.getMoney() + "\t\t" + zw.getCreatetime() + "\t" + zw.getDescription());
		}
	}
}