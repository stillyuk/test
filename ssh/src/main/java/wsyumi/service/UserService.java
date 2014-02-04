package  wsyumi.service;

import wsyumi.domain.User;

public interface UserService {
	boolean login(User user);
	boolean registe(User user);
}
