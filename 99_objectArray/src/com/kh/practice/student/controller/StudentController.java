package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	/*
	private Student[] sArr = new Student[5];

	        ┌ sArr[0] 김길동 자바 100
	        ┝ sArr[1] 박길동 디비 50
	Student ┝ sArr[2] 이길동 화면 85
	 sArr   ┝ sArr[3] 정길동 서버 60
	        └ sArr[4] 홍길동 자바 20
	
	
	 */
	
	
	
	// 5 개가 들어갈 배열을 만들어주는데 학생으로 만들어주셈
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60; // 변수가 아니라 상수 바꿀 수 없음

// 메서드
	// 생성자 : 기본
	public StudentController() {
		// 0 번째 학생 ~ 4 번째 학생까지 값을 넣어주기
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	// sArr 에 저장된 정보를 모두 보겠음
	public Student[] printStudent() {
		return sArr;
	}
	
	// 학생들의 점수를 모두 더해서 총점을 계산
	public int sumScore() { //점수 합한 값 전달
		int sum = 0;
		for (Student s : sArr) {
			sum += s.getScore();
		}
		// 마지막으로 총합을 sumScore 를 부른다면 내가 가진 점수를 보여주겠다
		return sum;
	}
	
	// 총점에서 배열 사용 X 총점 구하기
	/*
	public double avgScore2() {
		double avgArr = sumScore() / sArr.length;
		return avgArr;
	 */
	// 총점을 받아서 평균 구하기
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore(); // 위에서 만든 모든 학생의 총점을 더한 값을 저장하는 공간 0
		avgArr[1] = avgArr[0] / sArr.length; // 총점 / 총학생수 = 평균
		return avgArr;
	}
	
	// 각 학생의 합격 여부를 확인하고 출력하는 메서드
	public void printPass() {
		for (Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " 학생은 " + 
		(s.isPassed() ? "통과" : "불합격") + " 입니다.");
		}
	}
	// if 로도 할 수 있음
	
	
	
}
