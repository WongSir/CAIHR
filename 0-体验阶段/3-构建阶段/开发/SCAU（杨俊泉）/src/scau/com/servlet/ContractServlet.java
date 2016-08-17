package scau.com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scau.com.entity.ContractEntity;
import scau.com.service.IContractService;
import scau.com.service.impl.ContractServiceImpl;

@WebServlet("/ContractServlet")
public class ContractServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContractServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String type = request.getParameter("type");

		if ("add".equals(type)) // 保存
		{
			save(request, response);
		}
		//
		// 查询
		if ("query".equals(type)) {
			queryContract(request, response);
		}
		//
		// // 编辑加载数据
		if ("edit".equals(type)) {
			loadEdit(request, response);
		}
		//
		// //查看
		// if("view".equals(type))
		// {
		// viewUser(request, response);
		// }
		//
		// // 编辑后保存
		if ("editsave".equals(type)) {
			editContract(request, response);
		}

		// 删除
		if ("delete".equals(type)) {
			deleteContract(request, response);
		}

	}

	private void loadEdit(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");

		// 实例化对象
		IContractService contractService = new ContractServiceImpl();
		ContractEntity contractEntity = contractService.getContractInfoById(Integer.valueOf(id));

		request.setAttribute("cEntity", contractEntity);
		try {
			request.getRequestDispatcher("BackSite/ModifiedEmployeeContract.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void editContract(HttpServletRequest request, HttpServletResponse response) {
		// 获取页面数据
		String id = request.getParameter("id");
		String contractName = request.getParameter("contractName");
		String contractNumber = request.getParameter("contractNumber");
		String dateOfSignment = request.getParameter("dateOfSignment");
		String expirtDate = request.getParameter("expirtDate");
		String partyA = request.getParameter("partyA");
		String partyB = request.getParameter("partyB");
		String note = request.getParameter("note");
		String contractStatus = request.getParameter("contractStatus");

		// 实例化对象
		IContractService contractService = new ContractServiceImpl();

		// 2 javaBean传递参数
		ContractEntity contractEntity = new ContractEntity();
		contractEntity.setId(Integer.valueOf(id));
		contractEntity.setContractName(contractName);
		contractEntity.setContractNumber(contractNumber);
		contractEntity.setContractStatus(contractStatus);
		contractEntity.setDateOfSignment(dateOfSignment);
		contractEntity.setExpirtDate(expirtDate);
		contractEntity.setNote(note);
		contractEntity.setPartyA(partyA);
		contractEntity.setPartyB(partyB);

		boolean flag = contractService.updateContract(contractEntity);
		if (flag) {
			try {
				request.getRequestDispatcher("ContractServlet?type=query").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private void queryContract(HttpServletRequest request, HttpServletResponse response) {
		// 获取查询的条件
		String cName = "";
		try {
			cName = request.getParameter("cName");
		} catch (Exception ex) {
			cName = "";
		}

		List<ContractEntity> contractList = new ArrayList<ContractEntity>();
		// 实例化对象
		IContractService contractService = new ContractServiceImpl();
		// userList = userService.queryUserInfo();
		contractList = contractService.queryContractInfo(cName);

		request.setAttribute("cList", contractList); // 把数据集放在request对象中
		request.setAttribute("cName", cName);
		try {
			// 通过转发的方式跳到jsp页面
			request.getRequestDispatcher("BackSite/ListContract.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void save(HttpServletRequest request, HttpServletResponse response) {
		String contractName = request.getParameter("contractName");
		String contractNumber = request.getParameter("contractNumber");
		String dateOfSignment = request.getParameter("dateOfSignment");
		String expirtDate = request.getParameter("expirtDate");
		String partyA = request.getParameter("partyA");
		String partyB = request.getParameter("partyB");
		String note = request.getParameter("note");
		String contractStatus = request.getParameter("contractStatus");

		// 实例化对象
		IContractService contractService = new ContractServiceImpl();
		// 1 单个传递参数
		// userService.saveUser(uName, lName, pwd);

		// 2 javaBean传递参数
		ContractEntity contractEntity = new ContractEntity();

		contractEntity.setContractName(contractName);
		contractEntity.setContractNumber(contractNumber);
		contractEntity.setContractStatus(contractStatus);
		contractEntity.setDateOfSignment(dateOfSignment);
		contractEntity.setExpirtDate(expirtDate);
		contractEntity.setNote(note);
		contractEntity.setPartyA(partyA);
		contractEntity.setPartyB(partyB);

		boolean flag = contractService.saveContrct(contractEntity);
		System.out.println("添加员工合同信息: " + flag);

		queryContract(request, response);
	}

	private void deleteContract(HttpServletRequest request, HttpServletResponse response) {
		String contractid = request.getParameter("id");
		// 实例化对象
		IContractService contractService = new ContractServiceImpl();

		boolean flag = contractService.deleteContract(Integer.valueOf(contractid));
		if (flag) {
			try {
				request.getRequestDispatcher("ContractServlet?type=query").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
