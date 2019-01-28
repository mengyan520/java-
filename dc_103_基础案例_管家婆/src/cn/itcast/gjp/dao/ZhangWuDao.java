package cn.itcast.gjp.dao;
//实现对账务表的增删改查操作

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.tools.JDBCUtils;

public class ZhangWuDao {
	private QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

	public void addZhangWu(ZhangWu zw) {
		String sql = "INSERT INTO gjp_zhangwu (flname,money,zhanghu,createtime,description) VALUES(?,?,?,?,?)";
		Object[] params = { zw.getFlname(), zw.getMoney(), zw.getZhanghu(), zw.getCreatetime(), zw.getDescription() };
		try {
			int success = queryRunner.update(sql, params);
			if (success > 0) {
				System.out.println("添加成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("添加失败");
		}
	}

	public void editZhangWu(ZhangWu zw) {
		try {
			// 更新数据的SQL
			String sql = "UPDATE gjp_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
			// 定义对象数组，封装所有数据
			Object[] params = { zw.getFlname(), zw.getMoney(), zw.getZhanghu(), zw.getCreatetime(), zw.getDescription(),
					zw.getZwid() };
			// 调用qr对象方法update执行更新
			int success = queryRunner.update(sql, params);
			if (success > 0) {
				System.out.println("编辑成功");
			}
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("编辑账务失败");
		}
	}

	public void deleteZhangWu(int zwid) {
		try {
			// 更新数据的SQL
			String sql = "delete from gjp_zhangwu WHERE zwid=?";
			// 定义对象数组，封装所有数据
			Object[] params = { zwid};
			// 调用qr对象方法update执行更新
			int success = queryRunner.update(sql, params);
			if (success > 0) {
				System.out.println("删除成功");
			}
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("删除账务失败");
		}
	}

	public List<ZhangWu> selectAll() {
		String sqlString = "select * from gjp_zhangwu";
		try {
			List<ZhangWu> list = queryRunner.query(sqlString, new BeanListHandler<ZhangWu>(ZhangWu.class));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("查询失败");
		}
	}

	public List<ZhangWu> select(String startDate, String endDate) {
		String sqlString = "select * from gjp_zhangwu where createtime between ? and ?";
		try {
			Object[] objects = { startDate, endDate };
			List<ZhangWu> list = queryRunner.query(sqlString, new BeanListHandler<ZhangWu>(ZhangWu.class), objects);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("查询失败");
		}
	}
}
