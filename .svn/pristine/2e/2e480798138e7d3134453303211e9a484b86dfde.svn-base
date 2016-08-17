package scau.com.service.impl;

import java.util.List;

import scau.com.dao.RegisterDao;
import scau.com.entity.RegisterTable;
import scau.com.service.IRegisterService;

public class RegisterServiceImpl implements IRegisterService {

	/**
	 * ���汨������Ϣ
	 * 
	 * @param userName
	 *            ��������
	 * @param loginName
	 *            ��½��
	 * @param pwd
	 *            ����
	 * @Override public void saveUser(String userName, String loginName, String
	 *           pwd) {
	 * 
	 * 
	 *           }
	 */

	@Override
	public boolean saveRegister(RegisterTable registerTable) {

		RegisterDao registerDao = new RegisterDao();
		return registerDao.saveRegister(registerTable);
	}

	/**
	 * ��ѯ�û���Ϣ
	 * 
	 * @return
	 */
	public List<RegisterTable> listRegister() {
		RegisterDao registerDao = new RegisterDao();
		return registerDao.listRegister();
	}

	/*
	 * (non-Javadoc)
	 * @see scau.com.service.IRegisterService#showRegisterById(int)
	 * return RegisterTable
	 */
	public RegisterTable showRegisterById(int registerId) {
		RegisterDao registerDao = new RegisterDao();
		return registerDao.showRegisterById(registerId).get(0);
	}
	/**
	 * ɾ��
	 * 
	 * @param userid
	 * @return
	 */
	public boolean deleteRegister(int registerid) {
		RegisterDao registerDao = new RegisterDao();
		return registerDao.deleteRegisterById(registerid);
	}

}
