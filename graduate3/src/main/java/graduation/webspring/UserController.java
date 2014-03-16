package graduation.webspring;

import graduation.domain.User;
import graduation.service.UserService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-12 12:57
 */
@Controller
@RequestMapping("/user/")
public class UserController {
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public ModelAndView login(User user) {
		return new ModelAndView("login", "tip", "");
	}

	@RequestMapping("/signIn")
	public ModelAndView signIn(User user) {
		List<User> users = userService.query(user);
		if (users == null || users.size() == 0) {
			return new ModelAndView("login", "tip", "登陆失败");
		}
		if (users.size() != 1) {
			return new ModelAndView("system/error");
		}
		return new ModelAndView("home", "username", users.get(0).getUsername());
	}
}
