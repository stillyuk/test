package graduation.service;

import graduation.dao.GroupDao;
import graduation.domain.Group;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jiangyukun
 * @since 2014-03-19
 */
public class GroupService {
	@Autowired
	private GroupDao groupDao;

	public void add(Group group) {
		groupDao.add(group);
	}
}
