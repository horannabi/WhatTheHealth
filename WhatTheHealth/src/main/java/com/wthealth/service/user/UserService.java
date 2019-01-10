package com.wthealth.service.user;

import java.util.Map;

import com.wthealth.common.Search;
import com.wthealth.domain.User;

public interface UserService {
	
	// 회원가입
		public void addUser(User user) throws Exception;
		
		// 내정보확인 / 로그인
		public User getUser(String userId) throws Exception;
		
		// 회원정보리스트 
		public Map<String , Object> listUser(Search search) throws Exception;
		
		// 회원정보수정
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
		
		// 회원 ID 중복 확인
		public boolean checkDuplication(String userId) throws Exception;
		

}
