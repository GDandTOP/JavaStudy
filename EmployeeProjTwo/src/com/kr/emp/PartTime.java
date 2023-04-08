package com.kr.emp;

public class PartTime extends Employee implements IBusinessTrip{
	private int payPerTime;
	private int time;
	public PartTime(int id, String name, int payPerTime, int time) {
		super(id,name);
		this.payPerTime=payPerTime;
		this.time=time;
	}
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return payPerTime*time;
	}
	@Override
	public String toString() {
		return super.toString() + ", 급여:"+getPay();
	}
	public int getPayPerTime() {
		return payPerTime*time;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public void goBusinessTrip(int day) {
		time +=day*24;
		
	}
	
	
	
	
}
