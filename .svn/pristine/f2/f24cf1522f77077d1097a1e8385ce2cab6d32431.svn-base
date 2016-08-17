package scau.com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scau.com.entity.FixedRuleEntity;
import scau.com.service.IFixedRuleService;
import scau.com.service.impl.FixedRuleServiceImpl;

/**
 * 固定值规则控制类
 * @author Administrator
 *
 */
@WebServlet("/fixedRuleServlet")
public class FixedRuleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// doGet()
	// doPost()
	// service()
	public void service(HttpServletRequest request, HttpServletResponse response) {
		/**
		 * 通过使用你访问时候传入的参数来判断执行的操作
		 */

		// 获取参数
		String type = request.getParameter("type");

		if ("addSave".equals(type)) // 保存
		{
			save(request, response);
			
		}
		
		// 编辑加载数据
		if ("edit".equals(type)) {
			loadEdit(request, response);
		}
		
		// 查询
		if ("query".equals(type)) {
			queryFixedRule(request, response);
		}

		//查看
		if("view".equals(type))
		{
			viewFixedRule(request, response);
		}
		
		// 编辑后保存
		if ("editSave".equals(type)) {
			editSaveFixedRule(request, response);
		}

		// 删除
		if ("del".equals(type)) {
			deleteFixedRule(request, response);
		}
		
		}
	public void save(HttpServletRequest request, HttpServletResponse response) {
		// 获取页面数据
		String fRuleId = request.getParameter("FRuleId"); // 用户名
		String fRuleName = request.getParameter("FRuleName");
		String fr_salary = request.getParameter("FR_salary");

		// 实例化对象
		FixedRuleServiceImpl fixedRuleService = new FixedRuleServiceImpl();


		// 2 javaBean传递参数
		FixedRuleEntity fixedRuleEntity = new FixedRuleEntity();
		//Integer.valueOf(age)
		fixedRuleEntity.setRuleId(fRuleId);
		fixedRuleEntity.setName(fRuleName);
		fixedRuleEntity.setSalary(fr_salary);

		boolean flag = fixedRuleService.saveFixedRule(fixedRuleEntity);
		if (flag) {
			try {
				request.getRequestDispatcher("fixedRuleServlet?type=query").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	/**
	 * 编辑加载数据
	 * 
	 * @param request
	 * @param response
	 */
	private void loadEdit(HttpServletRequest request, HttpServletResponse response) {

		// 获取主键rule_id
		String ruleid = request.getParameter("ruleid");

		// 实例化对象
		FixedRuleServiceImpl fixedRuleService = new FixedRuleServiceImpl();
		FixedRuleEntity fixedRuleEntity = fixedRuleService.getFixedRuleInfoById(ruleid);

		request.setAttribute("FREntity", fixedRuleEntity);
		try {
			request.getRequestDispatcher("/BackSite/FixedRuleDetailUpdate.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
  /**
  * 查看
  * @param request
  * @param response
  */
	private void viewFixedRule(HttpServletRequest request, HttpServletResponse response) {
      //获取主键rule_id
		String ruleid=request.getParameter("ruleid");
		FixedRuleServiceImpl fixedRuleService = new FixedRuleServiceImpl();
		FixedRuleEntity  fixedRuleEntity=  fixedRuleService.getFixedRuleInfoById(ruleid);
		
		
		request.setAttribute("FREntity", fixedRuleEntity);
		
		try {
			request.getRequestDispatcher("/BackSite/FixedRuleDetail.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 删除
	 * 
	 * @param request
	 * @param response
	 */
	private void deleteFixedRule(HttpServletRequest request, HttpServletResponse response) {
		String ruleid=request.getParameter("ruleid");
		// 实例化对象
		FixedRuleServiceImpl fixedRuleService = new FixedRuleServiceImpl();

		boolean flag = fixedRuleService.deleteFixedRule(ruleid);
		if (flag) {
			try {
				request.getRequestDispatcher("fixedRuleServlet?type=query").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 编辑保存信息
	 * 
	 * @param request
	 * @param response
	 */
	private void editSaveFixedRule(HttpServletRequest request, HttpServletResponse response) {

		// 获取页面数据
		String ruleid = request.getParameter("ruleid"); // 规则编号
		String rulename = request.getParameter("rulename");// 规则名称
		String salary = request.getParameter("salary");//对应金额

		// 实例化对象
		FixedRuleServiceImpl fixedRuleService = new FixedRuleServiceImpl();

		// 2 javaBean传递参数
		FixedRuleEntity fixedRuleEntity = new FixedRuleEntity();

		fixedRuleEntity.setRuleId(ruleid);
		fixedRuleEntity.setName(rulename);
		fixedRuleEntity.setSalary(salary);

		boolean flag = fixedRuleService.updateFixedRule(fixedRuleEntity);
		if (flag) {
			try {
				request.getRequestDispatcher("fixedRuleServlet?type=query").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	/**
	 * 查询
	 */
	public void queryFixedRule(HttpServletRequest request, HttpServletResponse response) {

		// 获取查询的条件
		String frId = "";
		try {
			frId = request.getParameter("ruleid");
		} catch (Exception ex) {
			frId = "";
		}
		//System.out.println("frid:"+frId);

		List<FixedRuleEntity> fixedRuleList = new ArrayList<FixedRuleEntity>();
		// 实例化对象
		FixedRuleServiceImpl fixedRuleService = new FixedRuleServiceImpl();
		// userList = userService.queryUserInfo();
		fixedRuleList = fixedRuleService.queryFixedRuleInfo(frId);

		request.setAttribute("frList", fixedRuleList); // 把数据集放在request对象中
		request.setAttribute("ruleid", frId);
		

			//System.out.println("frlist_size:"+fixedRuleList.size());
		try {
			// 通过转发的方式跳到jsp页面
			request.getRequestDispatcher("/BackSite/FixedRuleList.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}



///**
// * 用户处理控制类
// */
//public class UserServlet extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	// doGet()
//	// doPost()
//	// service()
//
//	public void service(HttpServletRequest request, HttpServletResponse response) {
//		/**
//		 * 通过使用你访问时候传入的参数来判断执行的操作
//		 */
//
//		// 获取参数
//		String type = request.getParameter("type");
//
//		if ("addSave".equals(type)) // 保存
//		{
//			save(request, response);
//		}
//
//		// 查询
//		if ("query".equals(type)) {
//			queryUser(request, response);
//		}
//
//		// 编辑加载数据
//		if ("edit".equals(type)) {
//			loadEdit(request, response);
//		}
//
//		//查看
//		if("view".equals(type))
//		{
//			viewUser(request, response);
//		}
//		
//		// 编辑后保存
//		if ("editSave".equals(type)) {
//			editSaveUser(request, response);
//		}
//
//		// 删除
//		if ("del".equals(type)) {
//			deleteUser(request, response);
//		}
//
//	}
//    /**
//     * 查看
//     * @param request
//     * @param response
//     */
//	private void viewUser(HttpServletRequest request, HttpServletResponse response) {
//         //获取主键id
//		String userid=request.getParameter("userid");
//		IUserService iuserService=new UserServiceImpl();
//		UserEntity  userEntity=  iuserService.getUserInfoById(Integer.valueOf(userid));
//		
//		
//		request.setAttribute("uEntity", userEntity);
//		
//		try {
//			request.getRequestDispatcher("viewUser.jsp").forward(request, response);
//		} catch (ServletException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * 删除
//	 * 
//	 * @param request
//	 * @param response
//	 */
//	private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
//		String userid = request.getParameter("userid");
//		// 实例化对象
//		IUserService userService = new UserServiceImpl();
//
//		boolean flag = userService.deleteUser(Integer.valueOf(userid));
//		if (flag) {
//			try {
//				request.getRequestDispatcher("userServlet?type=query").forward(request, response);
//			} catch (ServletException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	/**
//	 * 编辑保存信息
//	 * 
//	 * @param request
//	 * @param response
//	 */
//	private void editSaveUser(HttpServletRequest request, HttpServletResponse response) {
//
//		// 获取页面数据
//		String uName = request.getParameter("username"); // 用户名
//		String age = request.getParameter("age");
//		String userid = request.getParameter("userid");
//
//		// 实例化对象
//		IUserService userService = new UserServiceImpl();
//
//		// 2 javaBean传递参数
//		UserEntity userEntity = new UserEntity();
//
//		userEntity.setAge(Integer.valueOf(age));
//		userEntity.setUsername(uName);
//		userEntity.setUserid(Integer.valueOf(userid));
//
//		boolean flag = userService.updateUser(userEntity);
//		if (flag) {
//			try {
//				request.getRequestDispatcher("userServlet?type=query").forward(request, response);
//			} catch (ServletException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	/**
//	 * 编辑加载数据
//	 * 
//	 * @param request
//	 * @param response
//	 */
//	private void loadEdit(HttpServletRequest request, HttpServletResponse response) {
//
//		// 获取主键id
//		String id = request.getParameter("userid");
//
//		// 实例化对象
//		IUserService userService = new UserServiceImpl();
//		UserEntity userEntity = userService.getUserInfoById(Integer.valueOf(id));
//
//		request.setAttribute("uEntity", userEntity);
//		try {
//			request.getRequestDispatcher("editUser.jsp").forward(request, response);
//		} catch (ServletException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * 保存
//	 * 
//	 * @param request
//	 * @param response
//	 */
//	public void save(HttpServletRequest request, HttpServletResponse response) {
//		// 获取页面数据
//		String uName = request.getParameter("username"); // 用户名
//		String age = request.getParameter("age");
//		String pwd = request.getParameter("password");
//
//		// 实例化对象
//		IUserService userService = new UserServiceImpl();
//		// 1 单个传递参数
//		// userService.saveUser(uName, lName, pwd);
//
//		// 2 javaBean传递参数
//		UserEntity userEntity = new UserEntity();
//
//		userEntity.setAge(Integer.valueOf(age));
//		userEntity.setPassword(pwd);
//		userEntity.setUsername(uName);
//
//		boolean flag = userService.saveUser(userEntity);
//		if (flag) {
//			try {
//				request.getRequestDispatcher("userServlet?type=query").forward(request, response);
//			} catch (ServletException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	/**
//	 * 查询
//	 */
//	public void queryUser(HttpServletRequest request, HttpServletResponse response) {
//
//		// 获取查询的条件
//		String uName = "";
//		try {
//			uName = request.getParameter("uname");
//		} catch (Exception ex) {
//			uName = "";
//		}
//
//		List<UserEntity> userList = new ArrayList<UserEntity>();
//		// 实例化对象
//		IUserService userService = new UserServiceImpl();
//		// userList = userService.queryUserInfo();
//		userList = userService.queryUserInfo(uName);
//
//		request.setAttribute("uList", userList); // 把数据集放在request对象中
//		request.setAttribute("uname", uName);
//		try {
//			// 通过转发的方式跳到jsp页面
//			request.getRequestDispatcher("listUser.jsp").forward(request, response);
//		} catch (ServletException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}