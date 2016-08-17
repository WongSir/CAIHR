package scau.com.service.impl;

import java.util.List;

import scau.com.dao.UserDao;
import scau.com.entity.UserEntity;
import scau.com.service.IUserService;

/**
 * 用户业务处理实现类
 */
public class UserServiceImpl implements IUserService {

	/**
	 * 保存用户
	 * @param userName   姓名
	 * @param loginName  登陆名
	 * @param pwd   密码
	 */
	@Override
	public void saveUser(String userName, String loginName, String pwd) {
		
		
	}

	/**
	 * 保存用户
	 * @param userEntity   用户对象实体
	 */
	@Override
	public boolean saveUser(UserEntity userEntity) {
		
		UserDao userDao=new UserDao();
		return userDao.saveUser(userEntity);
	}
	
	/**
	 * 修改保存用户
	 * @param userEntity   用户对象实体
	 */
	public boolean updateUser(UserEntity userEntity)
	{
		UserDao userDao=new UserDao();
		return userDao.updateUser(userEntity);
	}

	/**
	 * 查询用户信息
	 * @return
	 */
	public List<UserEntity> queryUserInfo()
	{
		UserDao userDao=new UserDao();
		return userDao.queryUser();
	}
	
	/**
	 * 查询用户信息带条件
	 * @return
	 */
	public List<UserEntity> queryUserInfo(String userName)
	{
		UserDao userDao=new UserDao();
		return userDao.queryUser(userName);
	}
	
	/**
	 * 更据用户的主键id查询用户信息
	 * @param userid
	 */
	public UserEntity getUserInfoById(int userid)
	{
		UserDao userDao=new UserDao();
		return userDao.findById(userid);
	}
	
	/**
	 * 删除
	 * @param userid
	 * @return
	 */
	public boolean deleteUser(int userid)
	{
		UserDao userDao=new UserDao();
		return userDao.deleteUserById(userid);
	}

}
