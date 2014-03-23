package com.ssh2test1;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ssh2test1.biz.UserBiz;
import com.hibtest1.entity.Users;

public class TestSpringHibernate {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserBiz userBiz = (UserBiz) context.getBean("userBiz");
		Users condition = new Users();
		condition.setLoginName("admin");
		condition.setLoginPwd("123456");
		List list = userBiz.login(condition);
		if (list.size() > 0) {
			System.out.println("successful");
		} else {
			System.out.println("fail");
		}

	}

}
