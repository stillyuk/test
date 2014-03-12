package news;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jiangyukun
 * 
 */
@Component
public class QuartzJob {
	Log log = LogFactory.getLog(QuartzJob.class);

	@Autowired
	private NewsService newsService;

	public void work() {
		if (log.isInfoEnabled()) {
			log.info("---计划任务！正在进行主页静态化...");
		}
		List<News> news = newsService.query(null);
		try {
			News2Htm.generate(news);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (log.isInfoEnabled()) {
			log.info("---主页静态化完成！---");
		}
	}
}
