package scau.com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scau.com.entity.UserEntity;
import scau.com.service.IUserService;
import scau.com.service.impl.UserServiceImpl;

/**
 * 用户处理控制类
 */
public class UserServlet extends HttpServlet {

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

		// 查询
		if ("query".equals(type)) {
			queryUser(request, response);
		}

		// 编辑加载数据
		if ("edit".equals(type)) {
			loadEdit(request, response);
		}

		//查看
		if("view".equals(type))
		{
			viewUser(request, response);
		}
		
		// 编辑后保存
		if ("editSave".equals(type)) {
			editSaveUser(request, response);
		}

		// 删除
		if ("del".equals(type)) {
			deleteUser(request, response);
		}

	}
    /**
     * 查看
     * @param request
     * @param response
     */
	private void viewUser(HttpServletRequest request, HttpServletResponse response) {
         //获取主键id
		String userid=request.getParameter("userid");
		IUserService iuserService=new UserServiceImpl();
		UserEntity  userEntity=  iuserService.getUserInfoById(Integer.valueOf(userid));
		
		
		request.setAttribute("uEntity", userEntity);
		
		try {
			request.getRequestDispatcher("viewUser.jsp").forward(request, response);
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
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
		String userid = request.getParameter("userid");
		// 实例化对象
		IUserService userService = new UserServiceImpl();

		boolean flag = userService.deleteUser(Integer.valueOf(userid));
		if (flag) {
			try {
				request.getRequestDispatcher("userServlet?type=query").forward(request, response);
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
	private void editSaveUser(HttpServletRequest request, HttpServletResponse response) {

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
		if (flag) {
			try {
				request.getRequestDispatcher("userServlet?type=query").forward(request, response);
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

		// 获取主键id
		String id = request.getParameter("userid");

		// 实例化对象
		IUserService userService = new UserServiceImpl();
		UserEntity userEntity = userService.getUserInfoById(Integer.valueOf(id));

		request.setAttribute("uEntity", userEntity);
		try {
			request.getRequestDispatcher("editUser.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 保存
	 * 
	 * @param request
	 * @param response
	 */
	public void save(HttpServletRequest request, HttpServletResponse response) {
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
		if (flag) {
			try {
				request.getRequestDispatcher("userServlet?type=query").forward(request, response);
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
	public void queryUser(HttpServletRequest request, HttpServletResponse response) {

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
		try {
			// 通过转发的方式跳到jsp页面
			request.getRequestDispatcher("listUser.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
