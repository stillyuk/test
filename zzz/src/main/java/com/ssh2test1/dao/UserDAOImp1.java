package com.ssh2test1.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibtest1.entity.Users;

public class UserDAOImp1 extends HibernateDaoSupport implements UserDAO {
	@SuppressWarnings("deprecation")
	public List search(final Users condition) {
		return super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria c = session.createCriteria(Users.class);
						if (condition != null) {
							if (condition.getLoginName() != null
									&& !condition.getLoginName().equals("")) {
								c.add(Restrictions.eq("loginPwd",
										condition.getLoginPwd()));
							}
						}
						return c.list();
					}
				});
	}

	public void register(Users user) {
		super.getHibernateTemplate().save(user);
	}

}
