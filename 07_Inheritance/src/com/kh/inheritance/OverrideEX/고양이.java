package com.kh.inheritance.OverrideEX;

public class 고양이 extends 동물{
// 메서드
	// 생성자
	public 고양이(String 이름) {
		super(이름);
	}
	 // 동뭄릐 소리를 가져와서 고양이 소리로 변경
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 야옹 소리를 냅니다.");
	}
	
}
