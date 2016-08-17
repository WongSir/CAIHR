package scau.com.service;

import java.util.List;

import scau.com.entity.GzPlan;

public interface IGzPlanService {

	//save
	public boolean saveGzPlan(GzPlan gzPlan);
	
	//list
	public List<GzPlan> listGzPlan();
	
	//del
	public boolean deleteGzPlan(int gzId);
	
	//show
	public GzPlan showGzPlanById(int gzId);
	
}
