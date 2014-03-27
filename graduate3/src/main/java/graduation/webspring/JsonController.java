package graduation.webspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-26 20:33
 */
@Controller
@RequestMapping("/json")
public class JsonController {

	@RequestMapping("/test")
	public ModelAndView test() {
		return new ModelAndView("", "a", "1");
	}
}
