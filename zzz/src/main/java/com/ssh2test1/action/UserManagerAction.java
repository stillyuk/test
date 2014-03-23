package com.ssh2test1.action;

import java.util.List;

import com.hibtest1.entity.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.UserBiz;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class UserManagerAction extends ActionSupport implements RequestAware,  //struts2����webԪ��
		SessionAware {
	private String loginName;
	private String loginPwd;
	private Users users;// 定义Users类对象，用于封装表单参数
	
	// 使用UserBiz声明丄1�7个对象，并添加set方法用于依赖注入
	private UserBiz userBiz;

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	Map<String, Object> request;
	Map<String, Object> session;

	public String addUser() {
		if (users.getSex().equals("0")) {
			users.setSex("��");
		} else
			users.setSex("Ů");
		userBiz.register(users);
		return "success";
	}

	// 重载execute方法来处理登陆请汄1�7
	public String execute() throws Exception {
		Users condition = new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);
		List list = userBiz.login(condition);
		if (list.size() > 0) {
			return "success";
		} else {
			return "fail";
		}

	}
}
