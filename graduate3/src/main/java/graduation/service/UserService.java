package graduation.service;

import graduation.dao.UserDao;
import graduation.domain.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangyukun
 * @since 2014-03-12 13:00
 */
@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public List<User> query(User user) {
		return userDao.query(user);
	}

	public void add(User user) {
		userDao.add(user);
	}
}
