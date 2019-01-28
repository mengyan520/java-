package cn.itcast.gjp.service;
//业务类

//

import java.util.List;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();

	public void addZhangWu(ZhangWu zw) {
		dao.addZhangWu(zw);
	}

	public void editZhangWu(ZhangWu zw) {
		dao.editZhangWu(zw);
	}
	public void deleteZhangWu(int zwid) {
		dao.deleteZhangWu(zwid);
	}
	public List<ZhangWu> selectAll() {
		return dao.selectAll();
	}

	public List<ZhangWu> select(String startDate, String endDate) {
		return dao.select(startDate, endDate);
	}
}
