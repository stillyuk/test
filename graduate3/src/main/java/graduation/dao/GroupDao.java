package graduation.dao;

import graduation.domain.Group;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jiangyukun
 * @since 2014-03-19
 */
public class GroupDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Group> query() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		session.close();
		return null;
	}

	public void add(Group group) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(group);
		tx.commit();
		session.close();
	}
}
