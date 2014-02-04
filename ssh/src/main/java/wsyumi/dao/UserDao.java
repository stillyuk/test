package  wsyumi.dao;

import wsyumi.domain.User;

public interface UserDao {
	boolean login(User user);
	boolean registe(User user);
	boolean transaction(String sql) throws Exception;
}
