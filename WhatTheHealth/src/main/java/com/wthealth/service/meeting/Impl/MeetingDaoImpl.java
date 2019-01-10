package com.wthealth.service.meeting.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Join;
import com.wthealth.domain.Meeting;
import com.wthealth.service.meeting.MeetingDao;

@Repository("meetingDaoImpl")
public class MeetingDaoImpl implements MeetingDao {
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public MeetingDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
	@Override
	public void addMeeting(Meeting meeting) throws Exception {
		// TODO Auto-generated method stub

	}

	/*@Override
	public void updateMeeting(Meeting meeting) throws Exception {
		// TODO Auto-generated method stub

	}*/

	@Override
	public void deleteMeeting(String postNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Meeting getMeeting(String postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Meeting> listMeeting(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addJoin(Join join) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJoin(int joinNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Join> listJoinedMeeting(Search search, String partyId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalCountJoin(String partyId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Meeting getJoin(int joinNo)  throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDeposit(int joinNo) throws Exception {
		// TODO Auto-generated method stub

	}

}
