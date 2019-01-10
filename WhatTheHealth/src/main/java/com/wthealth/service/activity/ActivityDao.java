package com.wthealth.service.activity;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.Interest;
import com.wthealth.domain.Meeting;
import com.wthealth.domain.Post;
import com.wthealth.domain.Reply;

public interface ActivityDao {
	
	public List<Interest> listMyInterest(Search search) throws Exception ;
	
	public List<Meeting> listMyMeeting(Search search) throws Exception ;

	public List<Reply> listMyReply(Search search) throws Exception ;
	
	public List<Post> listMyPost(Search search) throws Exception ;
	
	public int getTotalCount(Search search) throws Exception ;


}
