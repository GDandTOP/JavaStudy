package vo;

import java.sql.Date;

public class User {
	private Integer id;
	private String name;
	private String email;
	private Date joindate;
	private String address;
	private String tel;
	
	public User() {}
	public User(Integer id, String name, String email, Date joindate, String address, String tel) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.joindate=joindate;
		this.address=address;
		this.tel=tel;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return id+","+name+","+email+","+address+","+tel;
	}
}