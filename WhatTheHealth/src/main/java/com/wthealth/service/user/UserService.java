package com.wthealth.service.user;

import java.util.Map;

import com.wthealth.common.Search;
import com.wthealth.domain.User;

public interface UserService {
	
	// ȸ������
		public void addUser(User user) throws Exception;
		
		// ������Ȯ�� / �α���
		public User getUser(String userId) throws Exception;
		
		// ȸ����������Ʈ 
		public Map<String , Object> listUser(Search search) throws Exception;
		
		// ȸ����������
		public void updateUser(User user) throws Exception;
		
		public void deleteUser(User user) throws Exception;
		
		public void findId() throws Exception;
		
		public void findPassword() throws Exception;
		
		public void naverLogin() throws Exception;
		
		public void kakaoLogin() throws Exception;
		
		public void checkId() throws Exception;
		
		public void checkNickname() throws Exception;
		
		public void checkAuth() throws Exception;
		
		public void sendPassword() throws Exception;
		
		public void sendSMS() throws Exception;
		
		public void sendMail() throws Exception;
		
		// ȸ�� ID �ߺ� Ȯ��
		public boolean checkDuplication(String userId) throws Exception;
		

}
