package graduation.service;

import graduation.dao.GroupDao;
import graduation.domain.Group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jiangyukun
 * @since 2014-03-19
 */
@Service
@Transactional
public class GroupService {
	@Autowired
	private GroupDao groupDao;

	public void add(Group group) {
		groupDao.add(group);
	}

	public void query(Group group) {
		groupDao.query(group);
	}
}
