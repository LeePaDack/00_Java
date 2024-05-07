package com.kh.example.practice7.model.vo;

public class Employee {

	public int empNo;
	public String empName;
	public String dept; 
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bounsePoint;
	public String phone;
	public String adress;
	
	// 생성자
	public Employee() {
		
	}
	
	// 번호와 이름을 필수로 추가
	public Employee(int 번호, String 이름) {
		this.empNo = 번호;
		this.empName = 이름;
	}
	
	public Employee(int 번호, String 이름, String 부, String 일, int 나이, char 성별, 
			int 급여, double 보너스, String 폰번호, String 주소) {
		this.empNo = 번호;
		this.empName = 이름;
		this.dept = 부;
		this.job = 일;
		this.age = 나이;
		this.gender = 성별;
		this.salary = 급여;
		this.bounsePoint = 보너스;
		this.phone = 폰번호;
		this.adress = 주소;
	}
	
	public void info() {
		System.out.println(empNo + ", " + empName + ", " + dept + ", " + job
				+ ", " + age + ", " + gender + ", " + salary + ", " + bounsePoint
				+ ", " + phone + ", " + adress);
	}
	
	
}
