package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {

	// 기본 생성자
	
	public ArrayListEx2() {
	}
	
	public void method1() {
		// 딸기 바나나 사과
		ArrayList<String> list = new ArrayList<>();
		
		// add 를 사용해서 딸기 바나나 사과 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		// get 0 1 2 사용해서 각 index 자리에 값 출력하기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// set 바나나 -> 키위 수정
		list.set(1, "키위");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// size 크기 확인
		System.out.println("크기 : " + list.size());
	
		// remove 키위 삭제
		list.remove(1);

		// isEmpty() 비어있는지 확인
		System.out.println(list.isEmpty());
	
		// 뭐뭐 들어있는지 확인
		// 앞으로 사용할 for 문
		for (String fruit : list) {
			System.out.println(fruit);
		}
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<String>();
		
		// 동물 -> 사자 호랑이 고양이 강아지 추가
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		// 동물이 몇마리 있는지 확인
		System.out.println("크기 : " + animal.size());
		System.out.println();
		
		// 동물 확인 
		System.out.println(animal.get(0));
		System.out.println(animal.get(1));
		System.out.println(animal.get(2));
		System.out.println(animal.get(3));
		System.out.println();
		
		// 고양이를 토끼로 변경
		animal.set(2, "토끼");
		
		// 강아지 제거
		// animal.remove(3);
		animal.remove("강아지");
		
		// for 문을 활용해서 출력
		for (String 동물 : animal) {
			System.out.println(동물);
		}
		System.out.println();
		
		// 모두 삭제 
		animal.clear();
		
		// 모두 삭제 되었는지 확인
		System.out.println(animal.isEmpty());
	}
	
	public void method3() {
		// 피자 가게
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자 메뉴 ===");
		
		// pizza 고구마 포테이토 페퍼로니
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페퍼로니");
		
		// 모두보기
		System.out.println("모든 메뉴 보기 : " + pizza);
		System.out.println();
		
		// 출력하기
		System.out.println(pizza.get(0));
		System.out.println(pizza.get(1));
		System.out.println(pizza.get(2));
		System.out.println();
		
		// 페퍼로니 -> 파인애플
		pizza.set(2, "파인애플");
		System.out.println(pizza.get(0));
		System.out.println(pizza.get(1));
		System.out.println(pizza.get(2));
		System.out.println();
		
		// 파인애플 삭제
		pizza.remove("파인애플");
		
		// for 문 활용해서 출력
		for(String name : pizza) {
			System.out.println(name);
		}
		System.out.println();
		
		// 메뉴 모두 삭제
		pizza.clear();
		
		// 메뉴 삭제되었는지 확인 
		System.out.println(pizza.isEmpty());
		
	}
	
	// 메인
	public static void main(String[] args) {
		ArrayListEx2 ex2 = new ArrayListEx2();
		//ex2.method1();
		//ex2.method2();
		ex2.method3();
		
		
		
		
		
		
		
	}
}
