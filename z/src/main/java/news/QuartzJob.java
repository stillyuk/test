package news;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class QuartzJob {
	Log log = LogFactory.getLog(QuartzJob.class);

	public void work() {
		log.info("QuartJob");
	}
}
