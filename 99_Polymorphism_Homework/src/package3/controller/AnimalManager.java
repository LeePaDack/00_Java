package package3.controller;

import java.util.Random;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// 사이즈 5짜리 Animal 타입의 객체 배열 생성
		Animal animals[] = new Animal[5];
		
		// 무작위로
		Random random = new Random();
		// true면 강아지 false면 고양이를 칸에 넣을 예정
		for (int i = 0; i < animals.length; i++) {
			// 만약에 랜덤으로 true false 를 가져오게 한 다음
			if(random.nextBoolean()) { // 랜덤으로 거짓과 참이 나옴
				// 멍멍이 이름을 지어줄 때 멍멍이1 멍멍이2
				// "멍멍이" + 뒤에 오는 숫자
				// 강아지 종은 개      강아지 몸무게는 1 ~ 30 kg 까지 측정
				animals[i] = new Dog("멍멍이" + i, "개" , random.nextInt(30) + 1);
			}
			else {
				animals[i] = new Cat("야옹이" + i, "고양이", "집", "검은색");
			}
		}
		for (Animal a : animals) {
			a.speak();
		}
		
		
	}

}
