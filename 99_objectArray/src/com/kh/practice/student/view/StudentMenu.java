package com.kh.practice.student.view;
// 사용자의 입장에서 바라보는 컴퓨터 

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
// 메서드
	// 생성자 : 기본
	public StudentMenu() {
		
	}
	// void 학생 정보와 성적 결과 출력하는 메서드
	public void printStudentMenu() {
		System.out.println("학생 이름 과목 점수");
		System.out.println("//////////////////////");
		// for - each
		// String 으로 했다면 학새의 이름 or 과목 or 점수
		// Student 이름과 과목과 점수를 모두 가지고 오겠다는 의미
		
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("/////////////////");
		System.out.println("총점 : " + ssm.sumScore());
		System.out.printf("평균 : %.2f \n" , ssm.avgScore()[1]);
		System.out.println("합격여부 : " + (ssm.avgScore()[1] 
				>= StudentController.CUT_LINE));
		/*
		boolean 을 사용해서 true 인지 false 인지 한적이 없는데
		true 와 false 로 보여지는 이유는?
		
		   학생들 평균        >=       합격 커트라인
		ssm.avgScore()[1] >= StudentController.CUT_LINE
		
		
			값이 같거나 크거나 작다는 것을 표현하는 부등호는 true 인지 false 인지
			구분만 하기 위한 존재
		
		 */
		
		ssm.printPass();
		
		
	}
	
	
}
