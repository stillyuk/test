package com.hibtest1.entity;

import java.util.Set;

public class Test {
	private String tid;
	private String tcontent;
	private String tstate;
	private Set<Question> bks;

	public Test() {
		super();
	}

	public Set<Question> getBks() {
		return bks;
	}

	public void setBks(Set<Question> bks) {
		this.bks = bks;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTcontent() {
		return tcontent;
	}

	public void setTcontent(String tcontent) {
		this.tcontent = tcontent;
	}

	public String getTstate() {
		return tstate;
	}

	public void setTstate(String tstate) {
		this.tstate = tstate;
	}

}
