package scau.com.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import scau.com.entity.UserEntity;
import scau.com.service.IUserService;
import scau.com.service.impl.UserServiceImpl;

public class UserAction {
	
	
	
	public String addUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取页面数据
		String uName = request.getParameter("username"); // 用户名
		String age = request.getParameter("age");
		String pwd = request.getParameter("password");
		
		// 实例化对象
		IUserService userService = new UserServiceImpl();
		// 1 单个传递参数
		// userService.saveUser(uName, lName, pwd);

		// 2 javaBean传递参数
		UserEntity userEntity = new UserEntity();

		userEntity.setAge(Integer.valueOf(age));
		userEntity.setPassword(pwd);
		userEntity.setUsername(uName);

		boolean flag = userService.saveUser(userEntity);
		if(flag){
			return "success";
		} else {
			return "error";
		}
		
	}
	
	public String queryUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取查询的条件
		String uName = "";
		try {
			uName = request.getParameter("uname");
		} catch (Exception ex) {
			uName = "";
		}

		List<UserEntity> userList = new ArrayList<UserEntity>();
		// 实例化对象
		IUserService userService = new UserServiceImpl();
		// userList = userService.queryUserInfo();
		userList = userService.queryUserInfo(uName);

		request.setAttribute("uList", userList); // 把数据集放在request对象中
		request.setAttribute("uname", uName);

		return "success";
	}
	
	
	public String delUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String userid = request.getParameter("userid");
		// 实例化对象
		IUserService userService = new UserServiceImpl();

		boolean flag = userService.deleteUser(Integer.valueOf(userid));
		
		if(flag){
			return "success";
		} else {
			return "error";
		}
	}
	
	public String goEditUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取主键id
		String id = request.getParameter("userid");

		// 实例化对象
		IUserService userService = new UserServiceImpl();
		UserEntity userEntity = userService.getUserInfoById(Integer.valueOf(id));

		request.setAttribute("uEntity", userEntity);
		return "success";
	}
	
	public String editUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取页面数据
		String uName = request.getParameter("username"); // 用户名
		String age = request.getParameter("age");
		String userid = request.getParameter("userid");

		// 实例化对象
		IUserService userService = new UserServiceImpl();

		// 2 javaBean传递参数
		UserEntity userEntity = new UserEntity();

		userEntity.setAge(Integer.valueOf(age));
		userEntity.setUsername(uName);
		userEntity.setUserid(Integer.valueOf(userid));

		boolean flag = userService.updateUser(userEntity);
		if(flag){
			return "success";
		} else {
			return "error";
		}
		
	}
}
