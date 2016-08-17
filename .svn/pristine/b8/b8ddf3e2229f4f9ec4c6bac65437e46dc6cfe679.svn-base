package scau.com.dao;

import java.util.ArrayList;
import java.util.List;

import scau.com.entity.RegisterTable;
import scau.com.entity.UserEntity;
import scau.com.util.DBUtil;

public class RegisterDao {

	/**
	 * ��ѯ��������Ϣ
	 * 
	 * @return List<UserEntity> �û���Ϣ����
	 */
	public List<RegisterTable> listRegister() {
		// select���
		String strQuery = "select id, name, sex, education, major, birth, school from register";
		List<Object> paras = new ArrayList<Object>();

		List<RegisterTable> registerList = new ArrayList<RegisterTable>();

		DBUtil dbUtil = new DBUtil();
		registerList = dbUtil.QueryInfoByCondition(strQuery, paras, RegisterTable.class);
		return registerList;
	}

	public List<RegisterTable> showRegisterById(int registerId) {
		// select语句
		StringBuilder sb = new StringBuilder();

		List<Object> paras = new ArrayList<Object>();
		sb.append("select id, name, photo, sex, come, identityId, married, education, major, time, birth"
				+ ", experience, address, school, skill, selfEvaluate, phone from register where id =" + registerId);
		List<RegisterTable> rList = new ArrayList<RegisterTable>();

		DBUtil dbUtil = new DBUtil();
		rList = dbUtil.QueryInfoByCondition(sb.toString(), paras, RegisterTable.class);
		return rList;
	}

	/**
	 * ���汨������Ϣ
	 * 
	 * @param userEntity
	 */

	public boolean saveRegister(RegisterTable registerTable) {
		// insert into sql���
		String insertStr = "insert into register (name, photo, sex, come, identityId, married,"
				+ " education, major, time, birth, experience, address, school, skill, selfEvaluate, phone)"
				+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		List<Object> paras = new ArrayList<Object>();
		paras.add(registerTable.getName());
		paras.add(registerTable.getPhoto());
		paras.add(registerTable.getSex());
		paras.add(registerTable.getCome());
		paras.add(registerTable.getIdentityId());
		paras.add(registerTable.getMarried());
		paras.add(registerTable.getEducation());
		paras.add(registerTable.getMajor());
		paras.add(registerTable.getTime());
		paras.add(registerTable.getBirth());
		paras.add(registerTable.getExperience());
		paras.add(registerTable.getAddress());
		paras.add(registerTable.getSchool());
		paras.add(registerTable.getSkill());
		paras.add(registerTable.getSelfEvaluate());
		paras.add(registerTable.getPhone());

		// ִ��
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(insertStr, paras);

		return flag;
	}

	/**
	 * ɾ��
	 * 
	 * @param userid
	 * @return
	 */
	public boolean deleteRegisterById(int registerid) {
		// sql
		String strDel = " delete from register where id=? ";

		// ����
		List<Object> paras = new ArrayList<Object>();
		paras.add(registerid);
		// ʵ�������ݴ�������
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(strDel, paras);

		return flag;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * RegisterDao registerDao = new RegisterDao();
	 * 
	 * for (RegisterTable u : registerDao.queryRegister()) {
	 * System.out.println(u.getId()); } }
	 */
}
