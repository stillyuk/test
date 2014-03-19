package graduation.dao;

import graduation.domain.Group;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jiangyukun
 * @since 2014-03-19
 */
public class GroupDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Group> query(Group group) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(Group.class);
		criteria.add(Restrictions.eq("username", group.getUuid()));
		List<Group> groups = criteria.list();
		tx.commit();
		session.close();
		return groups;
	}

	public void add(Group group) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(group);
		tx.commit();
		session.close();
	}
}
