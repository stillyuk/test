package com.ssh2test1.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import pageBean.PageBean;

import com.hibtest1.entity.Phrase;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.PhraseBiz;

@SuppressWarnings("serial")
public class ListPhraseAction extends ActionSupport {
	public PhraseBiz getPhraseBiz() {
		return phraseBiz;
	}

	public void setPhraseBiz(PhraseBiz phraseBiz) {
		this.phraseBiz = phraseBiz;
	}

	public void setListPhrase(List<Phrase> listPhrase) {
		this.listPhrase = listPhrase;
	}

	private PhraseBiz phraseBiz;
	private PageBean pageBean;
	private List<Phrase> listPhrase;
	private int page = 1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Phrase> getListPhrase() {
		return listPhrase;
	}

	public void setListUser(List<Phrase> listPhrase) {
		this.listPhrase = listPhrase;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public void setService(PhraseBiz phraseBiz) {
		this.phraseBiz = phraseBiz;
	}

	public String stateChoice() throws Exception {
		this.pageBean = phraseBiz.queryForPage(2, page);
		this.listPhrase = this.pageBean.getList();
		return "success";
	}
}
