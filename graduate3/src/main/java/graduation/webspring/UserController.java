package graduation.webspring;

import graduation.domain.User;
import graduation.service.UserService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
		return new ModelAndView("user/login", "tip", "");
	}

	@RequestMapping("/registe")
	public ModelAndView registe() {
		return new ModelAndView("user/registe");
	}

	@RequestMapping("/signUp")
	public ModelAndView signUp(User user) {
		userService.add(user);
		return new ModelAndView("user/registe");
	}

	@RequestMapping("/signIn")
	public ModelAndView signIn(User user) {
		List<User> users = userService.query(user);
		if (users == null || users.size() == 0) {
			return new ModelAndView("user/login", "tip", "用户名或密码错误");
		}
		if (users.size() != 1) {
			return new ModelAndView("user/login", "tip", "系统错误");
		}
		return new ModelAndView("redirect:/user/" + user.getUsername());
	}

	@RequestMapping(value = "/checkUsername", produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String checkUsername(User user) {
		List<User> users = userService.queryByUsername(user);
		if (users == null || users.size() == 0) {
			return "";
		}
		return "此用户已被注册";
	}

	@RequestMapping(value = "{username}")
	@ResponseBody
	public ModelAndView userHome(@PathVariable String username) {
		return new ModelAndView("user/home");
	}
}
