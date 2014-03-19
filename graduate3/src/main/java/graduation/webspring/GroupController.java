package graduation.webspring;

import graduation.domain.Group;
import graduation.service.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-19 14:39
 */
@Controller
@RequestMapping("/group")
public class GroupController {
	@Autowired
	private GroupService groupService;

	@RequestMapping({ "", "/", "index" })
	public String index(Group group) {
		return "group/index";
	}

	@RequestMapping("/add")
	public String add(Group group) {
		groupService.add(group);
		return "redirect:index";
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
