package com.kh.oop.method.oop;

public class CoffeeRun {
	// 최종 출력 메인 메서드
	public static void main(String[] args) {
		// 커피 제조하기 
		CoffeeMaker cm = new CoffeeMaker("아메리카노", 1, false);
		
		// 커피 가게작성
		CoffeeStore sc = new CoffeeStore(cm, "카피빈", "서울시 강남구");
		
		// 주문 및 제조
		sc.orderCoffee();
	}
}
