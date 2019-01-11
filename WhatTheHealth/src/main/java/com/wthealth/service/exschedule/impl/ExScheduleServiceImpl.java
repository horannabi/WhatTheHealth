package com.wthealth.service.exschedule.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.domain.ExSchedule;
import com.wthealth.service.exschedule.ExScheduleDao;
import com.wthealth.service.exschedule.ExScheduleService;

@Service("exScheduleServiceImpl")
public class ExScheduleServiceImpl implements ExScheduleService {

	///Field
	@Autowired
	@Qualifier("exScheduleDaoImpl")
	private ExScheduleDao exScheduleDao;
	
	
	///Constructor
	public void setExScheduleDao(ExScheduleDao exScheduleDao) {
		this.exScheduleDao = exScheduleDao;
	}

	public ExScheduleServiceImpl() {
		System.out.println(this.getClass());
	}

	///Method
	@Override
	public void addExSchedule(ExSchedule exSchedule) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSchedule(int exScNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateExSchedule(ExSchedule exSchedule) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listExSchedule(String userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getExHistoryChart(String userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExSchedule(int exScNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
