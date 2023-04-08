
import java.util.List;

import dao.DBConnect;
import vo.User;

public class ProjMain {
	public static void insert(User user) {
		DBConnect db = new DBConnect();
		db.connect();
		db.insert(user);
		
		db.conClose();
		
	}
	public static void select(Integer id) {
		DBConnect db = new DBConnect();
		db.connect();
		User user = db.select(id);
		System.out.println(user);
		db.conClose();
	}
	
	public static void selectAll() {
		DBConnect db = new DBConnect();
		db.connect();
		List<User> users = db.selectAll();
		for(User user: users) {
			System.out.println(user);
		}
		
		db.conClose();
	}
	
	public static void updateAddress(Integer id, String address) {
		DBConnect db = new DBConnect();
		db.connect();
		User user = db.select(id);
		user.setAddress(address);
		db.update(user);
		db.conClose();
	}
	
	public static void updateEmail(Integer id, String email) {
		DBConnect db = new DBConnect();
		db.connect();
		User user = db.select(id);
		user.setEmail(email);
		db.update(user);
		db.conClose();
	}
	
	public static void delete(Integer id) {
		DBConnect db = new DBConnect();
		db.connect();
		db.delete(id);
		db.conClose();
	}
	
	public static void main(String[] args) {		
//		insert(new User(106,"박길동","park@kt.com",
//				new Date(new java.util.Date().getTime()),
//				"경기도 과천시","010-2222-1111"));
		
//		select(101);
//		selectAll();
//		updateAddress(101,"서울시 관악구");
//		updateEmail(101, "hong@naver.com");
		delete(103);
	}
}