package com.wthealth.service.dietschedule.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.domain.BMI;
import com.wthealth.domain.DietSchedule;
import com.wthealth.domain.Food;
import com.wthealth.service.dietschedule.DietScheduleDao;
@Repository("dietScheduleDaoImpl")
public class DietScheduleDaoImpl implements DietScheduleDao {

	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public DietScheduleDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
	
	@Override
	public DietSchedule getDietSchedule(int dietScNo) throws Exception {
		return sqlSession.selectOne("DietScMapper.getDietSchedule", dietScNo);
		
	}

	@Override
	public List<DietSchedule> listDietSchedule(String userId) throws Exception {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateDietSchedule(DietSchedule dietSchedule) throws Exception {
		return sqlSession.update("DietScMapper.updateDietSchedule", dietSchedule);
		
	}

	@Override
	public int addDietSchedule(DietSchedule dietSchedule) throws Exception {
		return sqlSession.insert("DietScMapper.addDietSchedule", dietSchedule);
		 //sqlSession.selectOne("DietScMapper.getDietSchedleNo", dietSchedule);
	}

	@Override
	public void deleteDietSchedule(int dietScNo) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getDietHistoryChart(String userId) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addBmi(BMI bmi) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addMeal(Food food) throws Exception {
	
		return sqlSession.insert("DietScMapper.addMeal", food);
	}

	@Override
	public DietSchedule getDietScNo(DietSchedule dietSchedule) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("DietScMapper.getDietScNo", dietSchedule);
	}

	/*@Override
	public void addMeal(Food food) throws Exception {
		sqlSession.insert("DietScMapper.addMeal", food);
	}*/


}
