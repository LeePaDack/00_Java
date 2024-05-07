package package3.controller;

import java.util.Random;

import package3.model.vo.Animal;
import package3.model.vo.Horse;
import package3.model.vo.Rabbit;

public class AnimalWorld {

	public static void main(String[] args) {
		
		// 사이즈 5짜리 객체 만들기
		Animal an[] = new Animal[5];
		
		// 랜덤으로 
		Random rd = new Random();
		
		// true 면 토끼 false 면 말이 들어가는 것 만들기
		for(int i = 0; i < an.length; i++) {
			if(rd.nextBoolean()) {
				an[i] = new Rabbit("토깽이" + i, "토끼" , rd.nextInt(7)+1, "흰색");
			}
			else {
				an[i] = new Horse("말돌이" + i, "말", "초원", "검은색");
			}
		}
		for (Animal a : an) {
			a.speak();
		}
		
		
		
		
		

	}

}
