package com.ssh2test1.dao;

import java.util.List;
import com.hibtest1.entity.Users;

public interface UserDAO {
	public List search(Users condition);
	public void register(Users user);

}
