package com.kh.oop.method.oop;

public class CoffeeMaker {
// 필드
	
	private String coffeeType; // 커피 종류
	private int sugar; // 설탕양
	private boolean milk; // 우유 유무
	
	// 메서드 
	
	// setter
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	// getter
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() { // boolean 같은 경우 get 이 아니라 is 로 표기
		return milk;
	}
	
	// 생성자 : 기본
	public CoffeeMaker() {
		
	}
	
	// 생성자 : 필수
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	// void
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("커피 종류 : " + coffeeType);
		System.out.println("설탕양 : " + sugar + "g");
		// 만약에 우유가 추가 되었다면 
		if(milk) {
			System.out.println("우유 추가");
		}
		else {
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
		System.out.println("///////////////////////////////////");
	}
/*
	public static void main(String[] args) {
		// 기본 생서자로 객체 사용
		CoffeeMaker cf1 = new CoffeeMaker();
		
		cf1.setCoffeeType("아메리카노");
		cf1.setSugar(1);
		cf1.setMilk(false);
		
		cf1.makeCoffee();
		
		// 필수 생성자로 객체 사용
		CoffeeMaker cf2 = new CoffeeMaker("디카페인", 2, true);
		cf2.makeCoffee();
		
		
	} */
	
}
