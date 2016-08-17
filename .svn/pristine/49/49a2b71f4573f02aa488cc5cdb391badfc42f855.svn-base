package scau.com.service;

import java.util.List;

import scau.com.entity.ContractEntity;

public interface IContractService {
    public void saveContract(String contractName, String contractNumber, String dateOfSignment, String expireDate,
			String partyA, String partyB, String note, String contractStatus);
    public boolean saveContrct(ContractEntity contractEntity);
	public List<ContractEntity> queryContractInfo(String cName);
	public boolean deleteContract(Integer valueOf);
	public ContractEntity getContractInfoById(Integer valueOf);
	public boolean updateContract(ContractEntity contractEntity);
}
