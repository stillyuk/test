package com.ssh2test1.biz;

import java.util.List;
import com.hibtest1.entity.Users;

public interface UserBiz {
	public List login(Users condition);
	public void register(Users user);

}
