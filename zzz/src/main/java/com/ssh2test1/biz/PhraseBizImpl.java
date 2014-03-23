package com.ssh2test1.biz;

import java.util.List;

import pageBean.PageBean;

import com.hibtest1.entity.Phrase;
import com.ssh2test1.dao.PhraseDAO;

public class PhraseBizImpl implements PhraseBiz {
	PhraseDAO phraseDAO;

	public void setPhraseDAO(PhraseDAO phraseDAO) {
		this.phraseDAO = phraseDAO;
	}

	public List phraseChoice(Phrase condition) {
		return phraseDAO.search(condition);
	}

	public PageBean queryForPage(int pageSize, int page) {
		final String hql = "from Phrase";
		int allRow = phraseDAO.getAllRowCount(hql);
		int totalPage = PageBean.countTatalPage(pageSize, allRow);
		final int offset = PageBean.countOffset(pageSize, page);
		final int length = pageSize;
		final int currentPage = PageBean.countCurrentPage(page);
		List list = phraseDAO.queryForPage(hql, offset, length);

		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}
}
