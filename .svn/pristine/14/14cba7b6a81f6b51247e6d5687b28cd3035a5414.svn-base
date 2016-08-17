package scau.com.dao;

import java.util.ArrayList;
import java.util.List;

import scau.com.entity.ContractEntity;
import scau.com.util.DBUtil;

public class ContractDao {
	public boolean saveContractInfo(ContractEntity contractEntity) {

		String insertStr = " insert into em_contra_info (contract_name,contract_number,date_of_signment,expirt_date,party_a,party_b,note,contract_status) values (?,?,?,?,?,?,?,?)";

		List<Object> paras = new ArrayList<Object>();
		paras.add(contractEntity.getContractName());
		paras.add(contractEntity.getContractNumber());
		paras.add(contractEntity.getDateOfSignment());
		paras.add(contractEntity.getExpirtDate());
		paras.add(contractEntity.getPartyA());
		paras.add(contractEntity.getPartyB());
		paras.add(contractEntity.getNote());
		paras.add(contractEntity.getContractStatus());

		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(insertStr, paras);

		return flag;
	}

	public List<ContractEntity> queryContract() {
		// select语句
		String strQuery = " select id,contract_name,contract_number,date_of_signment,expirt_date,party_a,party_b,note,contract_status from em_contra_info ";
		List<Object> paras = new ArrayList<Object>();

		List<ContractEntity> contractList = new ArrayList<ContractEntity>();

		DBUtil dbUtil = new DBUtil();
		contractList = dbUtil.QueryInfoByCondition(strQuery, paras, ContractEntity.class);
		return contractList;
	}

	public boolean deleteContractById(Integer contractid) {
		String strDel = " delete from  em_contra_info where id=? ";

		// 参数
		List<Object> paras = new ArrayList<Object>();
		paras.add(contractid);

		// 实例化数据处理公共类
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(strDel, paras);

		return flag;
	}

	public ContractEntity findById(Integer id) {
		String strSelect = " select id,contract_name,contract_number,date_of_signment,expirt_date,party_a,party_b,note,contract_status from em_contra_info where id=?";

		// 参数
		List<Object> paras = new ArrayList<Object>();
		paras.add(id);

		DBUtil dbUtil = new DBUtil();
		ContractEntity contractEntity = dbUtil.FindByCondition(strSelect, paras, ContractEntity.class);
		return contractEntity;
	}

	public boolean updateContract(ContractEntity contractEntity) {
		String sqlUpdate = "update em_contra_info set id=?,contract_name=?,contract_number=?,date_of_signment=?,expirt_date=?,party_a=?,party_b=?,note=?,contract_status=? where id=? ";

		// 参数
		List<Object> paras = new ArrayList<Object>();
		paras.add(contractEntity.getId());
		paras.add(contractEntity.getContractName());
		paras.add(contractEntity.getContractNumber());
		paras.add(contractEntity.getDateOfSignment());
		paras.add(contractEntity.getExpirtDate());
		paras.add(contractEntity.getPartyA());
		paras.add(contractEntity.getPartyB());
		paras.add(contractEntity.getNote());
		paras.add(contractEntity.getContractStatus());
		paras.add(contractEntity.getId());
		
		// 实例化数据处理公共类
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(sqlUpdate, paras);

		return flag;
	}
}
