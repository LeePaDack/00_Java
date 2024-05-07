package com.kh.inheritance.OverrideEX;

public class 소 extends 동물 {

	public 소(String 이름) {
		super(이름);
	}
	 // 동뭄릐 소리를 가져와서 소 소리로 변경
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 음메 소리를 냅니다.");
	}
}
