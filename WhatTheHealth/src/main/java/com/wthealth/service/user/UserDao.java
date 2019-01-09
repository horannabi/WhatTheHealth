package com.wthealth.service.user;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.User;


public interface UserDao {
	
		// INSERT
		public void addUser(User user) throws Exception ;

		// SELECT ONE
		public User getUser(String userId) throws Exception ;

		// SELECT LIST
		public List<User> listUser(Search search) throws Exception ;

		// UPDATE
		public void updateUser(User user) throws Exception ;
		
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
		
		
		// �Խ��� Page ó���� ���� ��üRow(totalCount)  return
		public int getTotalCount(Search search) throws Exception ;
		
		
	

}
