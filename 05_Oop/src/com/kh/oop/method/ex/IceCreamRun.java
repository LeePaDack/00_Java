package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		IceCream ic1 = new IceCream();
		
		ic1.setName("가나바");
		ic1.setSugar(2);
		ic1.setMilk(false);
		
		ic1.makeIceCream();
		
		
		IceCream ic2 = new IceCream("다라바", 20, true);
		
		ic2.makeIceCream();
	}
	
}
