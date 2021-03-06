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
		exScheduleDao.addExSchedule(exSchedule);		
	}

	@Override
	public ExSchedule getExSchedule(int exScNo) throws Exception {
		return exScheduleDao.getExSchedule(exScNo);		
	}

	@Override
	public void updateExSchedule(ExSchedule exSchedule) throws Exception {
		exScheduleDao.updateExSchedule(exSchedule);
		
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
		exScheduleDao.deleteExSchedule(exScNo);
		
	}

}
