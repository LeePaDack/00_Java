package com.kh.variable.pre;

public class EnumPre {
// enum 무지개 {빨 ~ 보};
// 필드	
	public enum 무지개{ // 일렬로 적어도 됨
		빨,
		주,
		노,
		초,
		파,
		남,
		보
	}
	
	// enum 으로 소비자 {학생, 직장인, 연장자}
	// enum 으로 판매자 {소매업, 도매업, 중매업} 
	public enum 소비자 {
		학생, 직장인, 연장자
	}
	public enum 판매자 {
		소매업, 도매업, 중매업
	}

	
// 생성자 : 기본
	public EnumPre() {
	}

// 메서드
	
	public void 메서드1() {
		// 빨 ~ 보 출력
		
		System.out.println("무지개 : " + 무지개.빨);
		System.out.println("무지개 : " + 무지개.주);
		System.out.println("무지개 : " + 무지개.노);
		System.out.println("무지개 : " + 무지개.초);
		System.out.println("무지개 : " + 무지개.파);
		System.out.println("무지개 : " + 무지개.남);
		System.out.println("무지개 : " + 무지개.보);
		
		// 장바구니 = 배열에 담기
		//                enum 밑에 있는 메서드
		무지개[] 배열 = 무지개.values(); // enum 으로 작성한 값을 가져옴
		System.out.println();
		
		// for each 로 넣을 수 있음
		for (무지개 무 : 배열) {
			System.out.println("무지개 : " + 무);
		}
		
	}

	
	// void 메서드2 를 만들어서 소비자와 판매자를 for each 사용해서 각각 출력
	public void 메서드2() {
		소비자[] 소비자들 = 소비자.values();
		판매자[] 판매자들 = 판매자.values();
		
		for(소비자 c : 소비자들) {
			System.out.println(c);
		}
		System.out.println();
		for(판매자 s : 판매자들) {
			System.out.println(s);
		}
		
		소비자 c = 소비자.학생;
		판매자 s = 판매자.소매업;
		
		System.out.println();
		
		if(c.ordinal() > s.ordinal()) {
			System.out.println("소비자의 등급이 더 높습니다.");
		} 
		else if(c.ordinal() == s.ordinal()) {
			System.out.println("등급이 같습니다.");
		}
		else {
			System.out.println("판매자의 등급이 더 높습니다");
		}
		
		
		// 소비자에서 학생과 판매자에서 소매업 ordinal() if 문 사용해서 비교하는 문장을 메서드 2 작성
		// 소비자 c = 소비자.학생;
		// 판매자 s = 판매자.소매업;
		// if (c.ordinal() > s.ordinal()){
			// sysout 소비자의 등급이 더 높습니다.
	}

	// 메인 메서드
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		//ep.메서드1();
		ep.메서드2();
	}
	
}
