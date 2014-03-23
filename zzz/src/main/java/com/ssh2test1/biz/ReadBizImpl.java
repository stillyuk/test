package com.ssh2test1.biz;

import java.util.List;

import com.hibtest1.entity.Read;
import com.ssh2test1.dao.ReadDAO;

public class ReadBizImpl implements ReadBiz {
	ReadDAO readDAO;

	public void setReadDAO(ReadDAO readDAO) {
		this.readDAO = readDAO;
	}

	public List ReadChoice(String rstate) {
		return readDAO.search(rstate);
	}
	public List Read(){
		return readDAO.searchAll();
	}
}
