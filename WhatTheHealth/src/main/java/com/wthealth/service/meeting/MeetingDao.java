package com.wthealth.service.meeting;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.Join;
import com.wthealth.domain.Meeting;

public interface MeetingDao {
	//INSERT 소모임
	public void addMeeting(Meeting meeting) throws Exception;
	
	//UPDATE 소모임
	public void updateMeeting(Meeting meeting) throws Exception;
	
	//DELETE 소모임 -> (주의) Update 해야 함
	public void deleteMeeting(String postNo) throws Exception;
	
	//SELECT ONE 소모임
	public Meeting getMeeting(String postNo) throws Exception;
	
	//SELECT LIST 소모임
	public List<Meeting> listMeeting(Search search) throws Exception;
	
	//INSERT 소모임참여
	public void addJoin(Join join) throws Exception;
	
	//DELETE 소모임참여
	public void deleteJoin(String postNo) throws Exception;
	
	//SELECT LIST
	public List<Join> listJoinedMeeting(Search search, String partyId) throws Exception;
	
	//게시판 Page 처리를 위한 전체Row(totalCount)  return --> Meeting 용!
	public int getTotalCount(Search search) throws Exception ;
	
	//게시판 Page 처리를 위한 전체Row(totalCount)  return --> JOIN용!
	public int getTotalCountJoin(String partyId) throws Exception;
	
	//소모임 알림
	public Meeting getMeetingClock(String postNo) throws Exception;
	
	//선금 상태 변경
	public void updateDeposit(String postNo) throws Exception;
}
