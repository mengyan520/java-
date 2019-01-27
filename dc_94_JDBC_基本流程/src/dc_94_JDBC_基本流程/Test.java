package dc_94_JDBC_基本流程;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//获得连接
		String url = "jdbc:mysql://localhost:3306/mybase?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
		String username="root";
		String password="123456";
		Connection con = DriverManager.getConnection(url, username, password);
		//获得语句执行平台, 通过数据库连接对象,获取到SQL语句的执行者对象
		//con对象调用方法   Statement createStatement() 获取Statement对象,将SQL语句发送到数据库
		Statement stat = con.createStatement();
		//执行sql语句,int executeUpdate(String sql)  执行数据库中的SQL语句, insert delete update
		//插入数据
		int row = stat.executeUpdate
				("INSERT INTO sort(sname,sprice,sdesc) VALUES('汽车用品',50000,'疯狂涨价')");
		System.out.println(row);
		//查询数据,ResultSet接口方法 boolean next() 返回true,有结果集,返回false没有结果集
		ResultSet rs = stat.executeQuery("select * from sort");
		while (rs.next()) {
			//获取每列数据,使用是ResultSet接口的方法 getXX方法参数中,建议写String列名
			System.out.println(rs.getInt("sid")+"   "+rs.getString("sname")+
					"   "+rs.getDouble("sprice")+"   "+rs.getString("sdesc"));
		}
		//6.释放资源  一堆close()
		rs.close();
		stat.close();
		con.close();
	}

}
