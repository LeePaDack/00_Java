package com.kh.oop.method;

public class Car {
	// 필드
	public String brand;
	public String model;
	public int year;
	
	// 생성자 
	// 생성자 : 기본
	public Car() {
		
	}
	// 생성자 : 필수
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	// 단축키 control 누른채로 변수명에 마우스를 대면 처음 만들어진 변수명의 위치로 감
	
	// return 메서드 
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	
	public static void main(String[] args) {
		
		// 자동차 car1 출력
		Car car1 = new Car("Toyota", "Camry", 2022); 
		
		// 값을 출력
		System.out.println(car1.getBrand() + "   " + car1.model + "   " +
							"   " + car1.getYear());
		
		
	}

}
