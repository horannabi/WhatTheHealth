package com.wthealth.service.hashtag;

import com.wthealth.domain.HashTag;

public interface HashTagDao {

	public void addHashTag(HashTag hashTag) throws Exception;
	
	public void getHashTag(String hashTag) throws Exception;
	
	public void updateHashTag(HashTag hashTag) throws Exception; 
	
}
