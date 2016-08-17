package scau.com.entity;

public class ContractEntity {
	private String contractName;
	private String contractNumber;
	private String dateOfSignment;
	private String expirtDate;
	private String partyA;
	private String partyB;
	private String note;
	private String contractStatus;
	private int id;

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getDateOfSignment() {
		return dateOfSignment;
	}

	public void setDateOfSignment(String dateOfSignment) {
		this.dateOfSignment = dateOfSignment;
	}

	public String getExpirtDate() {
		return expirtDate;
	}

	public void setExpirtDate(String expirtDate) {
		this.expirtDate = expirtDate;
	}

	public String getPartyA() {
		return partyA;
	}

	public void setPartyA(String partyA) {
		this.partyA = partyA;
	}

	public String getPartyB() {
		return partyB;
	}

	public void setPartyB(String partyB) {
		this.partyB = partyB;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ContractEntity(String contractName, String contractNumber, String dateOfSignment, String expirtDate,
			String partyA, String partyB, String note, String contractStatus) {
		super();
		this.contractName = contractName;
		this.contractNumber = contractNumber;
		this.dateOfSignment = dateOfSignment;
		this.expirtDate = expirtDate;
		this.partyA = partyA;
		this.partyB = partyB;
		this.note = note;
		this.contractStatus = contractStatus;
	}

	public ContractEntity() {
	};
}
