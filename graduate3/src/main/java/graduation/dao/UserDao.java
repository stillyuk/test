package graduation.dao;

import graduation.domain.User;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author jiangyukun
 * @since 2014-03-12 13:03
 */
@Repository
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<User> query(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", user.getUsername())).add(
				Restrictions.eq("password", user.getPassword()));
		List<User> users = criteria.list();
		tx.commit();
		session.close();
		return users;
	}
}
