package com.kr;

import Employee.Employee;
import Employee.PartTime;
import Employee.Permanent;
import Employee.Sales;

public class EmployeeMain {
	Employee[] emps = new Employee[10];
	int count;
	
	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent(101,"홍길동",100000);
		Sales emp2 = new Sales(102,"김길동",80000,50000);
		PartTime emp3 = new PartTime(103,"고길동",1000,160);
		
		com.regEmployee(emp1);
		com.regEmployee(emp2);
		com.regEmployee(emp3);
		com.regBusinessTrip(emp2, 10);
		com.regBusinessTrip(emp3, 10);
//		com.printAllEmployee(); // 배열 출력
		
		
		com.regEmployeeMap(emp1);
		com.regEmployeeMap(emp2);
		com.regEmployeeMap(emp3);
		System.out.println("총 급여 : "+com.getTotalPay());
		com.printAllEmployeeMap();
		
	}

}

//출력
// 사번 : 101, 이름:홍길동, 급여:10000
// 사번 : 102, 이름:김길동, 급여:13000
// 사번 : 103, 이름:고길동, 급여:160000
// 총 급여 : 390000