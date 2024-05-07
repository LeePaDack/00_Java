package com.kh.inheritance.ex;

// 자식 클래스
public class 아이폰 extends 스마트폰 {

// 필드
	private int IOS;

// 메서드
	// setter
	public void setIOS(int iOS) {
		IOS = iOS;
	}
	// getter
	public int getIOS() {
		return IOS;
	}
	
	// 생성자 기본 cntl stpace enter
	public 아이폰() {

	}
	// 생성자 필수
	public 아이폰(String 화면, String 통신사, String 성능, int iOS) {
		super(화면, 통신사, 성능);
		this.IOS = iOS;
	}
	
	// toString 
	@Override
	public String toString() {
		return "아이폰 버전 : " + IOS + " / " + super.toString(); 
	}
}