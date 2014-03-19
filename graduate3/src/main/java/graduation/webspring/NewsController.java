package graduation.webspring;

import graduation.core.News2Htm;
import graduation.domain.News;
import graduation.service.NewsService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-12
 */
@Controller
@RequestMapping("news")
public class NewsController {

	@Autowired
	NewsService newsService;

	@RequestMapping("addNews")
	public ModelAndView addNews() {
		return new ModelAndView("news/addNews");
	}
	
	@RequestMapping("doAddNews")
	public ModelAndView doAddNews(News news) {
		newsService.add(news);
		return new ModelAndView("addResult", "title", news.getTitle());
	}

	@RequestMapping("allNews")
	public ModelAndView allNews(HttpServletRequest request, HttpServletResponse response) {
		List<News> news = newsService.query(null);
		try {
			News2Htm.generate(news);
		} catch (Exception e) {
		}
		return new ModelAndView("news/allNews", "allNews", news);
	}

	@RequestMapping("singleNews")
	public ModelAndView singleNews(String id) {
		List<News> news = newsService.query(id);
		if (news != null && news.size() > 0) {
			return new ModelAndView("news/singleNews", "news", news.get(0));
		}
		return new ModelAndView("news/singleNews");
	}
}
