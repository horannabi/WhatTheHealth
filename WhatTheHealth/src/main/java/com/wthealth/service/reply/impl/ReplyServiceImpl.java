package com.wthealth.service.reply.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.common.Search;
import com.wthealth.domain.Reply;
import com.wthealth.service.reply.ReplyDao;
import com.wthealth.service.reply.ReplyService;

@Service("replyServiceImpl")
public class ReplyServiceImpl implements ReplyService {

	///Field
	@Autowired
	@Qualifier("replyServiceImpl")
	private ReplyDao replyDao;
	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}
	
	///Constructor
	public ReplyServiceImpl() {
		System.out.println(this.getClass());
	}
	
	///Method
	@Override
	public void addReply(Reply reply) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addReReply(Reply reply) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Reply getReply(int replyNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReply(int replyNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReReply(int replyNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public  Map<String , Object> listReply(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
