package com.ssh2test1.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.hibtest1.entity.Question;
import com.hibtest1.entity.Read;
import com.hibtest1.entity.Test;
import com.opensymphony.xwork2.ActionSupport;

import com.ssh2test1.biz.ReadBiz;

public class ReadManageAction extends ActionSupport implements RequestAware,
SessionAware {
	private Read read;
	private ReadBiz readBiz;
	Map<String, Object> request;
	Map<String, Object> session;
	private String rstate;
	public String getRstate() {
		return rstate;
	}
	public void setRstate(String rstate) {
		this.rstate = rstate;
	}
	public Read getRead() {
		return read;
	}
	public void setRead(Read read) {
		this.read = read;
	}
	public ReadBiz getReadBiz() {
		return readBiz;
	}
	public void setReadBiz(ReadBiz readBiz) {
		this.readBiz = readBiz;
	}
	public Map<String, Object> getRequest() {
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String stateChoice() { 
		List list = readBiz.ReadChoice(rstate);
 		if (list.size() > 0) {
 	     session.put("readlist", list);
 	     return "success";
 		}
 		else return "fail";
	}
	public String execute() throws Exception {
		Read condition = new Read();
		List list = readBiz.Read();
		if (list.size() > 0) {
			session.put("read",list);
			return "success";
		} else {
			return "fail";
		}

	}

}
