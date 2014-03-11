package news;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jiangyukun
 *
 */
@Component
public class NewsService {
	@Autowired
	NewsDao newsDao;

	public List<News> query(String id) {
		return newsDao.query(id);
	}
	
	public void add(News news) {
		newsDao.add(news);
	}
}
