package dan.service;

import java.sql.SQLException;

import dan.dao.TransferDao;
import dan.utils.DataSourceUtils;

public class TransferService {

	public boolean transfer(String out, String in, double money) {

		TransferDao dao = new TransferDao();

		boolean isTranferSuccess = true;
		// Connection conn = null;
		try {

			// 开启事务
			// conn = DataSourceUtils.getConnection();
			// conn.setAutoCommit(false);

			// 开启事务
			DataSourceUtils.startTransaction();

			// 转出钱的方法
			dao.out(out, money);
//			 int i = 1/0;
			// 转入钱的方法
			dao.in(in, money);

		} catch (Exception e) {
			isTranferSuccess = false;
			// 回滚事务
			try {
				DataSourceUtils.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				//交并且 关闭资源及从ThreadLocall中释放,无论有没有回滚
				DataSourceUtils.commitAndRelease();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return isTranferSuccess;
	}

}
