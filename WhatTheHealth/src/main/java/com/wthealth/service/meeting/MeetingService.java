package com.wthealth.service.meeting;

import java.util.List;
import java.util.Map;

import com.wthealth.common.Search;
import com.wthealth.domain.Join;
import com.wthealth.domain.Meeting;

public interface MeetingService {
	//INSERT �Ҹ���
		public void addMeeting(Meeting meeting) throws Exception;
		
		//UPDATE �Ҹ���
		//public void updateMeeting(Meeting meeting) throws Exception;
		
		//DELETE �Ҹ��� -> (����) Update �ؾ� ��
		public void deleteMeeting(String postNo) throws Exception;
		
		//SELECT ONE �Ҹ���
		public Meeting getMeeting(String postNo) throws Exception;
		
		//SELECT LIST �Ҹ���
		public Map<String , Object> listMeeting(Search search) throws Exception;
		
		//INSERT �Ҹ�������
		public void addJoin(Join join) throws Exception;
		
		//DELETE �Ҹ�������
		public void deleteJoin(int joinNo) throws Exception;
		
		//SELECT LIST
		public Map<String , Object> listJoinedMeeting(Search search, String partyId) throws Exception;
		
		//SELECT ONE �Ҹ������� (�Ҹ��� �˸�)
		public Meeting getJoin(int joinNo) throws Exception;
		
		//���� ���� ����
		public void updateDeposit(int joinNo) throws Exception;
}
