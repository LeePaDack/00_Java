package com.kh.oop.basic;

public class Student {
	// 필드                      
	// 학생인데 학생의 이름과 나이와 학년
	public String name;
	public int age;
	public int grade;
	
	// 생성자 메서드 (필수로 작성해야하는 생성자 메서드 만들기)
	// 필수로 넣어야 하는 것 이름 나이 학년
	public Student(String stName, int stAge, int stGrade) {
		this.name = stName;
		this.age = stAge;
		this.grade = stGrade;
	}
	// 출력 메서드 (정보 출력 메서드)
	// public void info(){
	//	System.out.println 이름 나이 학년 출력
	//}
	public void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age +", 학년 : "
				+ grade);
	}
		
	// 최종 메인 메서드
	// 학생 객체 생성하기  김철수 18 3  박영희 20 2
	// Student student1
	// Student student2
	// 학생1, 학생2 정보 출력하기
		public static void main(String[] args) {
			Student st1 = new Student("김철수", 18, 3);
			st1.info();
			Student st2 = new Student("박영희", 20, 2);
			st2.info();
		}
	}
	

