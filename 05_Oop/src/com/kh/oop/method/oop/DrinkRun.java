package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {

		DrinkMaker dm1 = new DrinkMaker("허브티", 100, 5);
		
		DrinkStore ds1 = new DrinkStore(dm1, "경기", "멕아커피", false);
		
		ds1.orderDrink();
		
		
		DrinkMaker dm2 = new DrinkMaker("아메리카노", 250, 1);
		
		DrinkStore ds2 = new DrinkStore(dm2, "서울 서초구", "빠나쁘레소", true);
		
		ds2.orderDrink();
		
	}

}
