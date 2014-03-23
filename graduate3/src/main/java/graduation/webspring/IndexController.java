package graduation.webspring;

import graduation.core.News2Htm;
import graduation.domain.News;
import graduation.service.NewsService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-12 14:12
 */
@Controller
public class IndexController {
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private NewsService newsService;

	@RequestMapping({ "/", "/index" })
	public ModelAndView index() {
		List<News> allNews = newsService.query(null);
		News2Htm.generate(allNews);
		return new ModelAndView("index", "allNews", allNews);
	}

	@RequestMapping("/button")
	public ModelAndView button(String subject) {
		return new ModelAndView("index");
	}
}
