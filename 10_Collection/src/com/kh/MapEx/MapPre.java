package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	// 기본 생성자 만들기
	public MapPre() {

	}
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시 쉬림프");
		System.out.println(map);
	}
	
	public void practice2() {
		                                 // <> 에 자료형을 넣어도 안넣어도 됨
		Map <String,String> map = new HashMap<>();
		// map.put 을 활용해서 학원-서울시 강남구 등산-서울시 관악구 롯데타워-서울시 송파구
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		
		// 전체출력하기
		System.out.println(map);
		
		// get 이용해서 롯데워가 어디 있는지 출력
		System.out.println("롯데타워 위치 : " + map.get("롯데타워"));
		
		// remove 활용해서 등산 삭제
		map.remove("등산");
		System.out.println(map);
		
		// for - each keySet() 을 활용해서 전체 목록 추가하기
		for(String 장소 : map.keySet()) {
			String 위치 = map.get(장소);
			System.out.println(장소  + "은(는) " + 위치 + "에 있다.");
		}
	}
	
	public void practice3() {
		// 특정 값이 존재하는지 확인
		// String Integer 과일 - 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		// 200원 짜리 과일이 존재하는가?
		System.out.println("200원 과일이 존재하는가 : " + map.containsValue(200));
		// containsValue 도 true false 로 가격이 나옴
		
		// 체리 과일이 존재하는가?
		System.out.println("체리가 있나? : " + map.containsKey("체리"));
		// containsKey 도 true false 로 가격이 나옴
		
		// 크기 조회
		System.out.println("현재 map 의 크기 : " + map.size());
	}

	public void practice4() {
		// put 을 이용해서 1 - 에그마요 2 - 로티세리바베큐 3 - 스테이크앤치즈 4 - 스파이시쉬림프
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		System.out.println(map);
		
		// get 을 이용해서 3번에 뭐가 들어있는지 확인
		System.out.println(map.get(3));
		
		// size() 를 이용해서 총 메뉴가 몇개인지 확인
		System.out.println("메뉴 개수 : " + map.size());
		
		// remove 활용해서 4번 지워줌
		map.remove(4);
		System.out.println(map);
		
		// isEmpty() 를 사용해서 비었는지 확인
		System.out.println("비어있나요 : " + map.isEmpty());
		
		// keySet() 이용해서 for - each 모두보기
		for(int 번호 : map.keySet()) {
			String 메뉴 = map.get(번호);
			System.out.println("번호 : " + 번호 + ", 메뉴 : " + 메뉴);
		}
		
		/*
		  다른 방법 ↑ 의
		for(Map.Entry<Integer,String> e : map.entrySet()){
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		 */
		
		// clear() 최종삭제
		map.clear();
		System.out.println(map);
		
	}
	
	// 최종 메인 메서드
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		//mp.practice2();
		//mp.practice3();
		mp.practice4();
		
		
	}
	
	
	
	
	
	
	
}
