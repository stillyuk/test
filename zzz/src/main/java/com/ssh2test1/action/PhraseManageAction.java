package com.ssh2test1.action;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.hibtest1.entity.Phrase;
import com.hibtest1.entity.Question;
import com.hibtest1.entity.Test;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.PhraseBiz;

public class PhraseManageAction extends ActionSupport implements RequestAware,
		SessionAware {
	private Phrase phrase;
	private PhraseBiz phraseBiz;
	Map<String, Object> request;
	Map<String, Object> session;

	public PhraseBiz getPhraseBiz() {
		return phraseBiz;
	}

	public void setPhraseBiz(PhraseBiz phraseBiz) {
		this.phraseBiz = phraseBiz;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Phrase getPhrase() {
		return phrase;
	}

	public void setPhrase(Phrase phrase) {
		this.phrase = phrase;
	}

	public String stateChoice() {
		Phrase condition = new Phrase();
		condition.setPstate(phrase.getPstate());
		List list = phraseBiz.phraseChoice(condition);
		if (list.size() > 0) {
			HttpServletRequest request = (HttpServletRequest) ActionContext
					.getContext().get(ServletActionContext.HTTP_REQUEST);
			HttpSession session = request.getSession();
			session.setAttribute("phraselist", list);
			return "success";
		} else
			return "fail";
	}
}
