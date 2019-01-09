package com.wthealth.service.adminmanage.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.User;
import com.wthealth.service.adminmanage.AdminManageDao;

@Repository("adminManageDaoImpl")
public class AdminManageDaoImpl implements AdminManageDao {

	//Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}	
	
	//Constructor
	public AdminManageDaoImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public Map<String, Object> listUserAdminManage(Search search) throws Exception {
		return null;
	}

	@Override
	public User getAdminManage(String userId) throws Exception {
		
		return null;
	}

	@Override
	public void updateUserAdminManage(User user) throws Exception {

	}

	@Override
	public int getTotalCount(Search search) throws Exception {
	
		return 0;
	}

}
