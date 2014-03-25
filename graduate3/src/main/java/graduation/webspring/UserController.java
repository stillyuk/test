package graduation.webspring;

import graduation.core.FileUtil;
import graduation.core.JavaMailUtil;
import graduation.domain.User;
import graduation.service.UserService;

import java.io.File;
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
@RequestMapping("/user")
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
		FileUtil.mkUserDir(user.getUsername());
		JavaMailUtil.send(user.getEmail());
		userService.add(user);
		return new ModelAndView("user/registeSuccess", "user", user);
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
		return new ModelAndView("redirect:/user/" + user.getUsername(), "user", users.get(0));
	}

	@RequestMapping(value = "{username}")
	public ModelAndView userHome(@PathVariable String username) {
		File file = new File(FileUtil.FILE_DOWNLOAD_PATH + File.separatorChar + username);
		return new ModelAndView("user/home", "allFiles", file.listFiles());
	}

	@ResponseBody
	@RequestMapping(value = "/checkUsername", produces = "text/plain;charset=UTF-8")
	public String checkUsername(User user) {
		List<User> users = userService.queryByUsername(user);
		if (users == null || users.size() == 0) {
			return "";
		}
		return "此用户已被注册";
	}
}
