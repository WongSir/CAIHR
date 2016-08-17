package scau.com.service.impl;

import java.util.List;

import scau.com.dao.GzPlanDao;
import scau.com.entity.GzPlan;
import scau.com.service.IGzPlanService;

public class GzPlanServiceImpl implements IGzPlanService{

	//save
	public boolean saveGzPlan(GzPlan gzPlan){

		GzPlanDao gzPlanDao = new GzPlanDao();
		return gzPlanDao.saveGzPlan(gzPlan);
	}
	
	//list
	public List<GzPlan> listGzPlan(){
		GzPlanDao gzPlanDao = new GzPlanDao();
		return gzPlanDao.listGzPlan();
	}
	
	//del
	public boolean deleteGzPlan(int gzId){
		GzPlanDao gzPlanDao = new GzPlanDao();
		return gzPlanDao.deleteGzPlanById(gzId);
	}
	
	//show
	public GzPlan showGzPlanById(int gzId){
		GzPlanDao gzPlanDao = new GzPlanDao();
		return gzPlanDao.showGzPlanById(gzId).get(0);
	}
}
