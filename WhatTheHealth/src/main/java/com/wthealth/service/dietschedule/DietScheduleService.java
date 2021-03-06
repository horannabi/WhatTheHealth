package com.wthealth.service.dietschedule;

import java.util.List;

import com.wthealth.domain.BMI;
import com.wthealth.domain.DietSchedule;
import com.wthealth.domain.Food;

public interface DietScheduleService {

	public void addDietSchedule(DietSchedule dietSchedule) throws Exception;
	
	public DietSchedule getDietSchedule(int dietScNo) throws Exception;
	
	public void listDietSchedule(String userId) throws Exception;
	
	public void updateDietSchedule(DietSchedule dietSchedule) throws Exception;
	
	public void getDietHistoryChart(String userId) throws Exception;
	
	public void deleteDietSchedule(int dietScNo) throws Exception;
	
	public void addBmi(BMI bmi) throws Exception; 
	
	public DietSchedule getDietScNo(DietSchedule dietSchedule) throws Exception;

	public int addMeal(Food food1) throws Exception; 
	
}
