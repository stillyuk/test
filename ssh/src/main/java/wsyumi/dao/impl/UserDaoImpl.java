package  wsyumi.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import wsyumi.dao.UserDao;
import wsyumi.domain.User;

@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("rawtypes")
	public boolean login(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(User.class);
		Criterion username = Restrictions.eq("username", user.getUsername());
		Criterion password = Restrictions.eq("password", user.getUsername());
		c.add(username);
		c.add(password);
		List lists = c.list();
		tx.commit();
		session.close();
		if (lists.size() == 1) {
			return true;
		}
		return false;
	}

	public boolean registe(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		user.setUserId(new Date().toString());
		session.save(user);
		tx.commit();
		session.close();
		return true;
	}

	public boolean transaction(String sql1) throws Exception {
		String sql = "insert into user(userid, username, password) values('11', '1', '1')";
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.createSQLQuery(sql);
		tx.commit();
		session.close();
		return false;
	}
}
