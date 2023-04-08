package com.kr;

import com.kr.emp.PartTime;
import com.kr.emp.Permanent;
import com.kr.emp.Sales;

public class EmployeeMian {

	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent(101,"홍길동",100000);
		Sales emp2 = new Sales(102,"김길동",80000,50000);
		PartTime emp3 = new PartTime(103,"고길동",1000,160);
		
		
		com.regEmployee(emp1);
		com.regEmployee(emp2);
		com.regEmployee(emp3);
//		com.regBusinessTrip(emp2, 1);//error
		com.regBusinessTrip(emp2, 2);
		com.regBusinessTrip(emp3, 1);
	
		com.printAllEmployee();
		System.out.println("총 급여 : "+com.getTotalPay());
	}
}
//출력
//사번:101, 이름:홍길동, 급여:100000
//사번:102, 이름:김길동, 급여:130000
//사번:103, 이름:고길동, 급여:160000
//총 급여 : 390000
