package com.ssh2test1.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibtest1.entity.Phrase;

public class PhraseDAOImpl extends HibernateDaoSupport implements PhraseDAO {
	@SuppressWarnings("deprecation")
	public List search(final Phrase condition) {
		return super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria c = session.createCriteria(Phrase.class);
						if (condition != null) {
							if (condition.getPstate() != null) {
								c.add(Restrictions.eq("pstate",
										condition.getPstate()));
							}
						}
						Object object = c.list();
						return object;
					}

				});
	}

	public int getAllRowCount(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}

	public List<Phrase> queryForPage(final String hql, final int offset,
			final int length) {
		Session session = this.getSession();
		Query q = session.createQuery(hql);
		q.setFirstResult(offset);
		q.setMaxResults(length);
		List<Phrase> list = q.list();
		System.out.println(list.size());
		session.close();
		return list;
	}
}