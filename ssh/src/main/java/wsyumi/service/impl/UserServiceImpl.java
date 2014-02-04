package wsyumi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import wsyumi.dao.UserDao;
import wsyumi.domain.User;
import wsyumi.service.UserService;

/**
 * @author jiangyukun
 *
 */
@Component
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	@Autowired
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see wsyumi.service.UserService#login(wsyumi.domain.User)
	 */
	public boolean login(User user) {
		try {
			String sql = "insert into user(userid, username, password) values('11', '1', '1')";
			userDao.transaction(sql);
			userDao.transaction("xxx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see wsyumi.service.UserService#registe(wsyumi.domain.User)
	 */
	public boolean registe(User user) {
		return userDao.registe(user);
	}
}
