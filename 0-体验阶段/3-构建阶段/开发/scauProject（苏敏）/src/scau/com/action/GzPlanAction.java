package scau.com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import scau.com.entity.GzPlan;
import scau.com.service.IGzPlanService;
import scau.com.service.impl.GzPlanServiceImpl;


public class GzPlanAction {
	
	
	
	public String addGzPlan(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取页面数据
		String title = request.getParameter("gzTitle"); // 用户名
		String reason = request.getParameter("gzReason");
		String beginTime = request.getParameter("gzBeginTime");
		String overTime = request.getParameter("gzOverTime");
		String academy = request.getParameter("gzAcademy");
		String post = request.getParameter("gzPost");
		String cnt = request.getParameter("gzCnt");
		String education = request.getParameter("gzEducation");
		String rank = request.getParameter("gzRank");
		String other = request.getParameter("gzOther");
		
		// 实例化对象
		IGzPlanService GzPlanService = new GzPlanServiceImpl();
		// 1 单个传递参数
		// GzPlanService.saveGzPlan(uName, lName, pwd);

		// 2 javaBean传递参数
		GzPlan gzPlan = new GzPlan();

		gzPlan.setCnt(Integer.valueOf(cnt));
		gzPlan.setTitle(title);
		gzPlan.setReason(reason);
		gzPlan.setBeginTime(beginTime);
		gzPlan.setOverTime(overTime);
		gzPlan.setAcademy(academy);
		gzPlan.setPost(post);
		gzPlan.setEducation(education);
		gzPlan.setRank(rank);
		gzPlan.setOther(other);

		boolean flag = GzPlanService.saveGzPlan(gzPlan);
		if(flag){
			return "success";
		} else {
			return "error";
		}
		
	}
	
	
	private List<GzPlan> gzPlanList;
	
	public List<GzPlan> getGzPlanList() {
		return gzPlanList;
	}

	public void setGzPlanList(List<GzPlan> gzPlanList) {
		this.gzPlanList = gzPlanList;
	}

	public String listGzPlan(){
		
		// 实例化对象
		IGzPlanService gzPlanService = new GzPlanServiceImpl();
		gzPlanList = gzPlanService.listGzPlan();
		return "success";
	}
	
	public String showGzPlanById(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取查询的条件
		String gzId = "";
		try {
			gzId = request.getParameter(gzId);
		} catch (Exception ex) {
			gzId = "";
		}

		List<GzPlan> gzPlanList = new ArrayList<GzPlan>();
		// 实例化对象
		IGzPlanService gzPlanService = new GzPlanServiceImpl();
		// GzPlanList = GzPlanService.queryGzPlanInfo();
		gzPlanList = (List<GzPlan>) gzPlanService.showGzPlanById(Integer.valueOf(gzId));

		request.setAttribute("gzList", gzPlanList); // 把数据集放在request对象中
		request.setAttribute("gzId", gzId);

		return "success";
	}
	
	
	public String delGzPlan(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String gzId = request.getParameter("gzId");
		// 实例化对象
		IGzPlanService GzPlanService = new GzPlanServiceImpl();

		boolean flag = GzPlanService.deleteGzPlan(Integer.valueOf(gzId));
		
		if(flag){
			return "success";
		} else {
			return "error";
		}
	}
}
