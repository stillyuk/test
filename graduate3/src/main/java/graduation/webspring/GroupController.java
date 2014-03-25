package graduation.webspring;

import graduation.domain.Group;
import graduation.domain.User;
import graduation.service.GroupService;
import graduation.service.UserService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-19 14:39
 */
@Controller
@RequestMapping("/group")
@SessionAttributes("userId")
public class GroupController {
	@Autowired
	private GroupService groupService;

	@Autowired
	private UserService userService;

	@RequestMapping({ "", "/", "index" })
	public String index(Group group) {
		return "group/index";
	}

	@RequestMapping("/addGroup")
	public String addGroup() {
		return "group/addGroup";
	}

	@RequestMapping("/doAddGroup")
	public ModelAndView doAddGroup(Group group, @ModelAttribute("userId") String userId) {
		if (group == null) {
			return new ModelAndView("group/addResult", "tip", "内容为空");
		}
		User user = userService.queryById(userId);
		group.setManager(user);
		group.setUsers(Arrays.asList(new User[] { user }));
		groupService.add(group);
		return new ModelAndView("group/addResult", "tip", "添加成功");
	}

	@RequestMapping("/showAllGroup")
	public void showAllGroup(Group group) {
		groupService.query(group);
	}

	@RequestMapping("{groupId}")
	public ModelAndView showGroupById(@PathVariable String groupId) {
		return new ModelAndView("group/home", "groupId", groupId);
	}
}
