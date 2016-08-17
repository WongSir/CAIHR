package scau.com.dao;

import java.util.ArrayList;
import java.util.List;

import scau.com.entity.CalculateRuleEntity;
import scau.com.util.DBUtil;

public class CalculateRuleDao {
	/**
	 * 保存规则信息
	 * @param fixedRuleEntity
	 * @return
	 */
	public boolean saveRule(CalculateRuleEntity calculateRuleEntity) {
		// insert into sql语句
		String insertStr = " insert into cal_salary_rule (rule_id,name,formula) values (?,?,?)";

		List<Object> paras = new ArrayList<Object>();
		paras.add(calculateRuleEntity.getRuleId());
		paras.add(calculateRuleEntity.getRuleName());
		paras.add(calculateRuleEntity.getFormula());

		// 实例化数据处理公共类
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(insertStr, paras);

		return flag;
	}
}
