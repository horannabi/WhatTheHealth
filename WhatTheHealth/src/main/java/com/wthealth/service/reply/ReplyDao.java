package com.wthealth.service.reply;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.Reply;

public interface ReplyDao {
	//INSERT
	public void addReply(Reply reply) throws Exception;
	
	//INSERT ����
	public void addReReply(Reply reply) throws Exception;
	
	//SELECT ONE
	public Reply getReply(int replyNo) throws Exception;
	
	//DELETE -> (����) Update �ؾ� ��
	public void deleteReply(int replyNo) throws Exception;
	
	//DELETE ���� -> (����) Update �ؾ� ��
	//public void deleteReReply(int replyNo) throws Exception;
	
	// �Խ��� Page ó���� ���� ��üRow(totalCount)  return
	public int getTotalCount(Search search) throws Exception ;
	
	// �Խ��� Page ó���� ���� ��üRow(totalCount)  return -> My List
	public int getTotalCountMyList(String writerId) throws Exception ;
	
	//SELECT LIST
	public List<Reply> listReply(Search search) throws Exception;
	
	//SELECT LIST MY REPLY 
	public List<Reply> listMyReply(Search search, String writerId) throws Exception;
	
}
