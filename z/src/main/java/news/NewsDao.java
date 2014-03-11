package news;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jiangyukun
 * 
 */
@Component
public class NewsDao {
	@Autowired
	SessionFactory factory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<News> query(String id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(News.class);
		c.addOrder(Order.desc("top"));
		if (id != null && !id.equals("")) {
			c.add(Restrictions.eq("id", id));
		}
		List news = c.list();
		tx.commit();
		session.close();
		return news;
	}

	public void add(News news) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		news.setNewsDate(new Date());
		session.save(news);
		tx.commit();
		session.close();
	}
}
