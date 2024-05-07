package com.kh.oop.basic;

public class Main {
	
	// 생성자 (필수로 값을 넣어야 하거나 또는 초기에 담을 공간을 생성하는 메서드)
	public Main() {
		
	}
	
	// 내가 만든 파일 중에서 최종적으로 출시할 파일만 실행
	public static void main(String[] args) {
		Main main = new Main();
		main.practice2(); // static이 없어서 공간을 만들어 준 후 실행
	
	}
	
	public void practice1() {
		// 쿠키 클래스의 객체 생성
		쿠키 myCookie = new 쿠키();
		
		// 객체의 속성 설정
		// 쿠키의 크기와 모양을 설정
		myCookie.size = "large";
		myCookie.shape = "circle";
		
		// 쿠키에 대한 정보 출력
		System.out.println("쿠키의 크기 : " + myCookie.size);
		System.out.println("쿠키의 모양 : " + myCookie.shape);
		
		
		쿠키 카페판매용쿠키 = new 쿠키();
		카페판매용쿠키.size = "아담함";
		카페판매용쿠키.shape = "별모양";
		
		System.out.println("카페판매용쿠키 크기 : " + 카페판매용쿠키.size);
		System.out.println("카페판매용쿠기 모양 : " + 카페판매용쿠키.shape);
		/* Main 최종 메인 메서드에
		이름 나이 성별 주민번호를 입력하고
		출력한다음
		speakKoean 메서드 출력하기 */
	}
	
	public void practice2() {
		Nation nation = new Nation();
		
		nation.name = "홍길동";
		nation.age = 55;
		nation.gender = 'F';
		nation.jumin = "550101-2345678";
		
		System.out.println("이름 : " + nation.name);
		System.out.println("나이 : " + nation.age);
		System.out.println("성별 : " + nation.gender);
		System.out.println("주민번호 : " + nation.jumin);
		
		nation.speakKorean();
		nation.welfare();
		
		Nation nation2 = new Nation();
		nation2.name = "신짱구";
		nation2.age = 5;
		nation2.gender = '여';
		System.out.println("이름 : " + nation2.name);
		System.out.println("나이 : " + nation2.age);
		
		
		// 홍길동 신짱구 납세의 의무
		nation.납세의의무();
		nation2.납세의의무();
	}	

}
