package com.ssh2test1.biz;

import java.util.List;

import pageBean.PageBean;

import com.hibtest1.entity.Phrase;

public interface PhraseBiz {
	public List phraseChoice(Phrase condition);
	public PageBean queryForPage(int pageSize,int page);
}
