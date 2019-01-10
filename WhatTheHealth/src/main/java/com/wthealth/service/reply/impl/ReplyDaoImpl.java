package com.wthealth.service.reply.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Reply;
import com.wthealth.service.reply.ReplyDao;

@Repository("replyDaoImpl")
public class ReplyDaoImpl implements ReplyDao {
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public ReplyDaoImpl() {
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
	public int getTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Reply> listReply(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
