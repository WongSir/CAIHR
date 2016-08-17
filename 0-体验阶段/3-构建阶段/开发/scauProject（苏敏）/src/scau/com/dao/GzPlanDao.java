package scau.com.dao;

import java.util.ArrayList;
import java.util.List;

import scau.com.entity.GzPlan;
import scau.com.util.DBUtil;

public class GzPlanDao {

	/**
	 * ��ѯ��������Ϣ
	 * 
	 * @return List<UserEntity> �û���Ϣ����
	 */
	public List<GzPlan> listGzPlan() {
		// select���
		String strQuery = "select id, title, beginTime, overTime, academy, post, cnt, education, rank, other from gzplan";
		List<Object> paras = new ArrayList<Object>();

		List<GzPlan> GzPlanList = new ArrayList<GzPlan>();

		DBUtil dbUtil = new DBUtil();
		GzPlanList = dbUtil.QueryInfoByCondition(strQuery, paras, GzPlan.class);
		return GzPlanList;
	}

	public List<GzPlan> showGzPlanById(int gzPlanId) {
		// select语句
		StringBuilder sb = new StringBuilder();

		List<Object> paras = new ArrayList<Object>();
		sb.append("select id, title, reason, beginTime, overTime, academy, post, cnt, education, rank, other from gzPlan where id =" + gzPlanId);
		List<GzPlan> rList = new ArrayList<GzPlan>();

		DBUtil dbUtil = new DBUtil();
		rList = dbUtil.QueryInfoByCondition(sb.toString(), paras, GzPlan.class);
		return rList;
	}

	/**
	 * ���汨������Ϣ
	 * 
	 * @param userEntity
	 */

	public boolean saveGzPlan(GzPlan gzPlan) {
		// insert into sql���
		String insertStr = "insert into gzPlan (title, reason, beginTime, overTime, academy, post, cnt, education, rank, other)"
				+ " values (?,?,?,?,?,?,?,?,?,?)";

		List<Object> paras = new ArrayList<Object>();
		paras.add(gzPlan.getTitle());
		paras.add(gzPlan.getReason());
		paras.add(gzPlan.getBeginTime());
		paras.add(gzPlan.getOverTime());
		paras.add(gzPlan.getAcademy());
		paras.add(gzPlan.getPost());
		paras.add(gzPlan.getCnt());
		paras.add(gzPlan.getEducation());
		paras.add(gzPlan.getRank());
		paras.add(gzPlan.getOther());

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
	public boolean deleteGzPlanById(int gzPlanid) {
		// sql
		String strDel = " delete from gzPlan where id=? ";

		// ����
		List<Object> paras = new ArrayList<Object>();
		paras.add(gzPlanid);
		// ʵ�������ݴ�������
		DBUtil dbUtil = new DBUtil();
		boolean flag = false;
		flag = dbUtil.InsertUpdateDeleteExcute(strDel, paras);

		return flag;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * GzPlanDao GzPlanDao = new GzPlanDao();
	 * 
	 * for (gzPlan u : GzPlanDao.queryGzPlan()) {
	 * System.out.println(u.getId()); } }
	 */
}
