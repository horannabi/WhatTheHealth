package com.wthealth.service.hashtag.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.domain.HashTag;
import com.wthealth.service.hashtag.HashTagDao;
import com.wthealth.service.hashtag.HashTagService;

@Service("hashTagServiceImpl")
public class HashTagServiceImpl implements HashTagService {

	///Field
	@Autowired
	@Qualifier("hashTagDaoImpl")
	private HashTagDao hashTagDao;
	
	public void setHashTagDao(HashTagDao hashTagDao) {
		this.hashTagDao = hashTagDao;
	}
	///Constructor
	public HashTagServiceImpl() {
		System.out.println(this.getClass());
	}

	///Method
	
	@Override
	public void addHashTag(HashTag hashTag) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getHashTag(String hashTag) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateHashTag(HashTag hashTag) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
