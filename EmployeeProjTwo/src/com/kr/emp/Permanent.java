package com.kr.emp;

public class Permanent extends Employee  {
	private int pay;
	public Permanent() {}
	public Permanent(int id, String name, int pay) {
		super(id, name);
		this.pay=pay;
	}
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return super.toString()+", 급여:"+getPay();
	}
}
