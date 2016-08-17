package scau.com.entity;

/**
 * 固定值规则实体类
 * @author Administrator
 *
 */
public class FixedRuleEntity {
	
	private int id;   //id
	private String ruleId;   //规则编号
	private String name;   //规则名
	private String salary;  //对应金额 
	private int isDel;  //是否删除
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
