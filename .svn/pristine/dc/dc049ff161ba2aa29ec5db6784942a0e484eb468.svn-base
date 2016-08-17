package scau.com.service;

import java.util.List;

import scau.com.entity.UserEntity;

/**
 * 用户业务处理接口类
 */
public interface IUserService {
 
	/**
	 * 保存用户
	 * @param userName   姓名
	 * @param loginName  登陆名
	 * @param pwd   密码
	 */
	public void saveUser(String userName,String loginName,String pwd);
	
	
	/**
	 * 保存用户
	 * @param userEntity   用户对象实体
	 */
	public boolean saveUser(UserEntity userEntity);
	
	
	/**
	 * 修改保存用户
	 * @param userEntity   用户对象实体
	 */
	public boolean updateUser(UserEntity userEntity);
	
	/**
	 * 查询用户信息带条件
	 * @return
	 */
	public List<UserEntity> queryUserInfo(String userName);
	
	/**
	 * 查询用户信息
	 * @return
	 */
	public List<UserEntity> queryUserInfo();
	
	
	/**
	 * 更据用户的主键id查询用户信息
	 * @param userid
	 */
	public UserEntity getUserInfoById(int userid);
	
	/**
	 * 删除
	 * @param userid
	 * @return
	 */
	public boolean deleteUser(int userid);
}
