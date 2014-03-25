package graduation.dao;

import graduation.domain.Group;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * @author jiangyukun
 * @since 2014-03-19
 */
public class GroupDao extends HibernateDaoSupport {
	public List<Group> query(final Group group) {
		HibernateCallback<List<Group>> action = new HibernateCallback<List<Group>>() {
			@Override
			@SuppressWarnings("unchecked")
			public List<Group> doInHibernate(Session session) throws HibernateException {
				Criteria criteria = session.createCriteria(Group.class);
				criteria.add(Restrictions.eq("username", group.getUuid()));
				return criteria.list();
			}
		};
		return getHibernateTemplate().execute(action);
	}

	public Object add(final Group group) {
		HibernateCallback<Object> action = new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				return (Object) session.save(group);
			}
		};
		return getHibernateTemplate().execute(action);
	}
}
