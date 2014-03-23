package com.ssh2test1.dao;

import java.util.List;

import com.hibtest1.entity.Phrase;

public interface PhraseDAO {
	public List search(Phrase condition);
 
	public List<Phrase> queryForPage(final String hql,final int offset,final int length);    
  
	public int getAllRowCount(String hql);    
	   
}
