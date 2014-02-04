package wsyumi.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author apple
 * 
 */
@Component
public class MyLog4j {

	/**
	 * @see Log4j2
	 */
	Logger logger = LogManager.getLogger(MyLog4j.class.getName());

	/**
	 * @date 2014-01-15 21:37
	 * @author jiangyukun
	 * @see wsyumi.task.Task
	 */
	public void standardLog() {
		logger.info("sdout");
		System.out.println("...log4j2...");
	}
}
