package wsyumi.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 *
 */
@Controller
@RequestMapping("rest")
public class Restful {

	/**
	 * 
	 */
	Logger logger = LogManager.getLogger();

	/**
	 * 
	 */
	@RequestMapping
	public void index() {
		logger.info("index");
	}

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ModelAndView restful(@PathVariable String id) {
		logger.error("log4j2 is ...");
		throw new RuntimeException("spring mail exception");
	}
}
