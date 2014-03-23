package com.ssh2test1.biz;

import java.util.List;
import com.hibtest1.entity.Users;
import com.ssh2test1.dao.UserDAO;

public class UserBizImp1 implements UserBiz {
	UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public List login(Users condition) { // 用户登录
		return userDAO.search(condition);
	}

	public void register(Users user) { // 注册用户
		// TODO Auto-generated method stub
		userDAO.register(user);

	}

}
