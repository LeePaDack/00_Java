package com.kh.oop.constructor;

public class Cafe {
	// 필드 선언
	// 카페 이름 지역 테이블수
	public String name;
	public String location;
	public int tableNum;
	
	// 기본 생성자와 필수 생성자 
	public Cafe() {
		
	}
	
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
		
	}
	
	// void 메서드 만들기
	public void cafeInfo() {
		// 카페 이름 지역 테이블수 출력하기
		System.out.println("이름 : " + name);
		System.out.println("지역 : " + location);
		System.out.println("테이블수 : " + tableNum +"개");
		System.out.println("/////////////////////////////");
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("=== 카페 조회하기 ===");
		
		// Cafe 객체를 사용해서 
		// 1. 기본 생성자로 cafe1 만들기
		// 이름 테이블수만 작성하고 출력
		Cafe cafe1 = new Cafe();
		cafe1.name = "cafe1";
		cafe1.tableNum = 10;
		cafe1.cafeInfo();
		
		// 2. 기본 생성자로 cafe2 만들기
		// 지역 테이블수만 작성하고 출력
		Cafe cafe2 = new Cafe();
		cafe2.location = "서울";
		cafe2.tableNum = 20;
		cafe2.cafeInfo();
		
		// 3. 필수 생성자 cafe3 만들기
		// 필수로 생성한 내용 출력
		Cafe cafe3 = new Cafe("cafe3", "서울", 30);
		cafe3.cafeInfo();
	}

}
