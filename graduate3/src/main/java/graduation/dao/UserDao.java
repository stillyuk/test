package graduation.dao;

import graduation.domain.User;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author jiangyukun
 * @since 2014-03-12 13:03
 */
@Repository
public class UserDao extends HibernateDaoSupport {

	public List<User> query(final User user) {
		HibernateCallback<List<User>> action = new HibernateCallback<List<User>>() {
			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Criteria criteria = session.createCriteria(User.class);
				criteria.add(Restrictions.eq("username", user.getUsername())).add(
						Restrictions.eq("password", user.getPassword()));
				@SuppressWarnings("unchecked")
				List<User> users = criteria.list();
				return users;
			}
		};
		return getHibernateTemplate().execute(action);
	}

	@SuppressWarnings("unchecked")
	public List<User> queryByUsername(final User user) {
		HibernateCallback<List<User>> action = new HibernateCallback<List<User>>() {
			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Criteria criteria = session.createCriteria(User.class);
				criteria.add(Restrictions.eq("username", user.getUsername()));
				List<User> users = criteria.list();
				return users;
			}
		};
		return getHibernateTemplate().execute(action);
	}

	public void add(final User user) {
		HibernateCallback<Object> action = new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				return session.save(user);
			}
		};
		getHibernateTemplate().execute(action);
	}
}
