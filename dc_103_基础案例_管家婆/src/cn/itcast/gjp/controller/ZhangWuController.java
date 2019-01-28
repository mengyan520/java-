package cn.itcast.gjp.controller;
//控制器层，接受view数据，传递给service层

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();

	public void addZhangWu(ZhangWu zw) {
		service.addZhangWu(zw);
	}

	public void editZhangWu(ZhangWu zw) {
		service.editZhangWu(zw);
	}
	public void deleteZhangWu(int zwid) {
		service.deleteZhangWu(zwid);
	}
	public List<ZhangWu> selectAll() {
		return service.selectAll();
	}

	public List<ZhangWu> select(String startDate, String endDate) {
		return service.select(startDate, endDate);
	}
}
