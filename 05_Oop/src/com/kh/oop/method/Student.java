package com.kh.oop.method;

public class Student {

	// 필드
	// 학생 이름 나이 학년
	private String name;
	private int age;
	private int grade;
	
	// 메서드
		// 생성자 : 기본
	public Student() {
		
	}
		// 생성자 : 필수 이름 나이 학년
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
		// return
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void info() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 학년 : " + grade);
	}
	public static void main(String[] args) {
		// std1 박영수 15 2
		// std2 김영희 17 1
		
		Student std1 = new Student("박영수", 15, 2);
		std1.info();
		
		Student std2 = new Student("김영희", 17, 1);
		std2.info();
		
		
	}

}
