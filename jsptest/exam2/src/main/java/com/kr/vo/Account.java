package com.kr.vo;

public class Account {
	private String id;
	private String name;
	private int money;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Account() {}
	public Account(String id, String name, int money) {
		this.id=id;
		this.name=name;
		this.money=money;
	}
}
