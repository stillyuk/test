package com.ssh2test1.dao;

import java.util.List;

import com.hibtest1.entity.Read;

public interface ReadDAO {
	public List search(String rstate);

	public List searchAll();

}
