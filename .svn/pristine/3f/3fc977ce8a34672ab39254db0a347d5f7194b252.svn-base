package scau.com.service.impl;

import java.util.List;

import scau.com.dao.ContractDao;
import scau.com.entity.ContractEntity;
import scau.com.service.IContractService;

public class ContractServiceImpl implements IContractService{

	@Override
	public void saveContract(String contractName, String contractNumber, String dateOfSignment, String expireDate,
			String partyA, String partyB, String note, String contractStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean saveContrct(ContractEntity contractEntity) {
		ContractDao contractDao=new ContractDao();
		return contractDao.saveContractInfo(contractEntity);
	}

	@Override
	public List<ContractEntity> queryContractInfo(String cName) {
		ContractDao contractDao=new ContractDao();
		return 	contractDao.queryContract();
	}

	@Override
	public boolean deleteContract(Integer contractid) {
		ContractDao contractDao=new ContractDao();
		return contractDao.deleteContractById(contractid);
	}

	@Override
	public ContractEntity getContractInfoById(Integer id) {
		ContractDao contractDao=new ContractDao();
		return contractDao.findById(id);
	}

	@Override
	public boolean updateContract(ContractEntity contractEntity) {
		ContractDao contractDao=new ContractDao();
		return contractDao.updateContract(contractEntity);
	}

}
