package dan.service;

import java.sql.SQLException;

import dan.dao.UserDao;
import dan.domain.User;

public class UserService {

	public User login(String username, String password) throws SQLException {
		UserDao dao = new UserDao();
		return dao.login(username,password);
	}

}
