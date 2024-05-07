package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 직원 1에 대한 정보를 담을 변수명 Employee 객체 생성
		Employee emp1 = new Employee(100, "홍길동", "영업부", "과장", 25, '남', 
				2500000, 0.05, "010-1234-5678", "서울시 강남구");
		
		// Employee emp1 = new Employee();
		// emp.empNo = 1;
		// emp.empName = "Jack";
		// emp.gender = 'M';
		// System.out.println("=== 직원1 ===");
		// System.out.println("사원번호 : " + emp1.empNo);
		// ...
		
		emp1.info();
		
		Employee emp2 = new Employee(2, "동그라미");
		System.out.println("=== 직원2 ===");
		System.out.println("사원번호 : " + emp2.empNo);
		System.out.println("사원이름 : " + emp2.empName);
		
		// 직원3 필수로 모두 작성 제출
		Employee emp3 = new Employee(3, "김가나", "마케팅", "사무직", 20, '남',
				5000, 1000, "010-1235-1234" , "서울시 강남구");
		System.out.println("=== 직원3 ===");
		System.out.println("사원 번호 : " + emp3.empNo);
		System.out.println("사원 이름 : " + emp3.empName);
		System.out.println("사원 부서 : " + emp3.dept);
		System.out.println("사원 직무 : " + emp3.job);
		System.out.println("사원 성별 : " + emp3.gender);
		System.out.println("사원 연봉 : " + emp3.salary);
		System.out.println("사원 특봉 : " + emp3.bounsePoint);
		System.out.println("사원 폰번 : " + emp3.phone);
		System.out.println("사원 주소 : " + emp3.adress);
		
	}

}
