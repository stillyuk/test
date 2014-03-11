package news;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 *
 */
@Controller
@RequestMapping("news")
public class NewsController {

	@Autowired
	NewsService newsService;

	@RequestMapping("add")
	public ModelAndView addNews(News news) {
		System.out.println("title: " + news.getTitle());
		newsService.add(news);
		return new ModelAndView("addResult", "title", news.getTitle());
	}

	@RequestMapping("showAll")
	public ModelAndView showAll() {
		List<News> news = newsService.query(null);
		try {
			News2Htm.generate(news);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("show", "news", news);
	}

	@RequestMapping("show")
	public ModelAndView show(String id) {
		List<News> news = newsService.query(id);
		return new ModelAndView("newsDetail", "news", news);
	}
}
