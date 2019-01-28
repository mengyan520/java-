package cn.itcast.gjp.domain;

public class ZhangWu {

	private int zwid;
	private String flname;
	private String money;
	private String zhanghu;
	private String createtime;
	private String description;

	public ZhangWu(int zwid, String flname, String money, String zhanghu, String createtime, String description) {
		super();
		this.zwid = zwid;
		this.flname = flname;
		this.money = money;
		this.zhanghu = zhanghu;
		this.createtime = createtime;
		this.description = description;
	}

	public ZhangWu() {
		super();
	}

	public String toString() {
		return "ZhangWu [zwid=" + zwid + ", flname=" + flname + ", money=" + money + ", zhanghu=" + zhanghu
				+ ", createtime=" + createtime + ", description=" + description + "]";
	}

	public int getZwid() {
		return zwid;
	}

	public void setZwid(int zwid) {
		this.zwid = zwid;
	}

	public String getFlname() {
		return flname;
	}

	public void setFlname(String flname) {
		this.flname = flname;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getZhanghu() {
		return zhanghu;
	}

	public void setZhanghu(String zhanghu) {
		this.zhanghu = zhanghu;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
