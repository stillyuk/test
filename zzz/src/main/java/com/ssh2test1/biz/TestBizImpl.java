package com.ssh2test1.biz;

import java.util.List;

import com.hibtest1.entity.Test;

import com.ssh2test1.dao.TestDAO;


public class TestBizImpl implements TestBiz{
	TestDAO testDAO;
	public void setTestDAO( TestDAO  testDAO){
		this.testDAO=testDAO;
	}
	public List testChoice(Test condition){   //用户选择练习等级
		return testDAO.search(condition);
	}
	
}
