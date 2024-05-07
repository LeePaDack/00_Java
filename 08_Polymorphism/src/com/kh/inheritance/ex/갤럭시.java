package com.kh.inheritance.ex;

// extends 스마트폰 상속받기
public class 갤럭시 extends 스마트폰 {
	
// 필드 
	private int android;

	
// 메서드
	// setter
	public void setAndroid(int android) {
		this.android = android;
	}
	// getter
	public int getAndroid() {
		return android;
	}
	
	// 생성자 : 기본    컨 스 엔
	public 갤럭시() {

	}
	
	// 생성자 : 필수    알 쉬 s  o
	public 갤럭시(String 화면, String 통신사, String 성능, int android) {
		super(화면, 통신사, 성능);
		this.android = android;
	}
	
	@Override
	// @Override toString        alt shift s s 
	public String toString() {
		return "갤럭시 버전 : " + android + " / " + super.toString();
	}
	

	
	
}