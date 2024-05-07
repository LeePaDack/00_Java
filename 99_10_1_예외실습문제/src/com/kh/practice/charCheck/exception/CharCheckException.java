package com.kh.practice.charCheck.exception;
	//   Exception 을 상속받아 개발자가 원하는 예외 상황을 만들 수 있음
public class CharCheckException extends Exception {
	
	// 기본생성자
	public CharCheckException() {
		super();
	}
	
	// 필수생성자
	public CharCheckException(String msg) {
		super(msg);
	}
	
	
	
	
	
	
	
}
