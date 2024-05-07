package com.kh.oop.method.ex;

public class IceCream {
// 필드
	private String name;
	private int sugar;
	private boolean milk;
	

// 메서드
	// setter
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	// getter
	public int getSugar() {
		return sugar;
	}

	public String getName() {
		return name;
	}

	public boolean isMilk() {
		return milk;
	}

	// 생성자
	public IceCream() {
		
	}
	
	// 생성자 필수
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	public void makeIceCream() {
		System.out.println("이름 : " + name);
		System.out.println("설탕 : " + sugar + "g");
		if(milk) {
			System.out.println("우유 : 추가");
		}
		else {
			System.out.println("우유 : 미추가");
		}
		System.out.println("///////////////////////");
	}
	
}
