package DesignPatternProgram;

//Service Layer design pattern

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Set;


public class CacheingTheData {
	static CacheingTheData instance = new CacheingTheData();
	static HashMap<Object, Object> hm = null;

	private CacheingTheData() {
		hm = new HashMap<>();
	}

	public static CacheingTheData getInstance() {
		if (instance == null) {
			return instance;
		} else {
			return new CacheingTheData();
		}
	}

	public  Object getValueFromHashMap(String key) throws Exception {

		if (hm.containsKey(key)) {
			
			System.out.println("Not found");
			return hm.get(key);
			
		} else {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement state = con.createStatement();
			String sql = "select * from login where uname = " + key;
			ResultSet rs = state.executeQuery(sql);
			while (rs.next()) {
				Integer id = new Integer(rs.getInt("uname"));
				String name = new String(rs.getString("pass"));

				hm.put(id, name);
			}
//			hm.put(key, con);
//			System.out.println(hm.size());

			Set<Object> keyset = hm.keySet();
			for (Object k : keyset) {

				System.out.println(k);
				System.out.println(hm.get(k));
			}

			return hm.get(key);
		}
	}

	public static void main(String[] args) throws Exception {

		Object obj = CacheingTheData.getInstance().getValueFromHashMap("444");
	}

}
