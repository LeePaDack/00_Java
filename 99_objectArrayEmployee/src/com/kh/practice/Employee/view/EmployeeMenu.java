package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {

	public EmployeeMenu() {
		
	}
	
	private EmployeeController ssm = new EmployeeController();
	
	public void printEmployee() {
		System.out.println("이름  과목  점수");
		System.out.println("//////////////////");
		
		for(Employee emp : ssm.printEmployee()) {
			System.out.println(emp.inform());
		}
		System.out.println("/////////////////");
		System.out.println("총점 : " + ssm.sumScore());
		System.out.printf("평균 : %.2f\n" , ssm.avgScore()[1]);
		System.out.println("합격여부 : " + (ssm.avgScore()[1] 
		>= EmployeeController.CUT_LINE));
		
		

	}
}
