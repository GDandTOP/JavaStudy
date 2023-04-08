package com.kr;

import java.util.HashMap;

import Employee.Employee;
import Employee.IBusinessTrip;

public class Company {
	
	// 해쉬맵 적용 방식
	HashMap<Integer,Employee> empsMap = new HashMap<>();
	
	void regEmployeeMap(Employee emp) {
		empsMap.put(emp.getId(), emp); // key ,value 쌍으로 맵에 등록
	}
	
	
	Employee[] emps = new Employee[10];
	int count=0;
	
	void regEmployee(Employee emp) {
		if (count<10) {
			emps[count++]=emp;
		}
		else 
		{
			System.out.println("배열 용량이 초과했습니다.");
		}
	}
	
	void printAllEmployee() {
		for (int i=0; i<count; i++) {
			System.out.println(emps[i]);
		}
	}
	
	//맵 버전으로 확인
	void printAllEmployeeMap() {
		System.out.println("keyset : "+empsMap.keySet());
		System.out.println("values : "+empsMap.values());
		for (Employee a : empsMap.values()) {
			System.out.println(a.getPay());
		}
	}
	
	int getTotalPay() {
		int total=0;
		for (Employee emp : empsMap.values()) {
			total+=emp.getPay();
			System.out.println(emp.getPay());
		}

		return total;
	}
	
	public void regBusinessTrip(IBusinessTrip emp,int day) {
		emp.goBusinessTrip(day);
	}
	
	
}
