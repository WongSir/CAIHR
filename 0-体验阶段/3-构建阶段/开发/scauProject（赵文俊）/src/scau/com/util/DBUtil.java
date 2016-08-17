package scau.com.util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/hrmsdb?useUnicode=true&characterEncoding=utf-8";
	public static String username = "root";
	public static String password = "123456";

	private Connection conn;
	private PreparedStatement psts;
	private ResultSet rs;

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public PreparedStatement getPsts() {
		return psts;
	}

	public void setPsts(PreparedStatement psts) {
		this.psts = psts;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	/**
	 * 构造方法中加载驱动
	 */
	public DBUtil() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动出错");
			e.printStackTrace();
		}
	}
	/**
	 * 下划线字符串转化为驼峰形
	 * @param name
	 * @return
	 */
	public static String camelName(String name) {
	    StringBuilder result = new StringBuilder();
	    // 快速检查
	    if (name == null || name.isEmpty()) {
	        // 没必要转换
	        return "";
	    } else if (!name.contains("_")) {
	        // 不含下划线，仅将首字母小写
	        return name.substring(0, 1).toLowerCase() + name.substring(1);
	    }
	    // 用下划线将原始字符串分割
	    String camels[] = name.split("_");
	    for (String camel :  camels) {
	        // 跳过原始字符串中开头、结尾的下换线或双重下划线
	        if (camel.isEmpty()) {
	            continue;
	        }
	        // 处理真正的驼峰片段
	        if (result.length() == 0) {
	            // 第一个驼峰片段，全部字母都小写
	            result.append(camel.toLowerCase());
	        } else {
	            // 其他的驼峰片段，首字母大写
	            result.append(camel.substring(0, 1).toUpperCase());
	            result.append(camel.substring(1).toLowerCase());
	        }
	    }
	    return result.toString();
	}

	/**
	 * 连接数据库
	 */
	public void connectionDB() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 关闭连接
	 */
	public void closeConn() {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (psts != null) {
				psts.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 插入、更新、删除公共方法
	 * 
	 * @param sql
	 *            sql语句
	 * @param paras
	 *            参数
	 * @return boolean 返回值(true: 成功、 FALSE:失败)
	 */
	public boolean InsertUpdateDeleteExcute(String sql, List<Object> paras) {
		int index = 1;
		boolean flag = false;

		// 执行
		try {
			this.connectionDB(); // 连接数据库
			psts = conn.prepareStatement(sql);
			psts.clearParameters(); // 清空
			// 判断
			if (paras != null && paras.size() > 0) {
				for (int i = 0; i < paras.size(); i++) {
					psts.setObject(index++, paras.get(i)); // 添加
				}
			}

			int n = psts.executeUpdate(); // 执行
			flag = n > 0 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConn(); // 关闭
		}

		return flag;
	}

	/**
	 * 查询信息
	 * 
	 * @param sql
	 * @param paras
	 * @param zlass
	 * @return
	 */
	public <T> List<T> QueryInfoByCondition(String sql, List<Object> paras, Class<T> zlass) {
		List<T> list = new ArrayList<T>(); // 返回的集合
		int index = 1;
		try {
			// 获取数据库的链接
			this.connectionDB();

			psts = conn.prepareStatement(sql);

			// 先清空参数
			psts.clearParameters();

			// 添加参数
			if (paras != null && paras.size() > 0) {
				for (int i = 0; i < paras.size(); i++) {
					psts.setObject(index++, paras.get(i));
				}
			}

			// 执行
			rs = psts.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData(); // 获取元数据
			int columnCount = metaData.getColumnCount(); // 获取总列数

			while (rs.next()) {

				// 通过反射机制创建一个实例
				T t = zlass.newInstance(); // new UserEntity();
				for (int i = 0; i < columnCount; i++) {
					String columnName = metaData.getColumnName(i + 1); // 获取列名
					Object columnValue = rs.getObject(columnName); // 根据列名获取对应的值
					if (columnValue == null) {
						columnValue = "";
					}
					
					//System.out.println(columnName+":"+columnValue);
					Field field = zlass.getDeclaredField(camelName(columnName));
					
					field.setAccessible(true); // 允许访问javaBean对象
					field.set(t, columnValue);
				}
				list.add(t);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			this.closeConn();
		}

		return list;
	}

	/**
	 * 查询信息
	 * 
	 * @param sql
	 * @param paras
	 * @param zlass
	 * @return
	 */
	public <T> T FindByCondition(String sql, List<Object> paras, Class<T> zlass) {

		int index = 1;
		// 通过反射机制创建一个实例
		T t = null;
		try {
			// 获取数据库的链接
			this.connectionDB();

			psts = conn.prepareStatement(sql);

			// 先清空参数
			psts.clearParameters();

			// 添加参数
			if (paras != null && paras.size() > 0) {
				for (int i = 0; i < paras.size(); i++) {
					psts.setObject(index++, paras.get(i));
				}
			}

			// 执行
			rs = psts.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData(); // 获取元数据
			int columnCount = metaData.getColumnCount(); // 获取总列数
			
			t = zlass.newInstance(); // new UserEntity();
			
			while (rs.next()) {
				for (int i = 0; i < columnCount; i++) {
					String columnName = metaData.getColumnName(i + 1); // 获取列名
					Object columnValue = rs.getObject(columnName); // 更据列名获取对应的值
					if (columnValue == null) {
						columnValue = "";
					}

					Field field = zlass.getDeclaredField(camelName(columnName));
					field.setAccessible(true); // 允许访问javaBean对象
					field.set(t, columnValue);
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			this.closeConn();
		}

		return t;
	}

}
