package com.wthealth.service.meeting.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.common.Search;
import com.wthealth.domain.Join;
import com.wthealth.domain.Meeting;
import com.wthealth.service.meeting.MeetingDao;
import com.wthealth.service.meeting.MeetingService;

@Service("meetingServiceImpl")
public class MeetingServiceImpl implements MeetingService {
	///Field
	@Autowired
	@Qualifier("meetingDaoImpl")
	private MeetingDao meetingDao;
	public void setMeetingDao(MeetingDao meetingDao) {
		this.meetingDao = meetingDao;
	}

	///Constructor
	public MeetingServiceImpl() {
		// TODO Auto-generated constructor stub
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
	public Map<String, Object> listMeeting(Search search) throws Exception {
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
	public Map<String, Object> listJoinedMeeting(Search search, String partyId) throws Exception {
		// TODO Auto-generated method stub
		return null;
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
