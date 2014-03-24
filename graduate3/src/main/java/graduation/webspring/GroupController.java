package graduation.webspring;

import graduation.domain.Group;
import graduation.service.GroupService;

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
@SessionAttributes("username")
public class GroupController {
	@Autowired
	private GroupService groupService;

	@RequestMapping({ "", "/", "index" })
	public String index(Group group) {
		return "group/index";
	}

	@RequestMapping("/addGroup")
	public String addGroup() {
		return "roup/addGroup";
	}

	@RequestMapping("/doAddGroup")
	public String doAddGroup(Group group, @ModelAttribute("userId") String userId) {
		if (group == null)
			return null;
//		group.setManager();
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
