package com.ssh2test1.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibtest1.entity.Read;

public class ReadDAOImpl extends HibernateDaoSupport implements ReadDAO {
	public List search(final String rstate) {
		return super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria c = session.createCriteria(Read.class);
						if (rstate != null) {
							c.add(Restrictions.eq(rstate, "1"));
						}
						Object object = c.list();
						return object;
					}
				});
	}

	public List searchAll() {
		return super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria c = session.createCriteria(Read.class);
						Object object = c.list();
						return object;
					}
				});

	}

}
