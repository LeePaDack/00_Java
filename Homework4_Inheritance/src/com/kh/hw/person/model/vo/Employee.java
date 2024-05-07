package com.kh.hw.person.model.vo;

public class Employee extends Person {
// 필드
	private int salary;
	private String dept;
	
// 메서드
	// setter
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	// getter
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}

	// 생성자 : 기본
	public Employee() {

	}
	// 생성자 : 필수
	public Employee(String name, int age, double height,
			double weight,int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return "사원 [이름=" + getName() + ", 나이=" + getAge() + ", 키=" + getHeight()
		+ ", 몸무게=" + getWeight() + ", 급여=" + salary + ", 부서=" + dept
		+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}
