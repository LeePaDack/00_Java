package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {

	Employee[] sArr = new Employee[5];
	public static final int CUT_LINE = 60;
	
	public EmployeeController() {
		sArr[0] = new Employee("가나다", "자바", 100);
		sArr[1] = new Employee("라마바", "디비", 50);
		sArr[2] = new Employee("사아자", "화면", 85);
		sArr[3] = new Employee("차카타", "서버", 60);
		sArr[4] = new Employee("파하", "자바", 20);
	}
	
	public Employee[] printEmployee() {
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		// for - each
		for (Employee e : sArr) {
			sum += e.getScroe();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double avgArr[] = new double[2];
		avgArr[0] = sumScore(); // 위에서 만든 모든 학생의 총점을 더한 값을 저장하는 공간 0
		avgArr[1] = avgArr[0] / sArr.length; // 총점 / 총학생수 = 평균
		return avgArr;
	}	
	
}
