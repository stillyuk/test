package graduation.webspring;

import graduation.domain.Group;
import graduation.service.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jiangyukun
 * @since 2014-03-19 14:39
 */
@Controller
@RequestMapping("/group/")
public class GroupController {
	@Autowired
	private GroupService groupService;

	@RequestMapping("/add/")
	public void add(Group group) {
		groupService.add(group);
	}

	@RequestMapping("/showAllGroup")
	public void showAllGroup(Group group) {
		groupService.query(group);
	}

	@RequestMapping("{groupId}")
	public void showGroupById(@PathVariable String groupId) {

	}
}
