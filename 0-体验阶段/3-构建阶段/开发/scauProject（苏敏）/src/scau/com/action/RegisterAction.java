package scau.com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import scau.com.entity.RegisterTable;
import scau.com.service.IRegisterService;
import scau.com.service.impl.RegisterServiceImpl;


public class RegisterAction {
	
	
	
	public String addRegister(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取页面数据
		String name = request.getParameter("rName"); // 用户名
		String sex = request.getParameter("rSex");
		String come = request.getParameter("rCome");
		String birth = request.getParameter("rBirth");
		String address = request.getParameter("rAddress");
		String phone = request.getParameter("rPhone");
		String identityId = request.getParameter("rIdentityId");
		String education = request.getParameter("rEducation");
		String major = request.getParameter("rMajor");
		String school = request.getParameter("rSchool");
		String skill = request.getParameter("rSkill");
		String time = request.getParameter("rTime");
		String experience = request.getParameter("rExperience");
		String selfEvaluate = request.getParameter("rSelfEvaluate");
		
		// 实例化对象
		IRegisterService registerService = new RegisterServiceImpl();
		// 1 单个传递参数
		// registerService.saveregister(uName, lName, pwd);

		// 2 javaBean传递参数
		RegisterTable registerTable = new RegisterTable();

		registerTable.setTime(Integer.valueOf(time));
		registerTable.setSex(sex);
		registerTable.setName(name);
		registerTable.setBirth(birth);
		registerTable.setCome(come);
		registerTable.setIdentityId(identityId);
		registerTable.setAddress(address);
		registerTable.setPhone(phone);
		registerTable.setMajor(major);
		registerTable.setEducation(education);
		registerTable.setAddress(address);
		registerTable.setSchool(school);
		registerTable.setSkill(skill);
		registerTable.setExperience(experience);
		registerTable.setSelfEvaluate(selfEvaluate);

		boolean flag = registerService.saveRegister(registerTable);
		if(flag){
			return "success";
		} else {
			return "error";
		}
		
	}
	
	
	private List<RegisterTable> registerList;
	
	public List<RegisterTable> getRegisterList() {
		return registerList;
	}

	public void setRegisterList(List<RegisterTable> registerList) {
		this.registerList = registerList;
	}

	public String listRegister(){
		
		// 实例化对象
		IRegisterService registerService = new RegisterServiceImpl();
		registerList = registerService.listRegister();
		return "success";
	}
	
	public String showRegisterById(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取查询的条件
		String rId = "";
		try {
			rId = request.getParameter(rId);
		} catch (Exception ex) {
			rId = "";
		}

		List<RegisterTable> registerList = new ArrayList<RegisterTable>();
		// 实例化对象
		IRegisterService registerService = new RegisterServiceImpl();
		// registerList = registerService.queryregisterInfo();
		registerList = (List<RegisterTable>) registerService.showRegisterById(Integer.valueOf(rId));

		request.setAttribute("rList", registerList); // 把数据集放在request对象中
		request.setAttribute("rId", rId);

		return "success";
	}
	
	
	public String delRegister(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String rId = request.getParameter("rId");
		// 实例化对象
		IRegisterService registerService = new RegisterServiceImpl();

		boolean flag = registerService.deleteRegister(Integer.valueOf(rId));
		
		if(flag){
			return "success";
		} else {
			return "error";
		}
	}
}
