package com.ssh2test1.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.hibtest1.entity.Test;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.TestBiz;

@SuppressWarnings("serial")
public class TestManageAction extends ActionSupport {

	private Test test;
	private TestBiz testBiz;
	Map<String, Object> request;
	Map<String, Object> session;

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public TestBiz getTestBiz() {
		return testBiz;
	}

	public void setTestBiz(TestBiz testBiz) {
		this.testBiz = testBiz;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@SuppressWarnings("unchecked")
	public String stateChoice() {
		Test condition = new Test();
		condition.setTstate(test.getTstate());
		List<Test> list = testBiz.testChoice(condition);
 
		if (list.size() > 0) {
			ActionContext.getContext().put("testlist", list);
			return "success";
		} else {
			return "fail";
		}
	}
}
