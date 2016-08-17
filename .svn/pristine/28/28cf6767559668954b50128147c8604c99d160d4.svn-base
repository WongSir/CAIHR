package scau.com.service.impl;

import java.util.List;

import scau.com.dao.FixedRuleDao;
import scau.com.entity.FixedRuleEntity;
import scau.com.service.IFixedRuleService;

/**
 * 固定值规则业务处理实现类
 */
public class FixedRuleServiceImpl implements IFixedRuleService{

	/**
	 * 保存固定值规则
	 * @param fixedRuleEntity   固定值规则对象实体
	 */
	@Override
	public boolean saveFixedRule(FixedRuleEntity fixedRuleEntity) {
		
		FixedRuleDao fixedRuleDao=new FixedRuleDao();
		return fixedRuleDao.saveFixedRule(fixedRuleEntity);
	}
	
	/**
	 * 编辑固定值规则
	 * @param fixedRuleEntity
	 * @return
	 */
	@Override
	public boolean updateFixedRule(FixedRuleEntity fixedRuleEntity)
	{
		FixedRuleDao fixedRuleDao=new FixedRuleDao();
		return fixedRuleDao.updateFixedRule(fixedRuleEntity);
	}
	
	/**
	 * 根据固定值规则的主键rule_id查询用户信息
	 * @param ruleid
	 */
	public FixedRuleEntity getFixedRuleInfoById(String ruleid)
	{
		FixedRuleDao fixedRuleDao=new FixedRuleDao();
		return fixedRuleDao.findByRuleId(ruleid);
	}
	
	/**
	 * 查询固定值规则信息
	 * @return
	 */
	public List<FixedRuleEntity> queryFixedRuleInfo()
	{
		FixedRuleDao fixedRuleDao=new FixedRuleDao();
		return fixedRuleDao.queryFixedRule();
	}
	
	/**
	 * 查询固定值规则信息带条件
	 * @return
	 */
	public List<FixedRuleEntity> queryFixedRuleInfo(String ruleid)
	{
		FixedRuleDao fixedRuleDao=new FixedRuleDao();
		return fixedRuleDao.queryFixedRule(ruleid);
	}
	
	
	/**
	 * 删除
	 * @param ruleid
	 * @return
	 */
	public boolean deleteFixedRule(String ruleid)
	{
		FixedRuleDao fixedRuleDao=new FixedRuleDao();
		return fixedRuleDao.deleteFixedRuleById(ruleid);
	}


}




//public class UserServiceImpl implements IUserService {
//
//	/**
//	 * 保存用户
//	 * @param userName   姓名
//	 * @param loginName  登陆名
//	 * @param pwd   密码
//	 */
//	@Override
//	public void saveUser(String userName, String loginName, String pwd) {
//		
//		
//	}
//
//	/**
//	 * 保存用户
//	 * @param userEntity   用户对象实体
//	 */
//	@Override
//	public boolean saveUser(UserEntity userEntity) {
//		
//		UserDao userDao=new UserDao();
//		return userDao.saveUser(userEntity);
//	}
//	
//	/**
//	 * 修改保存用户
//	 * @param userEntity   用户对象实体
//	 */
//	public boolean updateUser(UserEntity userEntity)
//	{
//		UserDao userDao=new UserDao();
//		return userDao.updateUser(userEntity);
//	}
//
//	/**
//	 * 查询用户信息
//	 * @return
//	 */
//	public List<UserEntity> queryUserInfo()
//	{
//		UserDao userDao=new UserDao();
//		return userDao.queryUser();
//	}
//	
//	/**
//	 * 查询用户信息带条件
//	 * @return
//	 */
//	public List<UserEntity> queryUserInfo(String userName)
//	{
//		UserDao userDao=new UserDao();
//		return userDao.queryUser(userName);
//	}
//	
//	/**
//	 * 更据用户的主键id查询用户信息
//	 * @param userid
//	 */
//	public UserEntity getUserInfoById(int userid)
//	{
//		UserDao userDao=new UserDao();
//		return userDao.findById(userid);
//	}
//	
//	/**
//	 * 删除
//	 * @param userid
//	 * @return
//	 */
//	public boolean deleteUser(int userid)
//	{
//		UserDao userDao=new UserDao();
//		return userDao.deleteUserById(userid);
//	}
//
//}