package com.wthealth.service.socket.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Live;
import com.wthealth.service.socket.SocketDao;

@Repository("socketDaoImpl")
public class SocketDaoImpl implements SocketDao {
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public SocketDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addLiveStream(Live live) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Live getLiveStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLiveStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Live> listLiveStream(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBattleStream(Live live) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Live getBattleStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBattleStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPlayer(String userId) throws Exception {
		// TODO Auto-generated method stub

	}

}
