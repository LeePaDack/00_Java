package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {

	public static void main(String[] args) {
		/*
		tmp
		String String 으로 
		"apple", "사과"
		banana    ~
		orange    ~
		grape   ~
		watermelon  ~
		
		[] for 문을 활용해서 추가
		 */
		TreeMap<String, String> tmp = new TreeMap<>();
		
		String keys[] = {"apple", "banana", "orange", "grape", "watermelon"};
		String values[] = {"사과", "바나나", "오렌지", "포도", "수박"};
		
		for (int i = 0; i < keys.length; i++) {
			tmp.put(keys[i], values[i]);
		}
		
		// 전체출력
		System.out.println(tmp);
		
		// get 사용해서 banana 에 해당하는 값 가져오기
		System.out.println(tmp.get("banana"));
		
		// size 확인
		System.out.println(tmp.size());
		
		// isEmpty 비어있는지
		System.out.println(tmp.isEmpty());
		
		// containsKey 키가 존재하는지 grape
		System.out.println(tmp.containsKey("grape"));
		
		// containsValue 값이 존재하는지 포도
		System.out.println(tmp.containsValue("포도"));
		
		// keySet 모든 키 출력
		System.out.println(tmp.keySet());
		
		// values 모든 값 출력
		System.out.println(tmp.values());
		
		// 첫 번째 키와 마지막 키 출력
		System.out.println(tmp.firstKey()); // 첫 
		System.out.println(tmp.lastKey()); // 마
		
		// 모든요소 clear 로 제거
		tmp.clear();
		System.out.println(tmp);
	}

}
