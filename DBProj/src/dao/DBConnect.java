package dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import vo.User;

public class DBConnect {
	Connection conn;
	
	public void connect() {
		FileInputStream fis =null;
		try {
			fis = new FileInputStream("db.properties");
			Properties dbprop = new Properties();
			dbprop.load(fis);
			String driver=dbprop.getProperty("driver");
			String url=dbprop.getProperty("url");
			String user=dbprop.getProperty("user");
			String password=dbprop.getProperty("password");
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		} catch(IOException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void insert2(User user) {
		String sql = "insert into user values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getEmail());
			pstmt.setDate(4, user.getJoindate());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getTel());
			int cnt = pstmt.executeUpdate();
			if(cnt>0) System.out.println(cnt+"개 데이터를 삽입했습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insert(User user) {
		String sql = "insert into user values("+user.getId()+",'"+user.getName()+
				"','"+user.getEmail()+"','"+user.getJoindate()+"','"+
				user.getAddress()+"','"+user.getTel()+"')";
		System.out.println(sql);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			if(cnt>0) System.out.println(cnt+"개 데이터가 삽입되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public User select(Integer id) {
		String sql = "select * from user where id=?";
		User user = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs!=null && rs.next()) {
				Integer sid = rs.getInt(1);
				String name = rs.getNString(2);
				String email = rs.getNString(3);
				Date joindate = rs.getDate(4);
				String address = rs.getNString(5);
				String tel = rs.getNString(6);
				user = new User(sid,name,email,joindate,address,tel);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}
	
	public List<User> selectAll() {
		String sql = "select * from user";
		List<User> users = new ArrayList<User>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joindate = rs.getDate("joindate");
				String address = rs.getString("address");
				String tel = rs.getString("tel");
				users.add(new User(id,name,email,joindate,address,tel));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return users;
	}
	
	public void update(User user) {
		String sql = "update user set name=?,email=?,joindate=?,address=?,tel=? where id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setDate(3, user.getJoindate());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getTel());
			pstmt.setInt(6, user.getId());
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println(cnt+"개의 데이터를 수정하였습니다.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(Integer id) {
		String sql="delete from user where id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println(cnt+"개의 데이터가 삭제되었습니다.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.cancel();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void conClose() {
		try {
			if(conn!=null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
