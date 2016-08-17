package scau.com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

import scau.com.entity.ContractEntity;
import scau.com.service.IContractService;
import scau.com.service.impl.ContractServiceImpl;

public class ContractAction implements Action {

	public String addContract() {
		HttpServletRequest request = ServletActionContext.getRequest();
		// 获取页面数据
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

		if (flag) {
			return "success";
		} else {
			return "error";
		}

	}

	public String deleteContract() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String contractid = request.getParameter("id");
		// 实例化对象
		IContractService contractService = new ContractServiceImpl();

		boolean flag = contractService.deleteContract(Integer.valueOf(contractid));
		if (flag) {
			return "success";
		}
		return "fail";
	}

	public String loadContract() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");

		// 实例化对象
		IContractService contractService = new ContractServiceImpl();
		ContractEntity contractEntity = contractService.getContractInfoById(Integer.valueOf(id));

		request.setAttribute("cEntity", contractEntity);
		return "success";
	}

	public String modifiedContract() {
		HttpServletRequest request = ServletActionContext.getRequest();
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
			return "success";
		} else {
			return "error";
		}

	}

	public String queryContract() {
		HttpServletRequest request = ServletActionContext.getRequest();
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

		return "success";
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
