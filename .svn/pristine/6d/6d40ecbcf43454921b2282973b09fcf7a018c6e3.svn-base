package scau.com.dao;

import java.util.ArrayList;
import java.util.List;

import scau.com.entity.FixedRuleEntity;
import scau.com.util.DBUtil;

/**
 * 固定值规则数据处理类
 */

public class FixedRuleDao {
	/**
	 * 保存规则信息
	 * @param fixedRuleEntity
	 * @return
	 */
	public boolean saveFixedRule(FixedRuleEntity fixedRuleEntity) {
		// insert into sql语句
		String insertStr = " insert into fixed_salary_rule (rule_id,name,salary) values (?,?,?)";

		List<Object> paras = new ArrayList<Object>();
		paras.add(fixedRuleEntity.getRuleId());
		paras.add(fixedRuleEntity.getName());
		paras.add(fixedRuleEntity.getSalary());

		// 实例化数据处理公共类
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(insertStr, paras);

		return flag;
	}
	
	/**
	 * 编辑规则信息
	 * @param fixedRuleEntity
	 * @return
	 */
	public boolean updateFixedRule(FixedRuleEntity fixedRuleEntity) {
		// sql
		String sqlUpdate = "update fixed_salary_rule set rule_id=?,name=?,salary=? where rule_id=? ";

		// 参数
		List<Object> paras = new ArrayList<Object>();
		paras.add(fixedRuleEntity.getRuleId());
		paras.add(fixedRuleEntity.getName());
		paras.add(fixedRuleEntity.getSalary());
		paras.add(fixedRuleEntity.getRuleId());	

		// 实例化数据处理公共类
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(sqlUpdate, paras);

		return flag;
	}
	
	/**
	 * 根据用户的主键rule_id查询固定值规则信息
	 * 
	 * @param ruleid
	 * @return
	 */
	public FixedRuleEntity findByRuleId(String ruleid) {
		// sql
		String strSelect = "select rule_id,name,salary from fixed_salary_rule where rule_id=? ";

		// 参数
		List<Object> paras = new ArrayList<Object>();
		paras.add(ruleid);

		DBUtil dbUtil = new DBUtil();
		FixedRuleEntity fixedRuleEntity = dbUtil.FindByCondition(strSelect, paras, FixedRuleEntity.class);
		return fixedRuleEntity;
	}
	
	/**
	 * 查询固定值规则信息
	 * 
	 * @return List<FixedRuleEntity> 固定值规则信息集合
	 */
	public List<FixedRuleEntity> queryFixedRule() {
		// select语句
		String strQuery = " select rule_id,name,salary from fixed_salary_rule ";
		List<Object> paras = new ArrayList<Object>();

		List<FixedRuleEntity> fixedRuleList = new ArrayList<FixedRuleEntity>();

		DBUtil dbUtil = new DBUtil();
		fixedRuleList = dbUtil.QueryInfoByCondition(strQuery, paras, FixedRuleEntity.class);
		return fixedRuleList;
	}

	/**
	 * 查询固定值规则信息 带条件
	 * 
	 * @return List<FixedRuleEntity> 固定值规则信息集合
	 */
	public List<FixedRuleEntity> queryFixedRule(String ruleid) {
		// select语句
		StringBuilder sb = new StringBuilder();

		sb.append(" select rule_id,name,salary from fixed_salary_rule where 1=1 ");

		List<Object> paras = new ArrayList<Object>();
		if (ruleid != null && !"".equals(ruleid)) {
			sb.append(" and rule_id like ?");
			paras.add("%" + ruleid + "%");
		}

		List<FixedRuleEntity> fixedRuleList = new ArrayList<FixedRuleEntity>();

		DBUtil dbUtil = new DBUtil();
		fixedRuleList = dbUtil.QueryInfoByCondition(sb.toString(), paras, FixedRuleEntity.class);
		return fixedRuleList;
	}

	/**
	 * 删除
	 * 
	 * @param userid
	 * @return
	 */
	public boolean deleteFixedRuleById(String ruleid) {
		// sql
		String strDel = " delete from fixed_salary_rule where rule_id=? ";

		// 参数
		List<Object> paras = new ArrayList<Object>();
		paras.add(ruleid);

		// 实例化数据处理公共类
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(strDel, paras);

		return flag;
	}
}


//public class UserDao {
//
//	/**
//	 * 修改保存用户
//	 * 
//	 * @param userEntity
//	 * @return
//	 */
//	public boolean updateUser(UserEntity userEntity) {
//		// sql
//		String sqlUpdate = "update userinfo set username=?,age=? where userid=? ";
//
//		// 参数
//		List<Object> paras = new ArrayList<Object>();
//		paras.add(userEntity.getUsername());
//		paras.add(userEntity.getAge());
//		paras.add(userEntity.getUserid());
//
//		// 实例化数据处理公共类
//		DBUtil dbUtil = new DBUtil();
//		boolean flag = false;
//		flag = dbUtil.InsertUpdateDeleteExcute(sqlUpdate, paras);
//
//		return flag;
//	}
//
//	/**
//	 * 保存用户信息
//	 * 
//	 * @param userEntity
//	 */
//	public boolean saveUser(UserEntity userEntity) {
//		// insert into sql语句
//		String insertStr = " insert into userinfo (username,age,password) values (?,?,?)";
//
//		List<Object> paras = new ArrayList<Object>();
//		paras.add(userEntity.getUsername());
//		paras.add(userEntity.getAge());
//		paras.add(userEntity.getPassword());
//
//		// 实例化数据处理公共类
//		DBUtil dbUtil = new DBUtil();
//		boolean flag = false;
//		flag = dbUtil.InsertUpdateDeleteExcute(insertStr, paras);
//
//		return flag;
//	}
//
//	/**
//	 * 查询用户信息
//	 * 
//	 * @return List<UserEntity> 用户信息集合
//	 */
//	public List<UserEntity> queryUser() {
//		// select语句
//		String strQuery = " select userid,username,age,password from userinfo ";
//		List<Object> paras = new ArrayList<Object>();
//
//		List<UserEntity> userList = new ArrayList<UserEntity>();
//
//		DBUtil dbUtil = new DBUtil();
//		userList = dbUtil.QueryInfoByCondition(strQuery, paras, UserEntity.class);
//		return userList;
//	}
//
//	/**
//	 * 查询用户信息 带条件
//	 * 
//	 * @return List<UserEntity> 用户信息集合
//	 */
//	public List<UserEntity> queryUser(String userName) {
//		// select语句
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(" select userid,username,age,password from userinfo where 1=1 ");
//
//		List<Object> paras = new ArrayList<Object>();
//		if (userName != null && !"".equals(userName)) {
//			sb.append(" and username like ?");
//			paras.add("%" + userName + "%");
//		}
//
//		List<UserEntity> userList = new ArrayList<UserEntity>();
//
//		DBUtil dbUtil = new DBUtil();
//		userList = dbUtil.QueryInfoByCondition(sb.toString(), paras, UserEntity.class);
//		return userList;
//	}
//
//	/**
//	 * 删除
//	 * 
//	 * @param userid
//	 * @return
//	 */
//	public boolean deleteUserById(int userid) {
//		// sql
//		String strDel = " delete from userinfo where userid=? ";
//
//		// 参数
//		List<Object> paras = new ArrayList<Object>();
//		paras.add(userid);
//
//		// 实例化数据处理公共类
//		DBUtil dbUtil = new DBUtil();
//		boolean flag = false;
//		flag = dbUtil.InsertUpdateDeleteExcute(strDel, paras);
//
//		return flag;
//	}
//
//	/**
//	 * 更据用户的主键id查询用户信息
//	 * 
//	 * @param userid
//	 * @return
//	 */
//	public UserEntity findById(int userid) {
//		// sql
//		String strSelect = "select userid,username,age,password from userinfo where userid=? ";
//
//		// 参数
//		List<Object> paras = new ArrayList<Object>();
//		paras.add(userid);
//
//		DBUtil dbUtil = new DBUtil();
//		UserEntity userEntity = dbUtil.FindByCondition(strSelect, paras, UserEntity.class);
//		return userEntity;
//	}
//
//}
