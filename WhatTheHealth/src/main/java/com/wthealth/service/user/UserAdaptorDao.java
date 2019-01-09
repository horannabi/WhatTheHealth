package com.wthealth.service.user;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.User;

public abstract class UserAdaptorDao implements UserDao {

	public UserAdaptorDao() {
		// TODO Auto-generated constructor stub
	}
	
	// INSERT
	public void addUser(User user) throws Exception {
		
	}

	// SELECT ONE
	public User getUser(String userId) throws Exception {
		return null;
	}

	// SELECT LIST
	public List<User> listUser(Search search) throws Exception {
		return null;
	}

	// UPDATE
	public void updateUser(User user) throws Exception {
		
	}
	
	public void deleteUser(User user) throws Exception{
		
	}
	
	public void findId() throws Exception{
		
	}
	
	public void findPassword() throws Exception{
		
	}
	
	public void naverLogin() throws Exception{
		
	}
	
	public void kakaoLogin() throws Exception{
		
	}
	
	public void checkId() throws Exception{
		
	}
	
	public void checkNickname() throws Exception{
		
	}
	
	public void checkAuth() throws Exception{
		
	}
	
	public void sendPassword() throws Exception{
		
	}
	
	public void sendSMS() throws Exception{
		
	}
	
	public void sendMail() throws Exception{
		
	}
	
	
	// 게시판 Page 처리를 위한 전체Row(totalCount)  return
	public int getTotalCount(Search search) throws Exception {
		return 0;
	}
	
		
	

}
